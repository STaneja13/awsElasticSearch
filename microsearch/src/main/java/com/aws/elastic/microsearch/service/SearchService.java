package com.aws.elastic.microsearch.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.elastic.microsearch.model.SearchModel;
import com.aws.elastic.microsearch.query.SearchQuery;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SearchService {
	
	 private RestHighLevelClient client;
	 private ObjectMapper objectMapper;
	 private SearchQuery searchQuery;
	 
	 @Autowired
	 public SearchService(RestHighLevelClient client, ObjectMapper objectMapper) {
	     this.client = client;
	     this.objectMapper = objectMapper;
	 }
	 
	 @Autowired
	 public void setSearchQuery(SearchQuery searchQuery) {
		this.searchQuery = searchQuery;
	 }

	 
	 public List<SearchModel> searchByKeywords(BoolQueryBuilder multiMatchQuery) throws Exception {

		    SearchRequest searchRequest = new SearchRequest();
	        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

	        searchSourceBuilder.query(multiMatchQuery);
	        searchRequest.source(searchSourceBuilder);

	        SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);
	        
	        return getSearchResult(response);
	  }
	 


	private List<SearchModel> getSearchResult(SearchResponse response) {

	        SearchHit[] searchHit = response.getHits().getHits();

	        List<SearchModel> searchResults = new ArrayList<>();

	        for (SearchHit hit : searchHit){
	        	searchResults
	                    .add(objectMapper
	                            .convertValue(hit
	                                    .getSourceAsMap(), SearchModel.class));
	        }

	        return searchResults;
	    }
	 
	 
	 public List<SearchModel> fetchRecordsFromElasticSearch(Map<String,String> searchableKeywords){
		 List<SearchModel> searchableRecords = new ArrayList<SearchModel>();
		 BoolQueryBuilder multiMatchQuery = searchQuery.buildSearchableKeywordsQuery(searchableKeywords);
		 try {
			searchableRecords = searchByKeywords(multiMatchQuery);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return searchableRecords;
	}
	 
	
}

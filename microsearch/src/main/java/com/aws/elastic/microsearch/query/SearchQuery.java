package com.aws.elastic.microsearch.query;

import java.util.Map;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.stereotype.Service;

@Service
public class SearchQuery {
	

	public BoolQueryBuilder buildSearchableKeywordsQuery(Map<String,String> searchableKeywords) {
				
		BoolQueryBuilder boolQuery = new BoolQueryBuilder();
		for (Map.Entry<String, String> entry : searchableKeywords.entrySet()){
		    boolQuery.must(QueryBuilders.matchQuery(entry.getKey(), entry.getValue()));
		}
		
		
		return boolQuery;
	}
	
		   
	
}

package com.aws.elastic.microsearch.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aws.elastic.microsearch.model.SearchModel;

import com.aws.elastic.microsearch.service.SearchService;



@RestController
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	
	@GetMapping("/searchRecords/plan/{planName}/sponsor/{sponsorName}/state/{sponsorState}")
	public List<SearchModel> getElasticSearchRecordsByPlanSponorAndState(@PathVariable String planName,@PathVariable String sponsorName,@PathVariable String sponsorState) throws Exception{
		List<SearchModel> resultset = new ArrayList<SearchModel>();
		Map<String, String> searchableKeywords = new HashMap<String, String>();
		if(planName!=null) {
			searchableKeywords.put("PLAN_NAME", planName);
		}
		if(sponsorName!=null) {
			searchableKeywords.put("SPONSOR_DFE_NAME", sponsorName);
		}
		if(sponsorState!=null) {
			searchableKeywords.put("SPONS_DFE_MAIL_US_STATE", sponsorState);
		}
		
		if(searchableKeywords.size()>0) {
			resultset = searchService.fetchRecordsFromElasticSearch(searchableKeywords);
		}
		
		return resultset;
	}
	
	@GetMapping("/test123")
	public String getest(){
		return "success";
	}
	
	
	
	
}

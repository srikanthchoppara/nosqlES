package my.learning.exercise.hsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.learning.exercise.hsearch.api.FmEventDBApi;
import my.learning.exercise.hsearch.model.correlator.EventDataResultSet;
import my.learning.exercise.hsearch.model.filters.Filter;
import my.learning.exercise.hsearch.service.EventsDBService;

@Component
@RestController
@RequestMapping("/v1.0/fmdb/events")
public class FmEventDBApiController implements FmEventDBApi {
	

	@Autowired
	private EventDataResultSet eventDataResultSet;
	
	@Autowired
	private EventsDBService eventsDBService;
	
	//Get method to fetch all events from DB
	@GetMapping("/allEvents")
	public EventDataResultSet getAllEvents() {
		return eventsDBService.getAllEvents();
	}
	
	@PostMapping("/filteredEvents")
	public EventDataResultSet getFilteredEvents(@RequestBody Filter filterData) {
		return eventsDBService.getFilteredData(filterData);
		
	}
	
	@PostMapping("/fetchFilterData")
	public Filter fetchFilterData(@RequestBody Filter filter) {
		eventsDBService.getFilterData(filter);
		return filter;
	}
	
	@PostMapping("/delete")
	public int deleteEvents(@RequestBody Filter filterData) {
		return eventsDBService.delete(filterData);
	}

}

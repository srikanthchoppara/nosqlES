package my.learning.exercise.hsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.learning.exercise.hsearch.api.FmEventHistoryApi;
import my.learning.exercise.hsearch.model.correlator.HistoryEventDataResultSet;
import my.learning.exercise.hsearch.model.filters.HistoryEventFilters;
import my.learning.exercise.hsearch.service.EventHistoryService;



@Component
@RestController
@RequestMapping("/v1.0/fmdb/history")
public class FmEventHistoryApiController implements FmEventHistoryApi {
	
	@Autowired
	private EventHistoryService eventHistoryService;
	
	@PostMapping("/event-history")
	public HistoryEventDataResultSet getEventHistory(@RequestBody HistoryEventFilters historyEventFilters) {
		return eventHistoryService.getEventHistory(historyEventFilters);
	}

	@PostMapping("/event-history/filter-data")
	public HistoryEventFilters getHistoryEventFilterData(@RequestBody HistoryEventFilters historyEventFilters) {
		return eventHistoryService.getHistoryEventFilters(historyEventFilters);
	}

	@Override
	@PostMapping("/delete")
	public int deleteEvents(@RequestBody HistoryEventFilters historyEventFilters) {
		return eventHistoryService.delete(historyEventFilters);
	}
}

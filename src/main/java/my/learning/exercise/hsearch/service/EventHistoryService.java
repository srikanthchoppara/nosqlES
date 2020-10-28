package my.learning.exercise.hsearch.service;

import org.springframework.context.annotation.Configuration;

import my.learning.exercise.hsearch.model.correlator.HistoryEventDataResultSet;
import my.learning.exercise.hsearch.model.filters.HistoryEventFilters;

@Configuration
public interface EventHistoryService {
	
	public HistoryEventDataResultSet getEventHistory(HistoryEventFilters historyEventFilters);
	
	public HistoryEventFilters getHistoryEventFilters(HistoryEventFilters historyEventFilters);

    public int delete(HistoryEventFilters historyEventFilters);
}

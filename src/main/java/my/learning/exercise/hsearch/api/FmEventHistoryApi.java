package my.learning.exercise.hsearch.api;

import org.springframework.stereotype.Component;

import my.learning.exercise.hsearch.model.correlator.HistoryEventDataResultSet;
import my.learning.exercise.hsearch.model.filters.HistoryEventFilters;

@Component
public interface FmEventHistoryApi {
	
	public HistoryEventDataResultSet getEventHistory(HistoryEventFilters historyEventFilters);
	
	public HistoryEventFilters getHistoryEventFilterData(HistoryEventFilters historyEventFilters);

	public int deleteEvents(HistoryEventFilters historyEventFilters);

}

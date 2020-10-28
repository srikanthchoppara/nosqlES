package my.learning.exercise.hsearch.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import my.learning.exercise.hsearch.model.correlator.HistoryEventDataResultSet;
import my.learning.exercise.hsearch.model.filters.HistoryEventFilters;


@Repository
@Configuration
public interface FmHistoryEventDAO {
	
    public HistoryEventDataResultSet getEventHistory(HistoryEventFilters historyEventFilters);
	
	public HistoryEventFilters getHistoryEventFilters(HistoryEventFilters historyEventFilters);

    public int delete(HistoryEventFilters historyEventFilters);
}

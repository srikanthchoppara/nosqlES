package my.learning.exercise.hsearch.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import my.learning.exercise.hsearch.model.correlator.EventDataResultSet;
import my.learning.exercise.hsearch.model.filters.Filter;


@Repository
@Configuration
public interface FmEventsDAO {
	
	public EventDataResultSet getAllEvents();
	
	public EventDataResultSet getFilteredData(Filter filterData);
	
	public void getFilterData(Filter filter);

	public int delete(Filter filter);
	
}

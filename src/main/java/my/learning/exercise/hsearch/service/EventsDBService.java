package my.learning.exercise.hsearch.service;

import org.springframework.context.annotation.Configuration;

import my.learning.exercise.hsearch.model.correlator.EventDataResultSet;
import my.learning.exercise.hsearch.model.filters.Filter;



@Configuration
public interface EventsDBService {
	
	public EventDataResultSet getAllEvents();
	
	public EventDataResultSet getFilteredData(Filter filterData);
	
	public void getFilterData(Filter filter);

	public int delete(Filter filterData);

}

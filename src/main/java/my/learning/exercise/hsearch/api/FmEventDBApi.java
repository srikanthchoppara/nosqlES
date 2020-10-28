package my.learning.exercise.hsearch.api;

import org.springframework.stereotype.Component;

import my.learning.exercise.hsearch.model.correlator.EventDataResultSet;
import my.learning.exercise.hsearch.model.filters.Filter;


@Component
public interface FmEventDBApi {
	
	public EventDataResultSet getAllEvents();
	
	public EventDataResultSet getFilteredEvents(Filter filterData);
	
	public Filter fetchFilterData(Filter filter);

	public int deleteEvents(Filter filterData);

}

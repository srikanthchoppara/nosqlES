package my.learning.exercise.hsearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import my.learning.exercise.hsearch.dao.FmEventsDAO;
import my.learning.exercise.hsearch.model.correlator.EventDataResultSet;
import my.learning.exercise.hsearch.model.filters.Filter;



@Service
@Configuration
public class EventsDBServiceImpl implements EventsDBService {
	
	@Autowired
	private FmEventsDAO fmEventsDaoImpl;

	public EventsDBServiceImpl() {
	}
	
	public EventsDBServiceImpl(FmEventsDAO fmEventsDaoImpl) {
		this.fmEventsDaoImpl = fmEventsDaoImpl;
	}
	
	public void getFilterData(Filter filter) {
	    fmEventsDaoImpl.getFilterData(filter);
	}
	
	@Override
	public EventDataResultSet getAllEvents() {
		return fmEventsDaoImpl.getAllEvents();
	}
	
	@Override
	public EventDataResultSet getFilteredData(Filter filterData) {
		return fmEventsDaoImpl.getFilteredData(filterData);
	}

	@Override
	public int delete (Filter filterData) { return fmEventsDaoImpl.delete(filterData);}

}

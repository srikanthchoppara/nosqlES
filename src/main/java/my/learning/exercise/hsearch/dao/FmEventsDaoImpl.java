package my.learning.exercise.hsearch.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.search.engine.search.query.SearchResult;
import org.hibernate.search.mapper.orm.Search;
import org.hibernate.search.mapper.orm.session.SearchSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import my.learning.exercise.hsearch.model.correlator.DbBasedCorrelatedEvent;
import my.learning.exercise.hsearch.model.correlator.EventDataResultSet;
import my.learning.exercise.hsearch.model.filters.Filter;


@Repository
@Component
@Transactional
public class FmEventsDaoImpl implements FmEventsDAO {

	int totalClearedCount = 0;
	int totalIndeterminateCount = 0;
	int totalWarningCount = 0;
	int totalMinorCount = 0;
	int totalMajorCount = 0;
	int totalCriticalCount = 0;
	
	int uniqClearedCount = 0;
	int uniqIndeterminateCount = 0;
	int uniqWarningCount = 0;
	int uniqMinorCount = 0;
	int uniqMajorCount = 0;
	int uniqCriticalCount = 0;
	
	private EventDataResultSet eventDataResultSet;
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	public FmEventsDaoImpl(EventDataResultSet eventDataResultSet) {
		this.eventDataResultSet = eventDataResultSet;
	}
	
	@Override
	public EventDataResultSet getAllEvents() {
		List<DbBasedCorrelatedEvent> activeEvents = new ArrayList<DbBasedCorrelatedEvent>();
		
		SearchSession searchSession = Search.session(entityManager);
		SearchResult<DbBasedCorrelatedEvent> activeEventResultSet = searchSession.search(DbBasedCorrelatedEvent.class).where(f -> f.matchAll()).fetchAll();
		activeEvents = activeEventResultSet.hits();
		activeEvents.stream().peek(event -> {
			switch(event.getSeverity()) {
			case 0:
				totalClearedCount += totalClearedCount + event.getCount();
				uniqClearedCount++;
				break;
			case 1:
				totalIndeterminateCount += totalIndeterminateCount + event.getCount();
				uniqClearedCount++;
				break;
			case 2:
				totalWarningCount += totalWarningCount + event.getCount();
				uniqWarningCount++;
				break;
			case 3:
				totalMinorCount += totalMinorCount + event.getCount();
				uniqMinorCount++;
				break;
			case 4:
				totalMajorCount += totalMajorCount + event.getCount();
				uniqMajorCount++;
				break;
			case 5:
				totalCriticalCount += totalCriticalCount + event.getCount();
				uniqCriticalCount++;
				break;
			}
		});
		eventDataResultSet.setDbBasedCorrelatedEventsList(activeEvents);
		
		
		return eventDataResultSet;
	}

	@Override
	public EventDataResultSet getFilteredData(Filter filterData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getFilterData(Filter filter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delete(Filter filter) {
		// TODO Auto-generated method stub
		return 0;
	}

}

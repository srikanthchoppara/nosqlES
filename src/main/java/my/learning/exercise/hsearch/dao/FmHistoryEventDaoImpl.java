package my.learning.exercise.hsearch.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import my.learning.exercise.hsearch.model.correlator.HistoryEventDataResultSet;
import my.learning.exercise.hsearch.model.filters.HistoryEventFilters;

@Repository
@Component
public class FmHistoryEventDaoImpl implements FmHistoryEventDAO {

	@Override
	public HistoryEventDataResultSet getEventHistory(HistoryEventFilters historyEventFilters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistoryEventFilters getHistoryEventFilters(HistoryEventFilters historyEventFilters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(HistoryEventFilters historyEventFilters) {
		// TODO Auto-generated method stub
		return 0;
	}

}

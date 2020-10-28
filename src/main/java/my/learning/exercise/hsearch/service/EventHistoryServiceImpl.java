package my.learning.exercise.hsearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import my.learning.exercise.hsearch.dao.FmHistoryEventDAO;
import my.learning.exercise.hsearch.model.correlator.HistoryEventDataResultSet;
import my.learning.exercise.hsearch.model.filters.HistoryEventFilters;


@Configuration
public class EventHistoryServiceImpl implements EventHistoryService {
	
	@Autowired
	private FmHistoryEventDAO fmHistoryEventDao;

	@Override
	public HistoryEventDataResultSet getEventHistory(HistoryEventFilters historyEventFilters) {
		return fmHistoryEventDao.getEventHistory(historyEventFilters);
	}

	@Override
	public HistoryEventFilters getHistoryEventFilters(HistoryEventFilters historyEventFilters) {
		return fmHistoryEventDao.getHistoryEventFilters(historyEventFilters);
	}

	@Override
	public int delete(HistoryEventFilters historyEventFilters) {
		return fmHistoryEventDao.delete(historyEventFilters);
	}

}

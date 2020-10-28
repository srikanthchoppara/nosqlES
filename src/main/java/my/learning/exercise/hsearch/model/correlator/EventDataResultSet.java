package my.learning.exercise.hsearch.model.correlator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventDataResultSet {
	
	private List<DbBasedCorrelatedEvent> dbBasedCorrelatedEventsList;
	
	private SeveritiesCount totalSeveritiesCount;
	
	private SeveritiesCount uniqueSeveritiesCount;

	public List<DbBasedCorrelatedEvent> getDbBasedCorrelatedEventsList() {
		return dbBasedCorrelatedEventsList;
	}

	public void setDbBasedCorrelatedEventsList(List<DbBasedCorrelatedEvent> dbBasedCorrelatedEventsList) {
		this.dbBasedCorrelatedEventsList = dbBasedCorrelatedEventsList;
	}

	public SeveritiesCount getTotalSeveritiesCount() {
		return totalSeveritiesCount;
	}

	public void setTotalSeveritiesCount(SeveritiesCount totalSeveritiesCount) {
		this.totalSeveritiesCount = totalSeveritiesCount;
	}

	public SeveritiesCount getUniqueSeveritiesCount() {
		return uniqueSeveritiesCount;
	}

	public void setUniqueSeveritiesCount(SeveritiesCount uniqueSeveritiesCount) {
		this.uniqueSeveritiesCount = uniqueSeveritiesCount;
	}

	@Autowired
	public EventDataResultSet(List<DbBasedCorrelatedEvent> dbBasedCorrelatedEventsList,
			SeveritiesCount totalSeveritiesCount, SeveritiesCount uniqueSeveritiesCount) {
		this.dbBasedCorrelatedEventsList = dbBasedCorrelatedEventsList;
		this.totalSeveritiesCount = totalSeveritiesCount;
		this.uniqueSeveritiesCount = uniqueSeveritiesCount;
	}
	
}

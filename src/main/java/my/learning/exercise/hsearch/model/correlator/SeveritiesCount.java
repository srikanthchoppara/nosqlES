package my.learning.exercise.hsearch.model.correlator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeveritiesCount {
	
	private  int severity;
	
	private long sum;
	
	private long count;

	private long clearedCount;
	
	private long interminateCount;
	
	private long warningCount;
	
	private long minorCount;
	
	private long majorCount;
	
	private long criticalCount;
	
	public long getClearedCount() {
		return clearedCount;
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public void setClearedCount(long clearedCount) {
		this.clearedCount = clearedCount;
	}

	public long getInterminateCount() {
		return interminateCount;
	}

	public void setInterminateCount(long interminateCount) {
		this.interminateCount = interminateCount;
	}

	public long getWarningCount() {
		return warningCount;
	}

	public void setWarningCount(long warningCount) {
		this.warningCount = warningCount;
	}

	public long getMinorCount() {
		return minorCount;
	}

	public void setMinorCount(long minorCount) {
		this.minorCount = minorCount;
	}

	public long getMajorCount() {
		return majorCount;
	}

	public void setMajorCount(long majorCount) {
		this.majorCount = majorCount;
	}

	public long getCriticalCount() {
		return criticalCount;
	}

	public void setCriticalCount(long criticalCount) {
		this.criticalCount = criticalCount;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	
	public SeveritiesCount(long clearedCount, long interminateCount, long warningCount, long minorCount,
			long majorCount, long criticalCount) {
		this.clearedCount = clearedCount;
		this.interminateCount = interminateCount;
		this.warningCount = warningCount;
		this.minorCount = minorCount;
		this.majorCount = majorCount;
		this.criticalCount = criticalCount;
	}

	@Autowired
	public SeveritiesCount() {
	}
	
}

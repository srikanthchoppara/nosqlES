package my.learning.exercise.hsearch.model.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class HistoryEventFilters {
	
	private List<String> eventName = new ArrayList<String>();
    private List<Severity> severity = new ArrayList<Severity>();
	private List<Integer> type = new ArrayList<Integer>();
    private List<String> node = new ArrayList<String>();
    private List<String> nodeIds = new ArrayList<String>();
    private List<String> fields = new ArrayList<String>();
    private String sortBy = null;
    private SortOrder sortOrder = null;
    private int pageNum = 0;
    private int pageSize = 0;
    
    private long startTime = 0L;
    private long endTime = 0L;
    
    public enum Severity {
		CLEARED,
	    INDETERMINATE, 
	    WARNING, 
	    MINOR, 
	    MAJOR, 
	    CRITICAL
	}
	
	public enum SortOrder {
		ASCENDING,
		ASC,
		DESCENDING,
		DESC
	}
	
	
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public List<String> getEventName() {
		return eventName;
	}
	public void setEventName(List<String> eventName) {
		this.eventName = eventName;
	}
	public List<Severity> getSeverity() {
		return severity;
	}
	public void setSeverity(List<Severity> severity) {
		this.severity = severity;
	}
	public List<Integer> getType() {
		return type;
	}
	public void setType(List<Integer> type) {
		this.type = type;
	}
	public List<String> getNode() {
		return node;
	}
	public void setNode(List<String> node) {
		this.node = node;
	}
	
    
	public List<String> getNodeIds() {
		return nodeIds;
	}
	public void setNodeIds(List<String> nodeIds) {
		this.nodeIds = nodeIds;
	}
	public String getSortBy() {
		return sortBy;
	}
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	public SortOrder getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    HistoryEventFilters filterData = (HistoryEventFilters) o;
	    return Objects.equals(eventName, filterData.eventName) &&
	        Objects.equals(severity, filterData.severity) &&
	        Objects.equals(type, filterData.type) &&
	        Objects.equals(node, filterData.node);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(eventName, severity, type, node);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class FilterData {\n");
	    
	    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
	    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
	    sb.append("    type: ").append(toIndentedString(type)).append("\n");
	    sb.append("    node: ").append(toIndentedString(node)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }

}

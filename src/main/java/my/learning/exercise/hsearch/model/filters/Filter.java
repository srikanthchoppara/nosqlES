package my.learning.exercise.hsearch.model.filters;

import java.util.List;

public class Filter {
	
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
	
	private List<String> deviceNames;
    private List<Severity> severities;
    private List<String> deviceTypes;
    private List<String> reqColumns;
    private List<String> deviceID;
    private List<Boolean> ack;
    private List<String> owners;
    private List<String> sequenceIds;
    
    public List<String> getSequenceIds() {
		return sequenceIds;
	}
	public void setSequenceIds(List<String> sequenceIds) {
		this.sequenceIds = sequenceIds;
	}
	public List<String> getOwners() {
		return owners;
	}
	public void setOwners(List<String> owners) {
		this.owners = owners;
	}

	private boolean getSeverityStatsAlone;
    
    public boolean isGetSeverityStatsAlone() {
		return getSeverityStatsAlone;
	}
	public void setGetSeverityStatsAlone(boolean getSeverityStatsAlone) {
		this.getSeverityStatsAlone = getSeverityStatsAlone;
	}
	public List<Boolean> getAck() {
		return ack;
	}
	public void setAck(List<Boolean> ack) {
		this.ack = ack;
	}
	public List<String> getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(List<String> deviceID) {
		this.deviceID = deviceID;
	}

	private String sortBy;
    private SortOrder sortOrder;
    private int pageNum;
    private int pageSize;
    private boolean isUnique;
    
	public boolean isUnique() {
		return isUnique;
	}
	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}
	public List<String> getDeviceNames() {
		return deviceNames;
	}
	public void setDeviceNames(List<String> deviceNames) {
		this.deviceNames = deviceNames;
	}
	public List<Severity> getSeverities() {
		return severities;
	}
	public void setSeverities(List<Severity> severities) {
		this.severities = severities;
	}
	public List<String> getDeviceTypes() {
		return deviceTypes;
	}
	public void setDeviceTypes(List<String> deviceTypes) {
		this.deviceTypes = deviceTypes;
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
	public List<String> getReqColumns() {
		return reqColumns;
	}
	public void setReqColumns(List<String> reqColumns) {
		this.reqColumns = reqColumns;
	}
	public Filter() {
    	
    }
    
    public Filter(List<String> deviceNames, List<Severity> severities, List<String> deviceTypes, List<String> owners, List<Boolean> ack, String sortBy, SortOrder sortOrder, int pageNum, int pageSize) {
    	this.deviceNames = deviceNames;
    	this.severities = severities;
    	this.deviceTypes = deviceTypes;
    	this.owners = owners;
    	this.ack = ack;
    	this.sortBy = sortBy;
    	this.sortOrder = sortOrder;
    	this.pageNum = pageNum;
    	this.pageSize = pageSize;
    }

}

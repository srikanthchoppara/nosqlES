package my.learning.exercise.hsearch.model.correlator;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.search.mapper.pojo.mapping.definition.annotation.DocumentId;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.stereotype.Component;


@Entity
@Indexed(index="active_events")
@Table(name="active_events", schema="fm")
@Component
public class DbBasedCorrelatedEvent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@Column(name="event_id")
	@Field
    private String eventId;
	
	//@Column(name="event_name")
	@Field
    private String eventName;
	
	//@Column(name="type")
	@Field
    private Integer type;
	
	//@Column(name="protocol")
	@Field
    private String protocol;
	
	//@Column(name="version")
	@Field
    private Integer version;
	
	//@Column(name="device_id")
	@Field
    private String deviceId;
	
	//@Column(name="device_type")
	@Field
    private String deviceType;
	
	//@Column(name="event_key")
	@Field
    private String eventKey;
	
	//@Column(name="event_group")
	@Field
    private String eventGroup;
	
	//@Column(name="event_time")
	@Field
    private Long eventTime;
	
	
	//@Column(name="summary")
	@Field
    private String summary;
	
	//@Column(name="severity")
    private Integer severity;
	
	//@Column(name="event_class")
	@Field
    private String eventClass;
	
	//@Column(name="ack")
	@Field
    private boolean ack;
	
	//@Column(name="last_occurrence")
	@Field
    private Long lastOccurrence;
	
	//@Column(name="first_occurrence")
	@Field
    private Long firstOccurrence;
	
	//@Column(name="count")
	@Field
    private int count;
	
	//@Column(name="ack_timestamp")
	@Field
    private Long ackTimestamp;
	
	//@Column(name="cancelled_timestamp")
	@Field
    private Long cancelledTimestamp;
	
	//@Column(name="acked_by")
	@Field
    private String ackedBy;
	
	//@Column(name="event_sourceip")
	@Field
    private String eventSourceIP;
	
	//@Column(name="varbind_list")
	@Field
    private String varbindList;
	
	//@Column(name="spec")
	@Field
    private String spec;
	
	//@Column(name="var_bind")
	@Field
    private String varBind;
	
	//@Column(name="oid_var_bind")
    private String oidVarBinds;
	
	//@Column(name="additional_info")
	@Field
    private String additionalInfo;
	
	@Id
	@DocumentId
	//@Column(name="sequence_id")
	@Field
    private String sequenceId;
	
	//@Column(name="time_to_cancel")
	@Field
    private long timeToCancel;
	
	//@Column(name="device_name")
	@Field
    private String deviceName;
	
	//@Column(name="primaryip")
	@Field
    private String primaryIP;
	
	//@Column(name="cancelledBy")
	@Field
    private String cancelledBy = "NA";
	
	//@Column(name="owner")
	private String owner;
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	//@Column(name="journalEntries")
	@Field
	private String journalEntries;
	
	
	public String getJournalEntries() {
		return journalEntries;
	}

	public void setJournalEntries(String journalEntries) {
		this.journalEntries = journalEntries;
	}

	public String getEventID() {
		return eventId;
	}

	public void setEventID(String eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getDeviceID() {
		return deviceId;
	}

	public void setDeviceID(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public String getEventGroup() {
		return eventGroup;
	}

	public void setEventGroup(String eventGroup) {
		this.eventGroup = eventGroup;
	}

	public Long getEventTime() {
		return eventTime;
	}

	public void setEventTime(Long eventTime) {
		this.eventTime = eventTime;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getSeverity() {
		return severity;
	}

	public void setSeverity(Integer severity) {
		this.severity = severity;
	}

	public String getEventClass() {
		return eventClass;
	}

	public void setEventClass(String eventClass) {
		this.eventClass = eventClass;
	}

	public boolean isAck() {
		return ack;
	}

	public void setAck(boolean ack) {
		this.ack = ack;
	}

	public Long getLastOccurrence() {
		return lastOccurrence;
	}

	public void setLastOccurrence(Long lastOccurrence) {
		this.lastOccurrence = lastOccurrence;
	}

	public Long getFirstOccurrence() {
		return firstOccurrence;
	}

	public void setFirstOccurrence(Long firstOccurrence) {
		this.firstOccurrence = firstOccurrence;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Long getAckTimestamp() {
		return ackTimestamp;
	}

	public void setAckTimestamp(Long ackTimestamp) {
		this.ackTimestamp = ackTimestamp;
	}

	public Long getCancelledTimestamp() {
		return cancelledTimestamp;
	}

	public void setCancelledTimestamp(Long cancelledTimestamp) {
		this.cancelledTimestamp = cancelledTimestamp;
	}

	public String getAckedBy() {
		return ackedBy;
	}

	public void setAckedBy(String ackedBy) {
		this.ackedBy = ackedBy;
	}

	public String getEventSourceIP() {
		return eventSourceIP;
	}

	public void setEventSourceIP(String eventSourceIP) {
		this.eventSourceIP = eventSourceIP;
	}

	public String getVarbindList() {
		return varbindList;
	}

	public void setVarbindList(String varbindList) {
		this.varbindList = varbindList;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getVarBind() {
		return varBind;
	}

	public void setVarBind(String varBind) {
		this.varBind = varBind;
	}

	public String getOidVarBinds() {
		return oidVarBinds;
	}

	public void setOidVarBinds(String oidVarBinds) {
		this.oidVarBinds = oidVarBinds;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}

	public long getTimeToCancel() {
		return timeToCancel;
	}

	public void setTimeToCancel(long timeToCancel) {
		this.timeToCancel = timeToCancel;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getPrimaryIP() {
		return primaryIP;
	}

	public void setPrimaryIP(String primaryIP) {
		this.primaryIP = primaryIP;
	}

	public String getCancelledBy() {
		return cancelledBy;
	}

	public void setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
	}
	
	public DbBasedCorrelatedEvent() {
    }

    public String toString() {
        return "EventData{eventId='" + this.eventId + '\'' + ", eventName='" + this.eventName + '\'' + ", type=" + this.type + ", protocol='" + this.protocol + '\'' + ", version=" + this.version + ", deviceId='" + this.deviceId + '\'' + ", deviceType='" + this.deviceType + '\'' + ", eventKey='" + this.eventKey + '\'' + ", eventGroup='" + this.eventGroup + '\'' + ", eventTime=" + this.eventTime + ", summary='" + this.summary + '\'' + ", severity=" + this.severity + ", eventClass='" + this.eventClass + '\'' + ", ack=" + this.ack + ", lastOccurrence=" + this.lastOccurrence + ", firstOccurrence=" + this.firstOccurrence + ", count=" + this.count + ", ackTimestamp=" + this.ackTimestamp + ", cancelledTimestamp=" + this.cancelledTimestamp + ", ackedBy='" + this.ackedBy + '\'' + ", eventSourceIP='" + this.eventSourceIP + '\'' + ", varbindList='" + this.varbindList + '\'' + ", spec='" + this.spec + '\'' + ", varBind='" + this.varBind + '\'' + ", oidVarBinds='" + this.oidVarBinds + '\'' + ", additionalInfo='" + this.additionalInfo + '\'' + ", sequenceId='" + this.sequenceId + '\'' + ", timeToCancel=" + this.timeToCancel + ", deviceName='" + this.deviceName + '\'' + ", primaryIP='" + this.primaryIP + '\'' + ", cancelledBy='" + this.cancelledBy + '\'' + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
           return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            DbBasedCorrelatedEvent that = (DbBasedCorrelatedEvent)o;
            return this.ack == that.ack && this.count == that.count && this.timeToCancel == that.timeToCancel && Objects.equals(this.eventId, that.eventId) && Objects.equals(this.eventName, that.eventName) && Objects.equals(this.type, that.type) && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.version, that.version) && Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.deviceType, that.deviceType) && Objects.equals(this.eventKey, that.eventKey) && Objects.equals(this.eventGroup, that.eventGroup) && Objects.equals(this.eventTime, that.eventTime) && Objects.equals(this.summary, that.summary) && Objects.equals(this.severity, that.severity) && Objects.equals(this.eventClass, that.eventClass) && Objects.equals(this.lastOccurrence, that.lastOccurrence) && Objects.equals(this.firstOccurrence, that.firstOccurrence) && Objects.equals(this.ackTimestamp, that.ackTimestamp) && Objects.equals(this.cancelledTimestamp, that.cancelledTimestamp) && Objects.equals(this.ackedBy, that.ackedBy) && Objects.equals(this.eventSourceIP, that.eventSourceIP) && Objects.equals(this.varbindList, that.varbindList) && Objects.equals(this.spec, that.spec) && Objects.equals(this.varBind, that.varBind) && Objects.equals(this.oidVarBinds, that.oidVarBinds) && Objects.equals(this.additionalInfo, that.additionalInfo) && Objects.equals(this.sequenceId, that.sequenceId) && Objects.equals(this.deviceName, that.deviceName) && Objects.equals(this.primaryIP, that.primaryIP) && Objects.equals(this.cancelledBy, that.cancelledBy);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.eventId, this.eventName, this.type, this.protocol, this.version, this.deviceId, this.deviceType, this.eventKey, this.eventGroup, this.eventTime, this.summary, this.severity, this.eventClass, this.ack, this.lastOccurrence, this.firstOccurrence, this.count, this.ackTimestamp, this.cancelledTimestamp, this.ackedBy, this.eventSourceIP, this.varbindList, this.spec, this.varBind, this.oidVarBinds, this.additionalInfo, this.sequenceId, this.timeToCancel, this.deviceName, this.primaryIP, this.cancelledBy});
    }

    public DbBasedCorrelatedEvent(String eventId, String eventName, Integer type, String protocol, Integer version, String deviceId, String deviceType, String eventKey, String eventGroup, Long eventTime, String summary, Integer severity, String eventClass, boolean ack, Long lastOccurrence, Long firstOccurrence, int count, Long ackTimestamp, Long cancelledTimestamp, String ackedBy, String eventSourceIP, String varbindList, String spec, String varBind, String oidVarBinds, String additionalInfo, String sequenceId, long timeToCancel, String deviceName, String primaryIP, String cancelledBy) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.type = type;
        this.protocol = protocol;
        this.version = version;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.eventKey = eventKey;
        this.eventGroup = eventGroup;
        this.eventTime = eventTime;
        this.summary = summary;
        this.severity = severity;
        this.eventClass = eventClass;
        this.ack = ack;
        this.lastOccurrence = lastOccurrence;
        this.firstOccurrence = firstOccurrence;
        this.count = count;
        this.ackTimestamp = ackTimestamp;
        this.cancelledTimestamp = cancelledTimestamp;
        this.ackedBy = ackedBy;
        this.eventSourceIP = eventSourceIP;
        this.varbindList = varbindList;
        this.spec = spec;
        this.varBind = varBind;
        this.oidVarBinds = oidVarBinds;
        this.additionalInfo = additionalInfo;
        this.sequenceId = sequenceId;
        this.timeToCancel = timeToCancel;
        this.deviceName = deviceName;
        this.primaryIP = primaryIP;
        this.cancelledBy = cancelledBy;
        this.owner = owner;    
        this.journalEntries = journalEntries;
    }

}

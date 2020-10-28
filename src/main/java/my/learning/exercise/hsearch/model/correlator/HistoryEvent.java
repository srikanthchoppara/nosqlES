package my.learning.exercise.hsearch.model.correlator;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.search.mapper.pojo.mapping.definition.annotation.DocumentId;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.stereotype.Component;

@Entity
@Indexed(index="history_event")
//@Table(name="history_event", schema="fm")
@Component
public class HistoryEvent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    	
	@Column(name="eventName")
	@Field
    private String eventName;
	@Column(name="severity")
	@Field
    private Integer severity;
	@Column(name="type")
	@Field
    private int type;
	@Column(name="eventTime")
	@Field
    private Long eventTime;
	@Column(name="summary")
	@Field
    private String summary;
	
	@Column(name="event_id")
	@Field
	private String eventId;
	
   // @Column(name="deviceId")
    @Field
    private String deviceId;
    
   // @Column(name="deviceType")
    @Field
    private String deviceType;
    
   // @Column(name="deviceName")
    @Field
    private String deviceName;
    
    @Id
    @DocumentId
   // @Column(name="sequence_id")
    @Field
    private long sequenceId;

    public HistoryEvent(String eventName, Integer severity, int type, Long eventTime, String summary, String deviceId, String deviceType, String deviceName, long sequenceId) {
        this.eventName = eventName;
        this.severity = severity;
        this.type = type;
        this.eventTime = eventTime;
        this.summary = summary;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.sequenceId = sequenceId;
    }

    public HistoryEvent() {
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

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryEvent that = (HistoryEvent) o;
        return severity == that.severity &&
                type == that.type &&
                Objects.equals(eventName, that.eventName) &&
                Objects.equals(eventTime, that.eventTime) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(deviceType, that.deviceType) &&
                Objects.equals(deviceName, that.deviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, severity, type, eventTime, summary, deviceId, deviceType, deviceName);
    }

    @Override
    public String toString() {
        return "HistoryEvent{" +
                "eventName='" + eventName + '\'' +
                ", severity=" + severity +
                ", type=" + type +
                ", eventTime=" + eventTime +
                ", summary='" + summary + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", deviceName='" + deviceName + '\'' +
                '}';
    }

}
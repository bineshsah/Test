package edu.mumsched.schedule;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Schedule{
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	private String entryName;
	@NotEmpty
	private String scheduleGeneratedAt;
	@NotEmpty
	private String scheduleStatus;
	
	public Long getId() {
		return id;
	}
	
	public Schedule() {
		
	}

	public Schedule(String entryName, String scheduleGeneratedAt, String scheduleStatus) {

		this.entryName = entryName;
		this.scheduleGeneratedAt = scheduleGeneratedAt;
		this.scheduleStatus = scheduleStatus;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntryName() {
		return entryName;
	}
	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}
	public String getScheduleGeneratedAt() {
		return scheduleGeneratedAt;
	}
	public void setScheduleGeneratedAt(String scheduleGeneratedAt) {
		this.scheduleGeneratedAt = scheduleGeneratedAt;
	}
	public String getScheduleStatus() {
		return scheduleStatus;
	}
	public void setScheduleStatus(String scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", entryName=" + entryName + ", scheduleGeneratedAt=" + scheduleGeneratedAt
				+ ", scheduleStatus=" + scheduleStatus + "]";
	}
	

}

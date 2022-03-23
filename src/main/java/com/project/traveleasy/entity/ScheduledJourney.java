package com.project.traveleasy.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ScheduledJourney")
public class ScheduledJourney {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ScheduledJourneyID", nullable = false)
	private int ScheduledJourneyID;
	
	@Column(name="LocationSubsetToID", nullable = false)
	private String LocationSubsetToID;
	
	@Column(name="LocationSubsetFromID", nullable = false)
	private String LocationSubsetFromID;
	
	@Column(name="BusID", nullable = false)
	private String BusID;
	
	@Column(name="JourneyDate", nullable = true)
	private Date JourneyDate;
	
	@Column(name="JourneyTime", nullable = true)
	private Time JourneyTime;
	
	@Column(name="JourneyAmount", nullable = false)
	private String JourneyAmount;

	public ScheduledJourney(int scheduledJourneyID, String locationSubsetToID, String locationSubsetFromID,
			String busID, Date journeyDate, Time journeyTime, String journeyAmount) {
		super();
		ScheduledJourneyID = scheduledJourneyID;
		LocationSubsetToID = locationSubsetToID;
		LocationSubsetFromID = locationSubsetFromID;
		BusID = busID;
		JourneyDate = journeyDate;
		JourneyTime = journeyTime;
		JourneyAmount = journeyAmount;
	}

	public ScheduledJourney() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getScheduledJourneyID() {
		return ScheduledJourneyID;
	}

	public void setScheduledJourneyID(int scheduledJourneyID) {
		ScheduledJourneyID = scheduledJourneyID;
	}

	public String getLocationSubsetToID() {
		return LocationSubsetToID;
	}

	public void setLocationSubsetToID(String locationSubsetToID) {
		LocationSubsetToID = locationSubsetToID;
	}

	public String getLocationSubsetFromID() {
		return LocationSubsetFromID;
	}

	public void setLocationSubsetFromID(String locationSubsetFromID) {
		LocationSubsetFromID = locationSubsetFromID;
	}

	public String getBusID() {
		return BusID;
	}

	public void setBusID(String busID) {
		BusID = busID;
	}

	public Date getJourneyDate() {
		return JourneyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		JourneyDate = journeyDate;
	}

	public Time getJourneyTime() {
		return JourneyTime;
	}

	public void setJourneyTime(Time journeyTime) {
		JourneyTime = journeyTime;
	}

	public String getJourneyAmount() {
		return JourneyAmount;
	}

	public void setJourneyAmount(String journeyAmount) {
		JourneyAmount = journeyAmount;
	}

	@Override
	public String toString() {
		return "ScheduledJourney [ScheduledJourneyID=" + ScheduledJourneyID + ", LocationSubsetToID="
				+ LocationSubsetToID + ", LocationSubsetFromID=" + LocationSubsetFromID + ", BusID=" + BusID
				+ ", JourneyDate=" + JourneyDate + ", JourneyTime=" + JourneyTime + ", JourneyAmount=" + JourneyAmount
				+ "]";
	}

	
	
}

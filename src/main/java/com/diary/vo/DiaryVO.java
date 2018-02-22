package com.diary.vo;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class DiaryVO {
	private int id;
	private String title;
	private String content;
	private Timestamp created;
	private Date start_date;
	private Date end_date;
	private Time start_time;
	private Time end_time;
	private Timestamp alarm_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Time getStart_time() {
		return start_time;
	}

	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}

	public Time getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}

	public Timestamp getAlarm_time() {
		return alarm_time;
	}

	public void setAlarm_time(Timestamp alarm_time) {
		this.alarm_time = alarm_time;
	}

	@Override
	public String toString() {
		return "DiaryVO [id=" + id + ", title=" + title + ", content=" + content + ", created=" + created
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", start_time=" + start_time + ", end_time="
				+ end_time + ", alarm_time=" + alarm_time + "]";
	}

}

package com.foodzz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecipeDescription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int time;
	private String process;
	private String summary;
	private int serves;

	public RecipeDescription() {
	}
	

	public RecipeDescription(int time, String process, String summary, int serves) {
		this.time = time;
		this.process = process;
		this.summary = summary;
		this.serves = serves;
	}
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getServes() {
		return serves;
	}

	public void setServes(int serves) {
		this.serves = serves;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return String.format("RecipeDescription [time=%s, process=%s, summary=%s, serves=%s]", time, process, summary,
				serves);
	}

}

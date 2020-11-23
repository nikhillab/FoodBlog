package com.foodzz.form;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class RecipeForm {
	@NotNull
	private String title;
	@NotNull
	private String type;
	@NotNull
	private String summary;
	@NotNull
	private String time;
	@NotNull
	private String process;
	@NotNull
	private String ingredents;
	private String tags;
	@NotNull
	private int serves;

	public RecipeForm() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getIngredents() {
		return ingredents;
	}

	public void setIngredents(String ingredents) {
		this.ingredents = ingredents;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getServes() {
		return serves;
	}

	public void setServes(int serves) {
		this.serves = serves;
	}

	@Override
	public String toString() {
		return String.format("RecipeForm [name=%s, type=%s, summary=%s, time=%s, process=%s, ingredents=%s, tags=%s]",
				title, type, summary, time, process, ingredents, tags);
	}

}

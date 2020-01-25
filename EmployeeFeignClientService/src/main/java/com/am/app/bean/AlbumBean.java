package com.am.app.bean;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"userId",
"id",
"title"
})
public class AlbumBean {
	
	@JsonProperty("userId")
	private Integer userId;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String title;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("userId")
	public Integer getUserId() {
	return userId;
	}

	@JsonProperty("userId")
	public void setUserId(Integer userId) {
	this.userId = userId;
	}

	@JsonProperty("id")
	public Integer getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
	this.id = id;
	}

	@JsonProperty("title")
	public String getTitle() {
	return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
	this.title = title;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}

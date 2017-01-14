package org.skalka.jgiphy.data.internal;

import org.codehaus.jackson.annotate.JsonSetter;

public class ResponseMetadata {
	private Integer	status;
	private String	message;
	private String	responseId;
	
	public Integer getStatus() {
		return status;
	}
	
	@JsonSetter("status")
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	@JsonSetter("msg")
	public void setMessage(String message) {
		this.message = message;
	}

	public String getResponseId() {
		return responseId;
	}

	@JsonSetter("response_id")
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
}

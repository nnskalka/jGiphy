package org.skalka.jgiphy.data.internal;

import org.codehaus.jackson.annotate.JsonSetter;

public class ResponsePagination {
	private Integer	totalCount;
	private Integer	count;
	private Integer	offset;
	
	public Integer getTotalCount() {
		return totalCount;
	}
	
	@JsonSetter("total_count")
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	
	public Integer getCount() {
		return count;
	}
	
	@JsonSetter("count")
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public Integer getOffset() {
		return offset;
	}
	
	@JsonSetter("offset")
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
}

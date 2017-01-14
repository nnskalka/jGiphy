package org.skalka.jgiphy.responses;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonSetter;
import org.skalka.jgiphy.GiphyResponse;
import org.skalka.jgiphy.data.FullGifEntry;
import org.skalka.jgiphy.data.GifEntry;
import org.skalka.jgiphy.data.internal.ResponseMetadata;
import org.skalka.jgiphy.data.internal.ResponsePagination;

public class MultipleEntryGiphyResponse implements GiphyResponse {
	private List<FullGifEntry> entries;
	private ResponseMetadata meta;
	private ResponsePagination pagination;

	@Override
	public GifEntry getEntry(int index) {
		return this.entries.get(index);
	}

	@Override
	public GifEntry getRandomEntry() {
		int randomIndex = (int)(this.entries.size()*Math.random());
		return this.entries.get(randomIndex);
	}
	
	@JsonSetter("data")
	public void setEntries(ArrayList<FullGifEntry> entries) {
		this.entries = entries;
	}

	@Override
	public ResponseMetadata getMeta() {
		return meta;
	}

	@JsonSetter("meta")
	public void setMeta(ResponseMetadata meta) {
		this.meta = meta;
	}

	@Override
	public ResponsePagination getPagination() {
		return pagination;
	}

	@JsonSetter("pagination")
	public void setPagination(ResponsePagination pagination) {
		this.pagination = pagination;
	}
}

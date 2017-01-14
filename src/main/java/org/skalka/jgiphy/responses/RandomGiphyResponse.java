package org.skalka.jgiphy.responses;

import org.codehaus.jackson.annotate.JsonSetter;
import org.skalka.jgiphy.data.GifEntry;
import org.skalka.jgiphy.data.RandomGifEntry;
import org.skalka.jgiphy.data.internal.ResponseMetadata;
import org.skalka.jgiphy.data.internal.ResponsePagination;

public class RandomGiphyResponse {
	private RandomGifEntry entry;
	private ResponseMetadata meta;
	
	public GifEntry getEntry(int index) {
		return this.entry;
	}
	
	public GifEntry getRandomEntry() {
		return this.entry;
	}
	
	@JsonSetter("data")
	public void setEntries(RandomGifEntry entry) {
		this.entry = entry;
	}

	public ResponseMetadata getMeta() {
		return meta;
	}

	@JsonSetter("meta")
	public void setMeta(ResponseMetadata meta) {
		this.meta = meta;
	}

	public ResponsePagination getPagination() {
		return null;
	}
}

package org.skalka.jgiphy.internal.responses;

import java.util.Arrays;
import java.util.Iterator;

import org.codehaus.jackson.annotate.JsonSetter;
import org.skalka.jgiphy.GiphyResponse;
import org.skalka.jgiphy.internal.data.GifEntry;
import org.skalka.jgiphy.internal.data.RandomGifEntry;
import org.skalka.jgiphy.internal.data.ResponseMetadata;
import org.skalka.jgiphy.internal.data.ResponsePagination;

public class RandomGiphyResponse implements GiphyResponse {
	private RandomGifEntry entry;
	private ResponseMetadata meta;
	
	public GifEntry getEntry(int index) {
		return this.entry;
	}
	
	public GifEntry getRandomEntry() {
		return this.entry;
	}
	
	@Override
	public Iterator<GifEntry> getEntries() {
		return Arrays.asList((GifEntry)this.entry).iterator();
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

package org.skalka.jgiphy.internal.responses;

import java.util.Arrays;
import java.util.Iterator;

import org.codehaus.jackson.annotate.JsonSetter;
import org.skalka.jgiphy.GiphyResponse;
import org.skalka.jgiphy.internal.data.FullGifEntry;
import org.skalka.jgiphy.internal.data.GifEntry;
import org.skalka.jgiphy.internal.data.ResponseMetadata;
import org.skalka.jgiphy.internal.data.ResponsePagination;

public class SingleEntryGiphyResponse implements GiphyResponse {
	private FullGifEntry entry;
	private ResponseMetadata meta;

	@Override
	public GifEntry getEntry(int index) {
		return this.entry;
	}

	@Override
	public GifEntry getRandomEntry() {
		return this.entry;
	}
	
	@Override
	public Iterator<GifEntry> getEntries() {
		return Arrays.asList((GifEntry)this.entry).iterator();
	}
	
	@JsonSetter("data")
	public void setEntries(FullGifEntry entry) {
		this.entry = entry;
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
		return null;
	}
}

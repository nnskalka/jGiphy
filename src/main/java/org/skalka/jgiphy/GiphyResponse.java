package org.skalka.jgiphy;

import java.util.Iterator;

import org.skalka.jgiphy.data.GifEntry;
import org.skalka.jgiphy.data.internal.ResponseMetadata;
import org.skalka.jgiphy.data.internal.ResponsePagination;

public interface GiphyResponse {
	public GifEntry getEntry(int index);
	
	public GifEntry getRandomEntry();
	
	public Iterator<GifEntry> getEntries();
	
	public ResponseMetadata getMeta();
	
	public ResponsePagination getPagination();
}

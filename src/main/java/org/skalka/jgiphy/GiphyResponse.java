package org.skalka.jgiphy;

import java.util.Iterator;

import org.skalka.jgiphy.internal.data.GifEntry;
import org.skalka.jgiphy.internal.data.ResponseMetadata;
import org.skalka.jgiphy.internal.data.ResponsePagination;

public interface GiphyResponse {
	public GifEntry getEntry(int index);
	
	public GifEntry getRandomEntry();
	
	public Iterator<GifEntry> getEntries();
	
	public ResponseMetadata getMeta();
	
	public ResponsePagination getPagination();
}

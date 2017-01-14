package org.skalka.jgiphy;

import org.skalka.jgiphy.data.GifEntry;
import org.skalka.jgiphy.data.internal.ResponseMetadata;
import org.skalka.jgiphy.data.internal.ResponsePagination;

public interface GiphyResponse {
	public GifEntry getEntry(int index);
	
	public GifEntry getRandomEntry();
	
	public ResponseMetadata getMeta();
	
	public ResponsePagination getPagination();
}

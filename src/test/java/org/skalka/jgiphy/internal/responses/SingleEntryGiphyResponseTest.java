package org.skalka.jgiphy.internal.responses;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.mashape.unirest.http.Unirest;

public class SingleEntryGiphyResponseTest {	
	@Test
	public void SingleEntryGiphyResponseObjectMapper_CreateFromResponse_Success() throws Exception {
		final String json = Unirest.get("http://api.giphy.com/v1/gifs/feqkVgjJpYtjy?api_key=dc6zaTOxFJmzC").asString().getBody();
		final ObjectMapper om = new ObjectMapper();
		
		final SingleEntryGiphyResponse rgr = om.readValue(json, SingleEntryGiphyResponse.class);
		
		assertNotNull(rgr.getRandomEntry());
		assertNotNull(rgr.getEntries());
		assertNull(rgr.getPagination());
		assertNotNull(rgr.getEntry(0));
		assertNotNull(rgr.getMeta());
	}
}

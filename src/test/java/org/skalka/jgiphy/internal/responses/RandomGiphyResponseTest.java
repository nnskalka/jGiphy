package org.skalka.jgiphy.internal.responses;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.mashape.unirest.http.Unirest;

public class RandomGiphyResponseTest {
	@Test
	public void RandomGiphyResponseObjectMapper_CreateFromResponse_Success() throws Exception {
		final String json = Unirest.get("http://api.giphy.com/v1/gifs/random?api_key=dc6zaTOxFJmzC&tag=american+psycho").asString().getBody();
		final ObjectMapper om = new ObjectMapper();
		
		final RandomGiphyResponse segr = om.readValue(json, RandomGiphyResponse.class);
		
		assertNotNull(segr.getRandomEntry());
		assertNotNull(segr.getEntries());
		assertNull(segr.getPagination());
		assertNotNull(segr.getEntry(0));
		assertNotNull(segr.getMeta());
	}
}

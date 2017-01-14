package org.skalka.jgiphy;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.skalka.jgiphy.responses.MultipleEntryGiphyResponse;

import com.mashape.unirest.http.Unirest;

public class MultipleEntryGiphyResponseTest {
	@Test
	public void MultipleEntryGiphyResponseObjectMapper_CreateFromString_Success() throws Exception {
		final String json = Unirest.get("http://api.giphy.com/v1/gifs/search?q=funny+cat&api_key=dc6zaTOxFJmzC").asString().getBody();
		final ObjectMapper om = new ObjectMapper();
		
		try {
			final MultipleEntryGiphyResponse megr = om.readValue(json, MultipleEntryGiphyResponse.class);
			
			assertNotNull(megr.getRandomEntry());
			assertNotNull(megr.getPagination());
			assertNotNull(megr.getEntry(0));
			assertNotNull(megr.getMeta());
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}

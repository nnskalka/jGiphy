package responses;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.skalka.jgiphy.responses.SingleEntryGiphyResponse;

import com.mashape.unirest.http.Unirest;

public class SingleEntryGiphyResponseTest {	
	@Test
	public void SingleEntryGiphyResponseObjectMapper_CreateFromString_Success() throws Exception {
		final String json = Unirest.get("http://api.giphy.com/v1/gifs/feqkVgjJpYtjy?api_key=dc6zaTOxFJmzC").asString().getBody();
		final ObjectMapper om = new ObjectMapper();
		
		try {
			final SingleEntryGiphyResponse segr = om.readValue(json, SingleEntryGiphyResponse.class);
			
			assertNotNull(segr.getRandomEntry());
			assertNull(segr.getPagination());
			assertNotNull(segr.getEntry(0));
			assertNotNull(segr.getMeta());
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}

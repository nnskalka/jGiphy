package org.skalka.jgiphy.data;

import static org.junit.Assert.*;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class GifEntryTests {
	@Test
	public void GifEntryGetImage_InvalidKey_NullOutput() {
		final GifEntry ge = new FullGifEntry();
		assertNull(ge.getImage("test"));
	}
	
	@Test
	public void GifEntryObjectMapper_NoUserData_Success() {
		final String json = "{\"type\":\"gif\",\"id\":\"feqkVgjJpYtjy\",\"slug\":\"eyes-shocked-bird-feqkVgjJpYtjy\",\"url\":\"http://giphy.com/gifs/eyes-shocked-bird-feqkVgjJpYtjy\",\"bitly_gif_url\":\"http://gph.is/XJ200y\",\"bitly_url\":\"http://gph.is/XJ200y\",\"embed_url\":\"http://giphy.com/embed/feqkVgjJpYtjy\",\"username\":\"\",\"source\":\"http://littleanimalgifs.tumblr.com/post/17994517807\",\"rating\":\"g\",\"content_url\":\"\",\"source_tld\":\"littleanimalgifs.tumblr.com\",\"source_post_url\":\"http://littleanimalgifs.tumblr.com/post/17994517807\",\"is_indexable\":0,\"import_datetime\":\"2013-03-21 04:03:08\",\"trending_datetime\":\"2014-11-12 06:22:52\",\"images\":{\"fixed_height\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200.gif\",\"width\":\"445\",\"height\":\"200\",\"size\":\"789308\",\"mp4\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200.mp4\",\"mp4_size\":\"72191\",\"webp\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200.webp\",\"webp_size\":\"386388\"},\"fixed_height_still\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200_s.gif\",\"width\":\"445\",\"height\":\"200\"},\"fixed_height_downsampled\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200_d.gif\",\"width\":\"445\",\"height\":\"200\",\"size\":\"181940\",\"webp\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200_d.webp\",\"webp_size\":\"84940\"},\"fixed_width\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200w.gif\",\"width\":\"200\",\"height\":\"90\",\"size\":\"189536\",\"mp4\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200w.mp4\",\"mp4_size\":\"24259\",\"webp\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200w.webp\",\"webp_size\":\"119182\"},\"fixed_width_still\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200w_s.gif\",\"width\":\"200\",\"height\":\"90\"},\"fixed_width_downsampled\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200w_d.gif\",\"width\":\"200\",\"height\":\"90\",\"size\":\"43798\",\"webp\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/200w_d.webp\",\"webp_size\":\"25992\"},\"fixed_height_small\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/100.gif\",\"width\":\"223\",\"height\":\"100\",\"size\":\"222226\",\"mp4\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/100.mp4\",\"mp4_size\":\"27745\",\"webp\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/100.webp\",\"webp_size\":\"136842\"},\"fixed_height_small_still\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/100_s.gif\",\"width\":\"223\",\"height\":\"100\"},\"fixed_width_small\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/100w.gif\",\"width\":\"100\",\"height\":\"45\",\"size\":\"57180\",\"mp4\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/100w.mp4\",\"mp4_size\":\"10307\",\"webp\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/100w.webp\",\"webp_size\":\"44554\"},\"fixed_width_small_still\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/100w_s.gif\",\"width\":\"100\",\"height\":\"45\"},\"downsized\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/giphy.gif\",\"width\":\"334\",\"height\":\"150\",\"size\":\"511581\"},\"downsized_still\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif\",\"width\":\"334\",\"height\":\"150\"},\"downsized_large\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/giphy.gif\",\"width\":\"334\",\"height\":\"150\",\"size\":\"511581\"},\"downsized_medium\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/giphy.gif\",\"width\":\"334\",\"height\":\"150\",\"size\":\"511581\"},\"original\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/giphy.gif\",\"width\":\"334\",\"height\":\"150\",\"size\":\"511581\",\"frames\":\"27\",\"mp4\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/giphy.mp4\",\"mp4_size\":\"100919\",\"webp\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/giphy.webp\",\"webp_size\":\"271802\"},\"original_still\":{\"url\":\"http://media2.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif\",\"width\":\"334\",\"height\":\"150\"},\"looping\":{\"mp4\":\"http://media.giphy.com/media/feqkVgjJpYtjy/giphy-loop.mp4\"},\"preview\":{\"mp4\":\"http://media3.giphy.com/media/feqkVgjJpYtjy/giphy-preview.mp4\",\"mp4_size\":\"38118\",\"width\":\"266\",\"height\":\"118\"},\"downsized_small\":{\"mp4\":\"http://media3.giphy.com/media/feqkVgjJpYtjy/giphy-downsized-small.mp4\",\"mp4_size\":\"94464\"}}}";
		final ObjectMapper om = new ObjectMapper();
		
		try {
			final GifEntry ge = om.readValue(json, FullGifEntry.class);
			assertNotNull(ge.getImage("original"));
			assertNotNull(ge.getBitlyGifUrl());
			assertNotNull(ge.getBitlyUrl());
			assertNotNull(ge.getContentUrl());
			assertNotNull(ge.getEmbedUrl());
			assertNotNull(ge.getId());
		} catch (IOException e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}

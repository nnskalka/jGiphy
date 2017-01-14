package org.skalka.jgiphy.data;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonSetter;
import org.skalka.jgiphy.data.internal.Image;

public class RandomGifEntry implements GifEntry{
	private String 	type;
	private String 	id;
	private String 	url;
	
	private String	username;
	private String	caption;
	
	Map<String, Image> images = new HashMap<String, Image>();
	
	@Override
	public String getType() {
		return type;
	}

	@JsonSetter("type")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getId() {
		return id;
	}
	
	@JsonSetter("id")
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getUrl() {
		return url;
	}

	@JsonSetter("url")
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String getUsername() {
		return username;
	}
	
	@JsonSetter("username")
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String getCaption() {
		return caption;
	}
	
	@JsonSetter("caption")
	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Override
	public Image getImage(String name) {
		return this.images.get(name);
	}
	
	@JsonSetter("image_original_url")
	private void setImageOriginalUrl(URL url) {
		this.images.put("image_original", new Image() {{ setUrl(url); }});
	}
	
	@JsonSetter("image_url")
	private void setImageUrl(URL url) {
		this.images.put("image", new Image() {{ setUrl(url); }});
	}
	
	@JsonSetter("image_mp4_url")
	private void setImageMP4Url(URL mp4) {
		this.images.get("image").setMp4(mp4);
	}
	
	@JsonSetter("image_frames")
	private void setImageFrames(Integer frames) {
		this.images.get("image").setFrames(frames);
	}
	
	@JsonSetter("image_width")
	private void setImageWidth(Integer width) {
		this.images.get("image").setWidth(width);
	}
	
	@JsonSetter("image_height")
	private void setImageHeight(Integer height) {
		this.images.get("image").setHeight(height);
	}
	
	@JsonSetter("fixed_height_downsampled_url")
	private void setFixedHeightDownsampledUrl(URL url) {
		this.images.put("fixed_height_downsampled", new Image() {{ setUrl(url); }});
	}
	
	@JsonSetter("fixed_height_downsampled_width")
	private void setFixedHeightDownsampledWidth(Integer width) {
		this.images.get("fixed_height_downsampled").setWidth(width);
	}
	
	@JsonSetter("fixed_height_downsampled_height")
	private void setFixedHeightDownsampledHeight(Integer height) {
		this.images.get("fixed_height_downsampled").setHeight(height);
	}
	
	@JsonSetter("fixed_width_downsampled_url")
	private void setFixedWidthDownsampledUrl(URL url) {
		this.images.put("fixed_width_downsampled", new Image() {{ setUrl(url); }});
	}
	
	@JsonSetter("fixed_width_downsampled_width")
	private void setFixedWidthDownsampledWidth(Integer width) {
		this.images.get("fixed_width_downsampled").setWidth(width);
	}
	
	@JsonSetter("fixed_width_downsampled_height")
	private void setFixedWidthDownsampledHeight(Integer height) {
		this.images.get("fixed_width_downsampled").setHeight(height);
	}
	
	@JsonSetter("fixed_height_small_url")
	private void setFixedHeightSmallUrl(URL url) {
		this.images.put("fixed_height_small", new Image() {{ setUrl(url); }});
	}
	
	@JsonSetter("fixed_height_small_still_url")
	private void setFixedHeightSmallStillUrl(URL url) {
		this.images.put("fixed_height_small_still", new Image() {{ setUrl(url); }});
	}
	
	@JsonSetter("fixed_height_small_width")
	private void setFixedHeightSmallWidth(Integer width) {
		this.images.get("fixed_height_small").setWidth(width);
		this.images.get("fixed_height_small_still").setWidth(width);
	}
	
	@JsonSetter("fixed_height_small_height")
	private void setFixedHeightSmallHeight(Integer height) {
		this.images.get("fixed_height_small").setHeight(height);
		this.images.get("fixed_height_small_still").setHeight(height);
	}
	
	@JsonSetter("fixed_width_small_url")
	private void setFixedWidthSmallUrl(URL url) {
		this.images.put("fixed_width_small", new Image() {{ setUrl(url); }});
	}
	
	@JsonSetter("fixed_width_small_still_url")
	private void setFixedWidthSmallStillUrl(URL url) {
		this.images.put("fixed_width_small_still", new Image() {{ setUrl(url); }});
	}
	
	@JsonSetter("fixed_width_small_width")
	private void setFixedWidthSmallWidth(Integer width) {
		this.images.get("fixed_width_small").setWidth(width);
		this.images.get("fixed_width_small_still").setWidth(width);
	}
	
	@JsonSetter("fixed_width_small_height")
	private void setFixedWidthSmallHeight(Integer height) {
		this.images.get("fixed_width_small").setHeight(height);
		this.images.get("fixed_width_small_still").setHeight(height);
	}
}

package org.skalka.jgiphy.data.internal;

import java.net.URL;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
	private URL url = null;
	private Integer width = null;
	private Integer height = null;
	private Integer size = null;
	private Integer frames = null;
	private URL mp4 = null;
	private Integer mp4Size = null;
	private URL webp = null;
	private Integer webpSize = null;
	
	public URL getUrl() {
		return url;
	}

	@JsonSetter("url")
	public void setUrl(URL url) {
		this.url = url;
	}
	
	public Integer getWidth() {
		return width;
	}

	@JsonSetter("width")
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	public Integer getHeight() {
		return height;
	}

	@JsonSetter("height")
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	public Integer getSize() {
		return size;
	}

	@JsonSetter("size")
	public void setSize(Integer size) {
		this.size = size;
	}
	
	public Integer getFrames() {
		return frames;
	}

	@JsonSetter("frames")
	public void setFrames(Integer frames) {
		this.frames = frames;
	}
	
	public URL getMp4() {
		return mp4;
	}

	@JsonSetter("mp4")
	public void setMp4(URL mp4) {
		this.mp4 = mp4;
	}
	
	public Integer getMp4_size() {
		return mp4Size;
	}

	@JsonSetter("mp4_size")
	public void setMp4_size(Integer mp4_size) {
		this.mp4Size = mp4_size;
	}
	
	public URL getWebp() {
		return webp;
	}

	@JsonSetter("webp")
	public void setWebp(URL webp) {
		this.webp = webp;
	}
	
	public Integer getWebp_size() {
		return webpSize;
	}
	
	@JsonSetter("webp_size")
	public void setWebp_size(Integer webp_size) {
		this.webpSize = webp_size;
	}
}

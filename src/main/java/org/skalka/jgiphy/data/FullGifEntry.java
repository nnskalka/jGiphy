package org.skalka.jgiphy.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonSetter;
import org.skalka.jgiphy.data.internal.Image;
import org.skalka.jgiphy.data.internal.User;

public class FullGifEntry implements GifEntry {
	private String 	type;
	private String 	id;
	private String 	url;
	
	private String 	slug;
	private String 	bitlyGifUrl;
	private String 	bitlyUrl;
	private String 	embedUrl;
	private String 	username;
	private String 	source;
	private String 	rating;
	private String 	caption;
	private String 	contentUrl;
	
	private User	user;
	
	private String 	sourceTld;
	private String 	sourcePostUrl;
	private Boolean	isIndexable;
	private Date 	importDatetime;
	private Date 	trendingDatetime;
	
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
	public String getSlug() {
		return slug;
	}

	@JsonSetter("slug")
	public void setSlug(String slug) {
		this.slug = slug;
	}

	@Override
	public String getBitlyGifUrl() {
		return bitlyGifUrl;
	}

	@JsonSetter("bitly_gif_url")
	public void setBitlyGifUrl(String bitlyGifUrl) {
		this.bitlyGifUrl = bitlyGifUrl;
	}

	@Override
	public String getBitlyUrl() {
		return bitlyUrl;
	}

	@JsonSetter("bitly_url")
	public void setBitlyUrl(String bitlyUrl) {
		this.bitlyUrl = bitlyUrl;
	}

	@Override
	public String getEmbedUrl() {
		return embedUrl;
	}

	@JsonSetter("embed_url")
	public void setEmbedUrl(String embedUrl) {
		this.embedUrl = embedUrl;
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
	public String getSource() {
		return source;
	}
	
	@JsonSetter("source")
	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String getRating() {
		return rating;
	}

	@JsonSetter("rating")
	public void setRating(String rating) {
		this.rating = rating;
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
	public String getContentUrl() {
		return contentUrl;
	}

	@JsonSetter("content_url")
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	@Override
	public User getUser() {
		return user;
	}

	@JsonSetter("user")
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String getSourceTld() {
		return sourceTld;
	}

	@JsonSetter("source_tld")
	public void setSourceTld(String sourceTld) {
		this.sourceTld = sourceTld;
	}

	@Override
	public String getSourcePostUrl() {
		return sourcePostUrl;
	}

	@JsonSetter("source_post_url")
	public void setSourcePostUrl(String sourcePostUrl) {
		this.sourcePostUrl = sourcePostUrl;
	}

	@Override
	public Boolean getIsIndexable() {
		return isIndexable;
	}

	@JsonSetter("is_indexable")
	public void setIsIndexable(Boolean isIndexable) {
		this.isIndexable = isIndexable;
	}

	@Override
	public Date getImportDatetime() {
		return importDatetime;
	}

	@JsonSetter("import_datetime")
	public void setImportDatetime(String importDatetime) {
		this.importDatetime = convertGiphyDatetime(importDatetime);
	}

	@Override
	public Date getTrendingDatetime() {
		return trendingDatetime;
	}

	@JsonSetter("trending_datetime")
	public void setTrendingDatetime(String trendingDatetime) {
		this.trendingDatetime = convertGiphyDatetime(trendingDatetime);
	}
	
	@Override
	public Image getImage(String name) {
		return images.get(name);
	}
	
	@JsonSetter("images")
	public void setImages(HashMap<String, Image> images) {
		this.images = images;
	}
	
	private Date convertGiphyDatetime(String datetime) {
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return df.parse(datetime);
		} catch (ParseException PE) {
			PE.printStackTrace();
		}
		
		return null;
	}
}

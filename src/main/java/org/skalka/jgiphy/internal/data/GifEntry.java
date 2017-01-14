package org.skalka.jgiphy.internal.data;

import java.util.Date;

public interface GifEntry {

	public String getType();

	public String getId();

	public String getUrl();

	default public String getSlug() { return null; };

	default public String getBitlyGifUrl() { return null; };

	default public String getBitlyUrl() { return null; };

	default public String getEmbedUrl() { return null; };

	public String getUsername();

	default public String getSource() { return null; };

	default public String getRating() { return null; };

	public String getCaption();

	default public String getContentUrl() { return null; };

	default public User getUser() { return null; };

	default public String getSourceTld() { return null; };

	default public String getSourcePostUrl() { return null; };

	default public Boolean getIsIndexable() { return null; };

	default public Date getImportDatetime() { return null; };

	default public Date getTrendingDatetime() { return null; };

	public Image getImage(String name);

}
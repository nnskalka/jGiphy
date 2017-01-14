package org.skalka.jgiphy.data;

import java.util.Date;

import org.skalka.jgiphy.data.internal.Image;
import org.skalka.jgiphy.data.internal.User;

public interface GifEntry {

	String getType();

	String getId();

	String getUrl();

	String getSlug();

	String getBitlyGifUrl();

	String getBitlyUrl();

	String getEmbedUrl();

	String getUsername();

	String getSource();

	String getRating();

	String getCaption();

	String getContentUrl();

	User getUser();

	String getSourceTld();

	String getSourcePostUrl();

	Boolean getIsIndexable();

	Date getImportDatetime();

	Date getTrendingDatetime();

	Image getImage(String name);

}
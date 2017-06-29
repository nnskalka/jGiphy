package org.skalka.jgiphy.internal.data;

import org.codehaus.jackson.annotate.JsonSetter;

public class User {
	public String avatarUrl;
	public String bannerUrl;
	public String profileUrl;
	public String username;
	public String displayName;
	public String twitter;
	
	public String getAvatarUrl() {
		return avatarUrl;
	}
	
	@JsonSetter("avatar_url")
	private void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	
	public String getBannerUrl() {
		return bannerUrl;
	}

	@JsonSetter("banner_url")
	private void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	
	public String getProfileUrl() {
		return profileUrl;
	}

	@JsonSetter("profile_url")
	private void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	
	public String getUsername() {
		return username;
	}

	@JsonSetter("username")
	private void setUsername(String username) {
		this.username = username;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	@JsonSetter("display_name")
	private void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public String getTwitter() {
		return twitter;
	}

	@JsonSetter("twitter")
	private void setTwitter(String twitter) {
		this.twitter = twitter;
	}
}

package org.skalka.jgiphy.data.internal;

import org.codehaus.jackson.annotate.JsonSetter;

public class User {
	public String avatarUrl;
	public String bannerUrl;
	public String profileUrl;
	public String username;
	public String displayName;
	
	public String getAvatarUrl() {
		return avatarUrl;
	}
	
	@JsonSetter("avatar_url")
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	
	public String getBannerUrl() {
		return bannerUrl;
	}

	@JsonSetter("banner_url")
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	
	public String getProfileUrl() {
		return profileUrl;
	}

	@JsonSetter("profile_url")
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	
	public String getUsername() {
		return username;
	}

	@JsonSetter("username")
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	@JsonSetter("display_name")
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}

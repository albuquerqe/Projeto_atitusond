package br.edu.atitus.atitusound.entities;

import ch.qos.logback.core.util.Duration;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class PlaylistEntity extends GenericEntity{
	private Duration duration;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_playlist_music")
	
	private PlaylistEntity playlis;
	private int like_count;
	private String url;
	
	public String geturl() {
		
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public PlaylistEntity getPlaylist() {
		return playlis;
	}
	public void setPlaylist(PlaylistEntity playlist) {
		this.playlis = playlist;
	}
	public int getLike_count() {
		return like_count;
	}
	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}
	
	

}

package com.pannell;

import java.util.ArrayList;

public class Playlist implements IComponent {
	public String playlistName;
	public ArrayList<IComponent> playlist;

	public void remove(IComponent component) {
		playlist.remove(component);
	}

	public void add(IComponent component) {
		playlist.add(component);
	}

	public Playlist(String playlistName) {
		super();
		this.playlist = new ArrayList<IComponent>();
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (IComponent component : playlist) {
			component.play();
		}

	}

	@Override
	public void setPlaybackSpeed(float speed) {
		// TODO Auto-generated method stub
		for (IComponent component : this.playlist) {
			component.setPlaybackSpeed(speed);
		}

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return playlistName;
	}

}

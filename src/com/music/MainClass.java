package com.music;

import com.spotify.Database;
import com.spotify.SpotifyTerminal;
import com.twilio.ReceivingService;

public class MainClass {

	public static void main(String[] args) {

		Database.init();
		ActiveSongs.init();
		
		new Thread(new ReceivingService()).start();

		while(true){
			Song song = ActiveSongs.popHighestSong();
			SpotifyTerminal.play(song.tid);
		}

	}

}

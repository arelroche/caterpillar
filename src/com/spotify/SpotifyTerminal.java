package com.spotify;

import com.music.ActiveSongs;
import com.twilio.ReceivingService;

public class SpotifyTerminal {
	public static void play (String id) {
		System.out.println("PLAYING SONG: " + id);
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			Process pr = Runtime.getRuntime().exec("osascript SpotifyTest2.app/ " + id);
//			pr.waitFor();
//		} catch (Exception e) {
//
//		}
	}
}

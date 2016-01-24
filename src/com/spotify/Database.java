package com.spotify;
import java.util.*;
import com.music.*;
import java.util.Random;


public class Database{
	
	private List<Song> db;
	Song tempSong;
	Random random;

	
	private Database() {
		db = new ArrayList<Song>();
		random = new Random();
	}
	
	
	public void addSong (String sname, String sid){
		
		Song newSong = new Song(sname, sid);
		db.add(newSong);
		
	}
	
	public Song rmvSong (){
		int index = random.nextInt(db.size());
		tempSong = db.get(index);
		db.remove(index);
		return tempSong;
	}
}

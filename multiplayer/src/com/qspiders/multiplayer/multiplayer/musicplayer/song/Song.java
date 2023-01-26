package com.qspiders.multiplayer.multiplayer.musicplayer.song;

import java.util.Scanner;

public class Song {
	static Scanner scanner=new Scanner(System.in);
	private static int id;
	private static String Song_name;
	private static String Movie_Album;
	private static String singer;
	private static String lyrics;
	static int Song_number;
	
	
	public static int getd() {
		return id;
	}
	public static void setid(int id) {
		System.out.println("please Enter Your Song id");
		Song.id = id;
	}
	public static String getSong_name() {
		return Song_name;
	}
	public static void setSong_name(String name) {
		Song.Song_name = name;
	}
	public static String getMovie_Album() {
		return Movie_Album;
	}
	public static void setMovie_Album(String movie_Album) {
		Movie_Album = movie_Album;
	}
	public static String getSinger() {
		return singer;
	}
	public static void setSinger(String singer) {
		Song.singer = singer;
	}
	public static String getLyrics() {
		return lyrics;
	}
	public static void setLyrics(String lyrics) {
		Song.lyrics = lyrics;
	}
	
		public static void AddSong() {
			Song_number=scanner.nextInt();
			for (int i = 1; i <= Song_number; i++) {
			
			System.out.println("enter id");
			id=scanner.nextInt();
			System.out.println("enter name");
			Song_name=scanner.next();
			System.out.println("enter Movie_Album");
			Movie_Album=scanner.next();
			System.out.println("enter singer");
			singer=scanner.next();
			System.out.println("enter lyrics");
			lyrics=scanner.next();
			}
			
			
		}
	
}

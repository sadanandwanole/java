package com.qspiders.multiplayer.musicplayer.song;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Song {
	static Scanner scanner=new Scanner(System.in);
	private static int id;
	private static String Song_name;
	private static String Movie_Album;
	private static String singer;
	private static String lyrics;
	static int Song_number;
	
	public static ArrayList<Object> arrayList=new ArrayList<Object>();
	public static int getid() {
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
			for (int i = 0; i <= Song_number; i++) {
				Song song=new Song();
			System.out.println("enter id");
			id=scanner.nextInt();
			System.out.println("enter name");
			Song_name=scanner.nextLine();
			
			System.out.println("enter Movie_Album");
			Movie_Album=scanner.nextLine();
			System.out.println("enter singer");
			singer=scanner.nextLine();
			System.out.println("enter lyrics");
			lyrics=scanner.nextLine();
			arrayList.add(song);
			System.out.println(Song.arrayList.indexOf(song));
			}
			
			
				
			}
		public static void RemoveSong() {
			for (Object str : arrayList) {
				System.out.println(str);
			}
			System.out.println("Please Select The Song Number");
			int number= scanner.nextInt();
			
			
			Song.arrayList.remove(Song_number);
		}
		
		public static void EditSong() {
			for (Object str : arrayList) {
				System.out.println(str);
			}
			int id=scanner.nextInt();
			if (id==Song.id) {
			System.out.println("Please Select The Song Number");
			int number= scanner.nextInt();
			
			Song_number=scanner.nextInt();
			for (int i = 0; i <= Song_number; i++) {
				Song song=new Song();
			System.out.println("enter id");
			id=scanner.nextInt();
			System.out.println("enter name");
			Song_name=scanner.nextLine();
			
			System.out.println("enter Movie_Album");
			Movie_Album=scanner.nextLine();
			System.out.println("enter singer");
			singer=scanner.nextLine();
			System.out.println("enter lyrics");
			lyrics=scanner.nextLine();
			System.out.println("Successfull replaced");
			System.out.println(Song.arrayList.indexOf(song));
			}
			}
				
		} 
		public static void PlayAllSong() {
			int max=10;
			int min=1;
			for (Object object : arrayList) {
				int b=(int)(Math.random()*(max-min+1)+min);
				System.out.println(b);
				break;
			}
			
		}
		public static void SelectSong() {
			for (Object str : arrayList) {
				System.out.println(str);
		}
		}
	
}

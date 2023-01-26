package com.qspiders.multiplayer.musicplayer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.qspiders.multiplayer.musicplayer.song.Song;
import com.qspiders.multiplayer.songoperation.SongOperation;

public class MusicPlayer {
	static SongOperation operation=new SongOperation();
	static Song song;
	static boolean choice=true;
	public static void main(String[] args) throws SQLException {
		while(choice==true) {
		System.out.println("=====================================Menu==================================");
		System.out.println("1) Add/Remove song \n"
				+ "2) Play Song \n"
				+ "3) Edit Song \n"
				+ "4) Ext");
				break;
		}
		System.out.println("Please select your Option: ");
		try (Scanner scanner = new Scanner(System.in)) {
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1) Add Song \n"
						+"2) Remove Song \n"
						+ "3) Back");
					int choice1=scanner.nextInt();
					switch (choice1) {
					case 1:
						
						operation.addSong();
						System.out.println(Song.getSong_name()+"Added Successefully");
						MusicPlayer.main(args);
						break;
					case 2:
						Song.RemoveSong();
						System.out.println("Remover Successefully...");
						MusicPlayer.main(args);
						break;
					case 3:
						MusicPlayer.main(args);
						break;
					default:
						System.out.println("Please Enter Valid Input.......!!!");
						break;
					}
				break;
			case 2:
				
				System.out.println("1) Play All Song \n"
						+ "2) Choose Song \n"
						+ "3) Shuffle \n"
						+ "4) Back ");
				int choice2=scanner.nextInt();
					switch (choice2) {
					case 1:
						Song.PlayAllSong();
						System.out.println(" Method Keshriya is Now Running Display All Song");
						MusicPlayer.main(args);
						break;
					case 2:
						
						System.out.println("======================Display All Song============================");
						Song.SelectSong();
						MusicPlayer.main(args);
						break;
					case 3:
						Song.PlayAllSong();
						System.out.println("Shuffle Play Random Song");
						break;
					case 4:
						MusicPlayer.main(args);
						break;
					default:
						System.out.println("Please enter Valid Input.......!!!!!!!!!");
						MusicPlayer.main(args);
						break;
					}
				break;
			case 3:
				System.out.println("======================Display All Song============================");
				Song.EditSong();
				break;
			case 4:
				System.out.println("Thank you For Using.................!!!!!");
				break;
			default:
				System.out.println("Please Enter Valid Input....!!!!!");
				break;
			}
		}
		
	}

}

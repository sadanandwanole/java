package com.qspiders.multiplayer.multiplayer.musicplayer;

import java.sql.SQLException;
import java.util.Scanner;

import com.qspiders.multiplayer.musicplayer.song.Song;
import com.qspiders.multiplayer.songoperation.SongOperation;

public class MusicPlayer {
	static Song song;
	static SongOperation operation=new SongOperation();
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
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("1) Add Song \n"
					+"2) Remove Sond \n"
					+ "3) Back");
				int choice1=scanner.nextInt();
				switch (choice1) {
				case 1:
					operation.addSong();
					System.out.println("Added Successefully");
					MusicPlayer.main(args);
					break;
				case 2:
					operation.removeSong();
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
				switch (choice) {
				case 1:
					System.out.println(" Method Keshriya is Now Running Display All Song");
					break;
				case 2:
					System.out.println("Display All Song");
					break;
				case 3:
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
			System.out.println("=============================All Song================================");
			
			operation.displayAllSong();
			operation.editSong();
			
			break;
		case 4:
			break;
		default:
			System.out.println("Please Enter Valid Input....!!!!!");
			break;
		}
	}

}

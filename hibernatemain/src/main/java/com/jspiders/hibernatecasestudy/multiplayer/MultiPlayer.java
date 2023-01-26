package com.jspiders.hibernatecasestudy.multiplayer;

import java.util.Scanner;

import com.jspiders.hibernatecasestudy.song.SongDatabase;
import com.jspiders.hibernatecasestudy.songoperation.SongOperation;

public class MultiPlayer {
//		static Song song;
		static SongOperation operation=new SongOperation();
		static boolean choice=true;
		public static void main(String[] args) {
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
						SongOperation.addSong();
						System.out.println("Added Successefully");
						 MultiPlayer.main(args);
						break;
					case 2:
						SongOperation.deleteSong();
						System.out.println("Remover Successefully...");
						 MultiPlayer.main(args);
						break;
					case 3:
						 MultiPlayer.main(args);
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
					choice=scanner.nextInt();
					switch (choice) {
					case 1:
						SongOperation.displayAllSong();
						System.out.println(" Method Keshriya is Now Running Display All Song");
						break;
					case 2:
						
						System.out.println("========================Display All Song=======================");
						SongOperation.displayAllSong();
						SongOperation.searchSong();
						break;
					case 3:
						SongOperation.random();
						System.out.println("Shuffle Play Random Song");
						break;
					case 4:
						 MultiPlayer.main(args);
						break;
					default:
						System.out.println("Please enter Valid Input.......!!!!!!!!!");
						MultiPlayer.main(args);	
					}
				break;
			case 3:
				System.out.println("=============================All Song================================");
				SongOperation.displayAllSong();
				SongOperation. editSong();
//				operation.displayAllSong();
//				operation.editSong();
				
				break;
			case 4:
				break;
			default:
				System.out.println("Please Enter Valid Input....!!!!!");
				MultiPlayer.main(args);	
				break;
			}
		}
		
		

	}


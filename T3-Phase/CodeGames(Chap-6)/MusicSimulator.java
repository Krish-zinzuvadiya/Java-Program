/*
 * QB 264 
 * 
 * Music player playlist: Write a program that simulates a music
player playlist using an ArrayDeque. The program should allow
the user to add songs to the playlist, play the next or previous
song in the playlist, and shuffle the playlist. The program should
keep track of the songs in the playlist using an ArrayDeque,
where each element in the deque represents a song. When the
user adds a song, you can use the addLast method to add it to
the end of the playlist. When the user plays the next or previous
song, you can use the removeFirst or removeLast method,
respectively, to remove the current song from the front or back
of the deque and add it to the end or beginning of the deque.
When the user shuffles the playlist, you can use the shuffle
method to randomly reorder the songs in the deque.

 * 
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MusicSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> playlist = new ArrayDeque<>();

        System.out.println("Music Player Playlist Simulator");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add song to playlist");
            System.out.println("2. Play next song");
            System.out.println("3. Play previous song");
            System.out.println("4. Shuffle playlist");
            System.out.println("5. Display current playlist");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine();
                    playlist.addLast(song);
                    System.out.println(song + " added to the playlist.");
                    break;
                case 2:
                    if (!playlist.isEmpty()) {
                        String nextSong = playlist.removeFirst();
                        System.out.println("Playing: " + nextSong);
                        playlist.addLast(nextSong);
                    } else {
                        System.out.println("Playlist is empty.");
                    }
                    break;
                case 3:
                    if (!playlist.isEmpty()) {
                        String previousSong = playlist.removeLast();
                        System.out.println("Playing: " + previousSong);
                        playlist.addFirst(previousSong);
                    } else {
                        System.out.println("Playlist is empty.");
                    }
                    break;
                case 4:
                    if (!playlist.isEmpty()) {
                        ArrayList<String> al = new ArrayList<>(playlist);
                        Collections.shuffle(al);
                        playlist = new ArrayDeque<>(al);

                        System.out.println("Playlist shuffled.");
                    } else {
                        System.out.println("Playlist is empty.");
                    }
                    break;
                case 5:
                    if (!playlist.isEmpty()) {
                        System.out.println("Current Playlist: " + playlist);
                    } else {
                        System.out.println("Playlist is empty.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Music Player Playlist Simulator.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
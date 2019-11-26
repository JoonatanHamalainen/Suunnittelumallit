package adapter;

public class Main {

	public static void main(String[] args) {
		Mp3Player audioPlayer = new Mp3Player();

	      audioPlayer.playMedia("mp3", "paranoid.mp3");
	      audioPlayer.playMedia("mp4", "darudesandstorm.mp4");
	      audioPlayer.playMedia("vlc", "kissavideo.vlc");
	      audioPlayer.playMedia("avi", "kotivideo.avi");

	}

}

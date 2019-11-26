package adapter;


public class Mp3Player implements BasicMediaPlayer {
	
	Adapter mediaAdapter;

	@Override
	public void playMedia(String type, String file) {
	      if(type.equals("mp3")){
	         System.out.println("Playing: mp3-file. Name: " + file);			
	      } 
	      
	      else if(type.equals("vlc") || type.equals("mp4")){
	         mediaAdapter = new Adapter(type);
	         mediaAdapter.playMedia(type, file);
	      }
	      
	      else{
	         System.out.println("Can't play the chosen media: " + file);
	      }

	}

}

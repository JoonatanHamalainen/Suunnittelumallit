package adapter;

public class Adapter implements BasicMediaPlayer{

	BetterMediaPlayer PC;

	   public Adapter(String type){
	   
	      if(type.equals("vlc") ){
	         PC = new VlcPlayer();			
	         
	      }else if (type.equals("mp4")){
	         PC = new Mp4Player();
	      }	
	   }

	   @Override
	   public void playMedia(String type, String file) {
	   
	      if(type.equals("vlc")){
	         PC.playVlc(file);
	      }
	      else if(type.equals("mp4")){
	         PC.playMp4(file);
	      }
	   }
}

public class AudioPlayer implements MediaPlayer{

 MediaAdapter mediaAdapter;
 //play normal audio,MP4 and VLC example	
 @Override	
 public void play(String fileType,String fileName){
  
  // normal bult in support
  if(fileType.equalsIgnoreCase("MP3")){
    System.out.println("playing mp3 audio");
  }
   
   // extended capability to play VLC ad MP4
  else if(fileType.equalsIgnoreCase("VLC") || fileType.equalsIgnoreCase("MP")){
    mediaAdapter = new MediaAdapter(fileType);
    mediaAdapter.play(fileType,fileName);
  }

  else System.out.println("error , file not supported");
  
 }
 
}
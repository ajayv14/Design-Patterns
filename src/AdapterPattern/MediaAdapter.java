public class MediaAdapter implements MediaPlayer{

  AdvancedAudioPlayer AdvancedMP;

   //constructor returns corresponding AdvancedMediaPlayer object
  public MediaAdapter(String audioType){
   
   if(audioType.equalsIgnoreCase("VLC")){
      AdvancedMP = new VLCPlayer();
   } 

   else if(audioType.equalsIgnoreCase("MP")){
     AdvancedMP = new MPPlayer();
   } 
  }	 

  @Override
  public void play(String fileType, String fileName){
    if(fileType.equalsIgnoreCase("VLC")){
        AdvancedMP.playVLC(fileName);
    }

    else if(fileType.equalsIgnoreCase("MP")){
      AdvancedMP.playMP(fileName);
    }

  }

}
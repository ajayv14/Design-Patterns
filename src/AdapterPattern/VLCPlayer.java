public class VLCPlayer implements AdvancedAudioPlayer{
 
 @Override	
 public void playVLC(String fileName){
   System.out.println("Playing file in VLC");
 }

 @Override
 public void playMP4(String fileName){
   // do nothing
 }

}
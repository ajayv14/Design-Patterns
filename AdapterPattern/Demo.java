public class Demo{
	
 public static void main(String[] args){
  
  AudioPlayer AP = new AudioPlayer();
  AP.play("MP3","file.mp3");
  AP.play("VLC","file.vlc");
  AP.play("MP","file.mp");
  AP.play("XYZ","file.xyz");

 }

}
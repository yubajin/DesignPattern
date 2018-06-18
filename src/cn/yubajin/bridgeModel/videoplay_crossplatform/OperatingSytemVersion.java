
package cn.yubajin.bridgeModel.videoplay_crossplatform;

public abstract class OperatingSytemVersion {

   protected VideoFile vf;
   
   public void setVideoFile(VideoFile vf) {
	   this.vf = vf;
   }
   
   public abstract void play(String fileName);

}
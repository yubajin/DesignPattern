
package cn.yubajin.bridgeModel.videoplay_crossplatform;


public class AVIFile implements VideoFile {
	
   public void decode(String osType, String fileName) {
      System.out.println(osType + "播放AVIFile" + fileName);
   }

}
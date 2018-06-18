
package cn.yubajin.bridgeModel.videoplay_crossplatform;

public class WindowsVersion extends OperatingSytemVersion {
   public void play(String fileName) {
	   String osType = "WindowsVersion系统";
	   this.vf.decode(osType, fileName);
   }

}
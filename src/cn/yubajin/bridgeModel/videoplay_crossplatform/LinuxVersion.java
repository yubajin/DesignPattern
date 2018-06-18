
package cn.yubajin.bridgeModel.videoplay_crossplatform;

public class LinuxVersion extends OperatingSytemVersion {
	
	public void play(String fileName) {
		   String osType = "LinuxVersion系统";
		   this.vf.decode(osType, fileName);
	   }
}
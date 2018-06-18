
package cn.yubajin.bridgeModel.videoplay_crossplatform;

public class UnixVersion extends OperatingSytemVersion {
	public void play(String fileName) {
		   String osType = "UnixVersion系统";
		   this.vf.decode(osType, fileName);
	   }

}
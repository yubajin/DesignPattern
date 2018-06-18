package cn.yubajin.bridgeModel.videoplay_crossplatform;

public class Client {
	public static void main(String[] args) {
		OperatingSytemVersion version;
		VideoFile file;
		
		version = (OperatingSytemVersion)XMLUtilFile.getBean("version");
		file = (VideoFile)XMLUtilFile.getBean("file");
		
		version.setVideoFile(file);
		version.play("设计模式教学视频");
	}
}

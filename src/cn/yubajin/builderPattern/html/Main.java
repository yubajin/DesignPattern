package cn.yubajin.builderPattern.html;

public class Main {
	public static void main(String[] args) {
		if(args.length != 1){
			usage();
			System.exit(0);
		}

		if(args[0].equals("plain")){
			TextBuilder textBuilder = new TextBuilder();
			
			Director director = new Director(textBuilder);
			director.construct();
			
			String result = textBuilder.getResult();
			System.out.println(result);
		}else if(args[0].equals("html")){
			HtmlBuilder htmlBuilder = new HtmlBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			
			String result = htmlBuilder.getResult();
			System.out.println(result + "文档已经编写文完成");
		}
	}
	

	private static void usage() {
		System.out.println("Usage: java Main plain");
		System.out.println("Usage: java Main html");
	}
}

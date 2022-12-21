package Builder_Pattern.test;

import Builder_Pattern.test.domain.Director;
import Builder_Pattern.test.domain.HTMLBuilder;
import Builder_Pattern.test.domain.TextBuilder;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if (args[0].equals("plain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.constructor();
			String result = textBuilder.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.constructor();
			String filename = htmlBuilder.getResult();
			System.out.println(filename + "가 작성되었습니다.");
		} else {
			usage();
			System.exit(0);
		}
	}
	public static void usage(){
		System.out.println("Usage: java Main plain 일반 텍스트로 문서 작성");
		System.out.println("Usage: java Main html HTML 파일 문서 작성");
	}
}

package helloworld;

import java.util.ArrayList;

public class HelloworldMain {

	public static void main(String[] args) {
		int num = 2;
		String str = "まどちん";
		ArrayList<String> aryList = new ArrayList<>();

		aryList.add("う");
		aryList.add("ち");
		aryList.add("ゃ");
		aryList.add("ろ");

		// TODO 自動生成されたメソッド・スタブ
		System.out.println("HelloWorld");
		System.out.println(num);
		System.out.println(str);

		for(int i= 0;i<aryList.size();i++) {
			System.out.println(aryList.get(i));
		}
	}

}

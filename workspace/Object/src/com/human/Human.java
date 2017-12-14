package com.human;

public class Human {


	//HUMANクラスの姓
	public static String sei;

	//HUMANクラスの名
	public static String mei;







	//Mainメソッド
	public static void main(String[]args){
		System.out.println("人間クラスのMainメソッドです。");

	//クラスHumanNameのコピーを作成
		HumanName humanName=new HumanName();
		humanName.sei="山田";
//		humanName.mei="太郎";
		humanName.setMei("太郎");
		humanName.display();

		HumanName humanName2=new HumanName("鈴木");
		humanName2.display();

		HumanName humanNamw3=new HumanName("木村","花子");
		humanNamw3.display();

	}

}

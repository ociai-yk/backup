package com.human;

public class HUMAN {

	//クラスの属性（データをもとに人間を作る）
	public static String sei;
	public static String mei;
	public static int age;

	//メインメソッド
	public static void main(String[]args){

		//１人目　山田花子　18歳
		HumanName humanName=new HumanName();
		Address humanAddress=new Address();
		humanName.sei="山田";
		humanName.mei="花子";
		humanName.setAge(18);
		humanAddress.number=5;
		humanAddress.address="神奈川";
		humanName.display();
		humanName.talk();
		humanAddress.display();

		//２人目　鈴木　20歳
		HumanName humanName2=new HumanName("鈴木",20);
			humanName2.display();
		Address humanAddress2=new Address("埼玉");
		     humanAddress2.display();

	   //３人目　太郎　30歳
		HumanName humanName3=new HumanName(30,"太郎");
		    humanName3.display();
		Address humanAddress3=new Address(1);
		    humanAddress3.display();





	}
}

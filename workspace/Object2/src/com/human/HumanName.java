package com.human;

public class HumanName {

	//このクラスの属性
	public String sei;
	public String mei;
	private int age;



	//defaultコンストラクタ
	public HumanName(){}

	//meiがない場合のコンストラクタ
	public HumanName(String sei,int age){
		this.sei=sei;
		this.age=age;
	}

	//seiがない場合のコンストラクタ
	public HumanName(int age,String mei){
		this.age=age;
		this.mei=mei;
	}

	//Getterでageの呼び出し可能にする
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

	public void display(){
		if(sei==null){
			System.out.println(mei+age);
		}if(mei==null){
			System.out.println(sei+age);
		}if(!(sei==null)&&!(mei==null)){
			System.out.println(sei+mei+age);
		}
	}

	public void talk(){
		System.out.println(this.sei+"が話す");
	}
}
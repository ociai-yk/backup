package com.employee;

public class Employee2 {


	static int number=0;      //総従業員数
	int code;                 //従業員番号
	String name;              //従業員名
	int year;                 //年数
	int age;                  //年齢



	Employee2(String name, int year, int age){
		code=++number;
		this.name=name;
		this.year=year;
		this.age=age;
	}

	Employee2(){
		this("未定",0,0);       //初期値ではなく引数でコンストラクタに値を格納

	}

	Employee2(String name){
		this(name,0,0);
	}

	Employee2(String name,int age){
		this(name,0,age);
	}

	void display(){
		System.out.println("従業員数 :"+code);
		System.out.println("従業員名 :"+name);
		System.out.println("入社年数 :"+year);
		System.out.println("年　　齢 :"+age);
		 System.out.println("\r");
	}
}

//package com.employee;
//
//public class Employee {
//
//	public static int number=0;   //総従業員数
//	public int code;              //従業員番号
//	public String name="未定";    //従業員名
//    public int year=0;       //入社年数
//    public int age=0;        //年齢
//
//
//    public Employee(){}
//
//    public Employee(String name,int year,int age){
//    	this.name=name;
//    	this.year=year;
//    	this.age=age;
//    	code=++number;         //numberを1つカウント
//
//
//    }
//
//    public Employee(String name,int age){
//    	this.name=name;
//    	this.age=age;
//    	code=++number;         //numberを1つカウント
//    }
//
//    public Employee(int year,int age){
//    	this.year=year;
//    	this.age=age;
//    	code=++number;         //numberを1つカウント
//    }
//
//
//
//    public void display(){
//    	System.out.println("従業員番号"+code);
//    	System.out.println("従業員名:"+name);
//    	System.out.println("入社年数:"+year);
//    	System.out.println("入社年数:"+age);
//    }
//}

//初期値設定の形でも引数を渡す形でも問題ないが、後からデータを加えるときに初期値が入っていると面倒
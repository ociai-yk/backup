package com.human;

public class HumanName {


	public String sei;
	private String mei;

	public HumanName(){}


	public HumanName(String sei){
		this.sei=sei;
	}

	public HumanName(String sei,String mei){
		this.sei=sei;
		this.mei=mei;
	}



	public String getSei() {
		return sei;
	}
	public void setSei(String sei) {
		this.sei = sei;
	}
	public String getMei() {
		return mei;
	}
	public void setMei(String mei) {
		this.mei = mei;
	}


	//Getterでアクセス可能



	public void display(){
		if(sei==null){
			System.out.println(mei);
		}
		if(mei==null){
			System.out.println(sei);
		}
		if(!(sei==null)&&!(mei==null)){
			System.out.println(sei + mei);
		}


	}



}

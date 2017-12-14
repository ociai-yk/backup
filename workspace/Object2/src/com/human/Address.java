package com.human;

public class Address {


	public  int number;
	public String address;

	//defaultのコンストラクタ
	public Address(){}

	//numberしかないコンストラクタ
	public Address(int number){
		this.number=number;
	}

	//addressしかないコンストラクタ
	public Address(String address){
		this.address=address;
	}

	public void display(){
		if(number==0){
			System.out.println(address);
		}if(address==null){
			System.out.println(number);
		}if(!(number==0)&&!(address==null)){
			System.out.println(number+address);
		}
	}

}

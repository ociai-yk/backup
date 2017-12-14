public class HelloWorld {


	public static void main(String[] args) {
		// Hello World!の出力
		System.out.println("Hello World!");

		System.out.println(123);

		System.out.println("おはよう");

		System.out.println("例外が発生しました。");

		System.out.println("例外が\r\n発生しました。");

		int suugaku=45;
		int eigo=82;
		if(suugaku>50||eigo>50){
			System.out.println("この人は合格です");
		}

        String str1="鈴木";
        System.out.println(str1);

        String str2="Tanaka";
        System.out.println(str2);

        int num1 = 12345;
        System.out.println(num1);

        boolean boo=true;
        System.out.println(boo);

        int a =2*5;
        System.out.println(a);




        String abc="山田";
        System.out.println(abc+"さん");

        int a1=3+3;
        System.out.println(a1);

        int a2=-8-3;
        System.out.println(a2);

        int a3=-5*3;
        System.out.println(a3);

        int a4=4/2;
        System.out.println(a4);

        int a5=10/3;
        System.out.println(a5);

        float a6=(float)10/3;
        System.out.println(a6);

        int a7 =7%3;
        System.out.println(a7);

        int c=10;
        System.out.println(++c);

        int c1=10;

        if(c1<20){
        	System.out.println("A");

        	int c2=5;
        	if(c2<10&&3<c2){
        		System.out.println("A");
        	}

        	int c3=1;
        	if(c3==0){
        		System.out.println("c3は０に等しい");
        		}else if(c3==1){
        		System.out.println("c3は1に等しい");

        		}


        		int c4=2;

        		switch(c4){
        			case 1:
        			System.out.println("c4は1に等しい");

        			case 2:
        				System.out.println("c4は２に等しい");

        		}

        //例)例)もし、”ある数”(a)が0の場合、“aは0に等しい“と表示。
        //もしくは、”ある数”(a)が1の場合、”aは1に等しい”と表示。
        //それ以外の場合は、”aは0でも1でもない”と表示する。

        int c5=5;

        switch(c5){

        case 0:
        	System.out.println("c5は0に等しい");
        	break;
        case 1:
        	System.out.println("c5は1に等しい");
        	break;
        	default:
        		System.out.println("c5は0でも1でもない");
        }

//string　配列

        String[] name=new String[3];

        name[0]="tanaka";
        name[1]="takahasi";
        name[2]="saito";
        System.out.println(name[0]);

        String[] name1={"tanaka","takahashi","saito"};
        System.out.println(name1[2]);

        char[]d={'x','y','z'};
        System.out.println(d[2]);

        int[]d1={1,5,10};
        System.out.println(d1[1]);

        String[]name3={"tanaka","takahasi","saito"};
        name3[0]="kato";
        System.out.println(name3[0]);

        String[][]country=
        	{
        			{"日本","タイ"},
        			{"アメリカ","ブラジル"},
        			{"フランス","ロシア"}
        	};

        System.out.println(country[0][0]);

        for(int i=0; i<3;i++){
        	System.out.println(i);
        }

        for(int i1=1;i1<10;i1++){
        	System.out.println(i1);
        }

        for(int i2=3;i2<10;i2++){
        	System.out.println(i2);
        }


        for (int k=1;k<=10;k++){
        	if(k%2==0){
        		System.out.println(k+"\n");
        	}
        }

        for(int m=0; m<3;m++){

        	for(int n=1;n<4;n++){
        		System.out.println(n);
        	}

        	System.out.println("\n");
        }
//例)ある数(ｇ)が0以上だった場合プラス、0未満だった場合マイナス、と表示する。
        //g=10

        int g=10;

        String j = g>=0?"プラス":"マイナス";
        System.out.println(j);


        int w=10;

        String z=w%2==0?"偶数":"奇数";
        System.out.println(z);

	}

        for(int p=0; p<=5; p++){
        	String l4=p%2==0?"☆":"★";
        	System.out.print(l4);

        }

System.out.println("\n");




}
}




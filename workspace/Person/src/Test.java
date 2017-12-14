/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
     public static void main(String[] args){

    	 Person taro=new Person("山田太郎",20);
    	 System.out.println(taro.name);
     	 System.out.println(taro.age);

     	 Person saburo=new Person("saburo");
     	 System.out.println(saburo.name);
     	 System.out.println(saburo.age);

     	 Person nanashi=new Person(25);
     	 System.out.println(nanashi.name);
     	 System.out.println(nanashi.age);

     	 Person hanako=new Person(17,"hanako");
     	 System.out.println(hanako.name);
     	 System.out.println(hanako.age);



//
//    	 taro.name="山田　太郎";
//    	 taro.age=20;
//
//
//
//    	 taro.talk();
//    	 taro.walk();
//    	 taro.run();
//
//    	System.out.println();








	}

}


public class Person {

//	  public String name=null;
//	  public int age=0;

//上のデータにprivateアクセス修飾子をつけてカプセル化する

     private String name=null;
     private int age=0;
     //mainメソッドでデータ開示できなくなる。
     //mainメソッドにも変更を加える

     public Person(String name,int age){
		  this.name=name;
		  this.age=age;
	  }


	  //カプセル化部分
		public String getName(){
			return this.name;

		}

		public void setNmae(String name){
			this.name=name;
		}

		public int getAge(){
			return this.age;

		}

		public void setAge(int age){
			this.age=age;
		}

}

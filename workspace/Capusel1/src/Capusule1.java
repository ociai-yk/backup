/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Capusule1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	 Person taro=new Person("山田　太郎",20);
      //System.out.println(taro.name);
	  //カプセル化によって隠蔽されたデータを表示するにはgetName()を加える
	 System.out.println(taro.getName());
	 System.out.println(taro.getAge());

	}

}

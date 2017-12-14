
public class SmartPhone extends Phone implements Mp3Player, NewFunction{

	public static void main(String[]args){

	SmartPhone iphone=new SmartPhone();

	iphone.play();
    iphone.stop();
	iphone.next();
	iphone.back();
	iphone.call();
	iphone.mail();
	iphone.photo();
	iphone.internet();


}
}

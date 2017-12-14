
public class SmartPhone extends Mp3Player {

	//オーバーライド　ここから
	public void play(){
		System.out.println("再生(HighResolution)");
	}

	public void stop(){
		System.out.println("停止(HighResolution)");
	}

	public void next(){
		System.out.println("次へ(HighResolution)");
	}

	public void back(){
		System.out.println("戻る(HighResolution)");
	}
	//ここまで

	public void call(){
		System.out.println("電話");
	}

	public void mail(){
		System.out.println("メール");
	}

	public void photo(){
		System.out.println("写真");
	}

	public void internet(){
		System.out.println("インターネット");
	}

}

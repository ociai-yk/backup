package com.internousdev.ecsite.dto;

public class LoginDTO {

	/*
	 * DAOとAction間でデータを運ぶための箱を作る
	 */

	private String loginId;
	private String loginPassword;
	private String userName;
	/*boolean型はtrueかfalseのみ変数としてとる。
	 * ここでは初期値としてあらかじめfalseをいれる
	 * つまり初期状態（loginId等がnullのとき）ではかならずfalseとなる
	 */
	private boolean loginFlg=false;

	/*
	 *String型でgetメソッドを実行した後loginIdに値を返す
	 */
	public String getLoginId() {
		return loginId;
	}
	/*
	 *setメソッドで引数-String型のloginIdの値を格納
	 */

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}


}

package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware{

	//入力されたログイン情報(idとpass)を処理するし渡すためのフィールド
	private String loginUserId;
	private String loginPassword;
	//DAOから返された値をブラウザに表示するためのresult
	private String result;
	//
	private Map<String,Object>session;

    //DBへの接続を担うDAO 値の受け渡しを担当するDTOのインスタンスを生成する
	private LoginDAO loginDAO=new LoginDAO();
	//DAOをインスタンス化するとログイン情報がDAOに渡される
	private LoginDTO loginDTO=new LoginDTO();


	public String execute(){
		//resultにエラーを代入　ログインエラー
		result=ERROR;

		//DaoクラスでDBから取り出しDTOに格納した情報をloginDTOに代入

		//loginDTOにlogin
		loginDTO=loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		//sessionにloginUserというkeyをつけ格納（保存）
		session.put("loginUser", loginDTO);


		//もし((LoginDTO型)でsessionに("loginUser”)というキーワードで格納した値を取り出し)、
		//その値がgetフラグメソッドで()だったら、結果をSUCCESSに
		//つまりログイン状態に
		/*
		 *DAOクラスの
				if(!(rs.getString("login_id").equals(null))){
						loginDTO.setLoginFlg(true);
		 *
		 */

		//sessionは一度箱に入れるとObject型に変わってしまうのでキャスト変換()でもう一度LoginDTO型に直しそこから前文で定義したキーワードloginUserをsessionから引っ張り
		//DAOでflgにtureと入れた値をひっぱている
		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;

			return result;
		}
		return result;
	}

	//getterとsetterを準備


	public String getLoginUserId() {
		return loginUserId;
	}


	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}


	public String getLoginPassword() {
		return loginPassword;
	}


	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}


	@Override


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}

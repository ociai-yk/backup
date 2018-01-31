package com.internousdev.template2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dao.LoginDAO;
import com.internousdev.template2.dao.BuyItemDAO;
import com.internousdev.template2.dto.LoginDTO;
import com.internousdev.template2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String result;
	private Map<String,Object>session;
	private String message;

	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();
	private boolean loginFlg;

	private BuyItemDAO buyItemDAO=new BuyItemDAO();


public String execute(){
	result=ERROR;

    //ログインフラグがfaleだったら値が取れていない＝＝入力値が異なる
	//loginUserIdとloginPasswordが空だったらnull

	loginDTO=loginDAO.getLoginUserInfo(loginUserId,loginPassword);

	session.put("loginUser", loginDTO);


	    /*-------------------------------------------
	     * 購入　メソッド
	     ---------------------------------------------*/
		BuyItemDTO buyItemDTO=buyItemDAO.getBuyItemInfo();
		session.put("login_user_id", loginDTO.getLoginId());
		session.put("id", buyItemDTO.getId());
		System.out.println(buyItemDTO.getItemName());
		session.put("buyItem_name",buyItemDTO.getItemName());
		session.put("buyItem_price",buyItemDTO.getItemPrice());


		return result;
	}

public String getLoginUserId(){
	return loginUserId;
}
public void setLoginUserId(String loginUserId){
	this.loginUserId=loginUserId;
}
public String getLoginPassword(){
	return loginPassword;
}
public void setLoginPassword(String loginPassword){
	this.loginPassword=loginPassword;
}
@Override
public void setSession(Map<String,Object>session){
	this.session=session;
}
public boolean isLoginFlg() {
	return loginFlg;
}
public void setLoginFlg(boolean loginFlg) {
	this.loginFlg = loginFlg;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}


}

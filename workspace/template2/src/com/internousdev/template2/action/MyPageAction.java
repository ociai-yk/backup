package com.internousdev.template2.action;

import java.sql.SQLException;
import java.util.ArrayList;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dao.MyPageDAO;
import com.internousdev.template2.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;


public class MyPageAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	private MyPageDAO dao=new MyPageDAO();
	public ArrayList<MyPageDTO> myPageList=new ArrayList<MyPageDTO>();

	private String deleteFlg;
	private String message;

//���i�����擾���\�b�h
	public String execute() throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}
		//���i�������폜���Ȃ��ꍇ
		if(deleteFlg==null){
			String item_transaction_id=session.get("id").toString();
			String user_master_id=session.get("login_user_id").toString();

			myPageList=dao.getMyPageUserInfo(item_transaction_id, user_master_id);


		//���i�������폜����ꍇ
			}else if(deleteFlg.equals("1")){
				delete();
			}
			String result=SUCCESS;
			return result;

		}


	//���i�����폜
	public String delete () throws SQLException{
		 String result=ERROR;
		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();

		int res=dao.buyItemHistoryDelete(item_transaction_id,user_master_id);

		if(res>0){
			myPageList=null;
			setMessage("���i���𐳂����폜���܂����B");
		    result=SUCCESS;
		}else if(res==0){
			setMessage("���i���̍폜�Ɏ��s���܂����B");
			result=SUCCESS;
		}
		return result;
	}


	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
@Override

public void setSession(Map<String,Object>session){
         this.session=session;
}
public String getMessage(){
	return message;
}
public void setMessage(String message){
	this.message=message;
}


}

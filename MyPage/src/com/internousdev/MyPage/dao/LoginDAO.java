package com.internousdev.MyPage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.MyPage.dto.LoginDTO;
import com.internousdev.MyPage.util.DBConnector;

public class LoginDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();

	private LoginDTO loginDTO=new LoginDTO();

	/*
	 * ログインユーザー情報取得メソッド
	 */

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){

		String sql="select * from login_user_transaction where login_id=? and login_pass=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));

				if(!(rs.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;

	}
	public LoginDTO getloginDTO(){
		return loginDTO;
	}


}

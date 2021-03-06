package com.internousdev.ecsite.dao;
/*
 * Actionから直接送られてきた値を処理しDatabaseに接続
 * Databaseの値比較しDTOを介し結果の値をActionに渡す
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {

	//フィールド作成
	//DBConnectorのインスタンスを生成しDBとつなぐ
	private DBConnector db=new DBConnector();
	//conにDBConnectorに記述したgetConnectionメソッドを代入
	private Connection con=db.getConnection();
	/*
	 * DTOのフィールド
	 * private String loginId,
	 * private String loginPassword,
	 * private String userName
	 * DTOのインスタンスを生成し、
	 * Actionに値を渡すための箱を準備
	*/
	private LoginDTO loginDTO=new LoginDTO();

	//LoginDTO型メソッド LoginUserInfo（mation）をDBから取得する
	//引数はActionから値を受け取るためのもの
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		//データベースから値を取り出す指示文
		String sql="select * from login_user_transaction where login_id = ? and login_pass=?";


		try{
		   //準備したsql文をconで実行し、実際に値を取得
			PreparedStatement ps=con.prepareStatement(sql);
			//DBからとってきた値をどこに格納するか指定
			ps.setString(1, "loginId");//DTOで設定した名前と一致させる
			ps.setString(2, "loginPassword");
			//実行結果はrsに代入する sql-select文はexecuteQuery
			ResultSet rs=ps.executeQuery();

			//データベースに値が存在する場合loginDTOに値を格納する機能
			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("username"));

				//値がなくなったら??
				if(!(rs.getString("login_id").equals(null))){
						loginDTO.setLoginFlg(true);
			}

			}

		}catch(Exception e){
			e.printStackTrace();
		}
		//値はLoginDTO型なのでloginDTOに返す
		return loginDTO;
	}
	public LoginDTO getLoginDTO(){
		return loginDTO;
	}



}

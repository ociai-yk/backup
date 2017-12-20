package com.internousdev.template2.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.internousdev.template2.util.DBConnector;
import com.internous

import com.mysql.jdbc.Connection;

public class BuyItemCompleteDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConncetion();
	private DateUtil dateUtil=new DateUtil();
	private String sql="insert into user_buy_transaction(item_transaaction_id,tota_price,total_count,user_master_id,pay,insert_date)VALUES (?,?,?,?,?,?)";

	public void buyItemInfo(String item_transaction_id,String user_master_id, String total_price, String total_count,String pay)throws SQLException{
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);
			ps.setString(6, dateUtil.getDate());

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close()
		}
	}

}


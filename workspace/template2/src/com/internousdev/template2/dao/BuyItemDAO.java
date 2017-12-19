package com.internousdev.template2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template2.dto.BuyItemDTO;
import com.internousdev.template2.util.DBConnector;

public class BuyItemDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private BuyItemDTO buyItemDTO=new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(){
		String sql="selsct id, item_name, item_price from item_info_transaction";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));


			}

			}catch(Exception e ){
				e.printStackTrace();
		}
		return buyItemDTO;
	}
	public BuyItemDTO getBuyItemDTO(){
		return buyItemDTO;
	}

}

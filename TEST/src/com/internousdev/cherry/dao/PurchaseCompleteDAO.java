package com.internousdev.cherry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.cherry.dto.CartInfoDTO;
import com.internousdev.cherry.util.DBConnector;

public class PurchaseCompleteDAO {

	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	/*
	 * カートテーブルを購入履歴に登録するメソッド 1.カートテーブルを取得 2.購入履歴に登録
	 *
	 *
	 */

	// 取得

	public ArrayList<CartInfoDTO> getCartInfo(String userId) throws SQLException {

		CartInfoDTO dto = new CartInfoDTO();
		ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
		String sql = "SELECT * from cart_info wehere user_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				dto.setUserId(rs.getString("user_id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setPrice(rs.getInt("price"));
				dto.setUpdateDate(rs.getDate("update_date"));
				dto.setRegistDate(rs.getDate("regist_date"));

				cartList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			con.close();

		}
		return cartList;

	}

	// 登録

	public int setPurchseHistory(List<CartInfoDTO> cartList) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		//sql 初期値null
		String sql = null;
		//int型でActionからcartListを引数で受け取り、変数名retの初期値を0(未処理なら0のまま)
		int ret=0;
        //for文でcatListを回し、カート情報の件数ぶん検索をかける→件数処理がretに入る
		try {
			for (int i = 0; i < cartList.size(); i++) {
				sql = "INSERT INTO purchase_history_info(user_id,product_id,product_count,update_date) VALUES(?,?,?,NOW())";

				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cartList.get(i).getUserId());
				ps.setInt(2, cartList.get(i).getProduct_id());
				ps.setInt(3, cartList.get(i).getProductCount());
				//+= 以上が実行され登録されるたびに足す処理
				ret += ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			con.close();

		}

		return ret;
	}
}

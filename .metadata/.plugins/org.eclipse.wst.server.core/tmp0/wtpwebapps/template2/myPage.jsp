<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="descriotion" content=""/>
<meta name="keywords" content=""/>
<title>MyPage画面</title>
<style type="text/css">


</style>
</head>
<body>

  <div id="header">
    <div id="pr"></div>
  </div>

  <div id="main">
    <div id="top">
      <p>MyPage</p>
    </div>
    <div>
     <s:if test="myPageList == null">
        <h3>ご購入情報はありません。</h3>
        </s:if>
      <s:elseif test="message == null">
        <h3>ご購入情報は以下になります。</h3>

        <table border="1">
          <tr>
            <th>商品名</th>
            <th>値段</th>
            <th>購入個数</th>
            <th>支払い方法</th>
            <th>購入日</th>
          </tr>
          <s;iterator value="myPageList">
          <tr>
            <td><s:property value="itemName"/></td>
            <td><s:property value="totalPrice"/><span>円</span></td>
            <td><s:property value="totalCount"/><span>個</span></td>
            <td><s:property value="payment"/></td>
            <td><s:property value="insert_date"/></td>
          </tr>
          </s:iterator>
        </table>
        <s:form action="MypageAction">
          <input type>
    </div>
  </div>

  <div id="footer">
    <div id="pr"></div>
  </div>

</body>
</html>
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
<head>
<title>ByItemConfirm画面</title>

<style type="text/css">
body{
    margin:0;
    padding:0;
    line-height:1.6;
    letter-spacing:1px;
    font-size:12px;
    font-family:Verdana,Helvetica,sans-serif;
    color:#333;
    background:#fff;
}
table{
     margin:0 auto;
     text-align:center;
}

#header{
       width:100%;
       height:80px;
       background-color:black;
}
#main{
     width:100%;
     height:500px;
     text-align:center;
}
#top{
    width:780px;
    margin:30px auto;
    border:1px solid #333;
}
#footer{
    width:100%;
    height:80px;
    background-color:black;
}

</style>
</head>
<body>
<div id="header"></div>

<div id="main">
  <div><p>BuyItemConfirm</p></div>

  <div>
    <s:form action="BuyItemConfirmAction">
    <table>
      <tr>
        <td>商品名</td>
        <td><s:property value="#session.buyItem_name"/></td>
      </tr>
      <tr>
        <td>値段</td>
        <td><s:property value="#session.buyItem_price"/><span>円</span></td>
      </tr>
      <tr>
        <td>購入個数</td>
        <td><s:property value="#session.stock"/><span>個</span></td>
      </tr>
      <tr>
        <td>支払い方法</td>
        <td><s:property value="#session.pay"/></td>
      </tr>
      <tr>
        <td><s:submit value="完了"/></td>
      </tr>
    </table>

    </s:form>
  </div>
</div>
<div id="footer"></div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="descriotion" content=""/>
<meta name="keywords" content=""/>
<title>HOME画面</title>
<style type="text/css">
body{
margin:0;
padding:0;
line-height:1.6;
letter-spacing:1px;
fonst-size:12px;
font-family:Verdana,Helvetic,sans-serif;
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
background-color:#fffacd;
}
#main{
width:100%;
height:500px;
text-align:center;
}
#top{
width:780px;
margin: 30px auto;
border:1px solid #ccebff;
}
#footer{
width:100%;
height:80px;
background-color:#fffacd;
clear:both;
}

</style>
</head>
<body>
<div id="header">
  <div id="pr"></div>
</div>

<div id="main">
  <div id="top">
    <p>Home<p>
  </div>

  <div>
    <s:form action="HomeAction">
      <s:submit value="商品購入"/>
    </s:form>
  </div>
</div>

<div id="footer">
  <div id="pr"></div>
</div>

</body>
</html>
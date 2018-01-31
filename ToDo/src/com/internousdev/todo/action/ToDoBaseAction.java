package com.internousdev.todo.action;


import com.

public class ToDoBaseAction extends ActionSupport implements
ScopedModelDriven<LoginModel> {

protected LoginModel user; // LoginModelクラス
private String scopeKey;   // セッションでのModelオブジェクト識別キー


}
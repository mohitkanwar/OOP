package com.abc.controller;

public abstract class LoginController {

	public abstract String getNameFromUser();

	public abstract String getPasswordFromUser();

	public abstract String getViewFor(String name, String password);

}

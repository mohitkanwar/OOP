package com.abc.main;

import com.abc.controller.LoginController;
import com.abc.controller.LoginControllerImpl;

public class Main {

	public static void main(String[] args) {
		LoginController l = new LoginControllerImpl();
		String name=l.getNameFromUser();
		String password=l.getPasswordFromUser();
		String viewmsg=l.getViewFor(name,password);
		System.out.println(viewmsg);

	}

}

package com.calc.formlayout;

import com.calc.Application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application
			.instance
			.setTitle("Email Composer")
			.build(new EmailFormBuilder())
			.run();
	}

}

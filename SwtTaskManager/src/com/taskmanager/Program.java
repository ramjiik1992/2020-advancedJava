package com.taskmanager;

import com.taskmanager.builder.TaskManagerFormDisplayBuilder;
import com.taskmanager.utils.Application;

public class Program {

	public static void main(String[] args) {

		Application
			.instance
			.setTitle("Task Manager")
			.build(new TaskManagerFormDisplayBuilder())
			.run();
		
		
	}

}

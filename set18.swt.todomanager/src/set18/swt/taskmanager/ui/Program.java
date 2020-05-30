package set18.swt.taskmanager.ui;

import com.calc.utility.Application;
import in.conceptarchitect.taskmanager.model.DummyProjectSource;
import in.conceptarchitect.taskmanager.model.ProjectManager;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application
				.instance
				.addService("project-manager", new ProjectManager())
				.addService("dummy-project-source",new DummyProjectSource())
				
				
				.setTitle("Task Manager -- (New Project)")
				.build(new TaskManagerMainScreen())
				
				//.packShell()
				
				.center()				
				.run();
		
	}

}

package day06.practice;
import java.util.ArrayList;
public class Task {

		public String taskName;

		public int priority;

		public static void main(String[] args) {

			ArrayList<Task> taskList = new ArrayList<>();

			Task task1 = new Task();
			task1.taskName = "Task 1";
			task1.priority = 1;
			taskList.add(task1);

			Task task2 = new Task();
			task2.taskName = "Task 2";
			task2.priority = 2;
			taskList.add(task2);

			Task task3 = new Task();
			task3.taskName = "Task 3";
			task3.priority = 3;
			taskList.add(task3);
			
			Task task4 = new Task();
			task3.taskName = "Task 4";
			task3.priority = 4;
			taskList.add(task3);
			
			
			System.out.println(taskList);
		}
	}


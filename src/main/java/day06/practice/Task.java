package day06.practice;
import java.util.ArrayList;
class addTask {

	private int taskId;
	String taskName;
	private String description;

	// Constructor
	public addTask(int taskId, String taskName, String description) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
	}

	@Override
	public String toString() {
		return "taskID: " + taskId + ", taskName: " + taskName + ", description: " + description;
	}
}
public class Task {
	public boolean findTaskByName(String name, ArrayList<addTask> taskList) {
		boolean check = false;

		for (addTask value : taskList) {
			if (value.taskName.equals(name)) {
				check = true;
				break;
			}

		}
		return check;
	}

	public static void main(String[] args) {

		ArrayList<addTask> taskList = new ArrayList<>();

		taskList.add(new addTask(1, "Task 1", "Complete practice"));
		taskList.add(new addTask(2, "Task 2", "Do FacePrep Sums."));
		taskList.add(new addTask(3, "Task 3", "Prepare for the CPR."));

		for (addTask task : taskList) {
			System.out.println(task);
		}

	}
	}


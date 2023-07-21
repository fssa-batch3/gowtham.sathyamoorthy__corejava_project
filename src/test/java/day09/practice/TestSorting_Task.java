package day09.practice;

import java.time.LocalDate;
import java.util.*;

class AdddTask implements Comparable<AddTask> {
	private int id;
	private String name;
	private LocalDate deadLine;

	public AdddTask(String name, int id, String date) {
		this.name = name;
		this.id = id;
		this.deadLine = LocalDate.parse(date);
	}

	public LocalDate getDeadLine() {
		return deadLine;
	}

	@Override
	public String toString() {
		return "Task : " + name + ", Deadline :" + deadLine + ", Id :" + id;
	}

	@Override
	public int compareTo(AddTask task) {
		return this.deadLine.compareTo(task.getDeadLine());
	}
}

public class TestSorting_Task {

	public static void main(String[] args) {
		List<AdddTask> arr = new ArrayList<>();
		AdddTask task1 = new AdddTask("Tech practice", 1, "2023-07-22");
		AdddTask task4 = new AdddTask("fop", 1, "2023-07-22");
		AdddTask task2 = new AdddTask("chatting", 2, "2015-06-05");
		AdddTask task3 = new AdddTask("learn spring boot", 3, "2033-09-30");

		arr.add(task1);
		arr.add(task2);
		arr.add(task3);
		arr.add(task4);

		System.out.println(arr);

		Collections.sort(arr);

		System.out.println(arr);

	}
}

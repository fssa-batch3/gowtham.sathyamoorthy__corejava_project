package day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class TestSorting_integer {

	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<>();
		Numbers.add(8);
		Numbers.add(9);
		Numbers.add(45);
		Numbers.add(12);
		Numbers.add(1);

		System.out.println("Before Sort:" + Numbers);
		Collections.sort(Numbers);
		System.out.println("After Sort:" + Numbers);
		Collections.reverse(Numbers);
		System.out.println("After reverse Sort:" + Numbers);
	}
}

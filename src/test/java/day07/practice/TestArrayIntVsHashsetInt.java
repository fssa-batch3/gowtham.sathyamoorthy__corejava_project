package day07.practice;
import java.util.ArrayList;
import java.util.HashSet;
public class TestArrayIntVsHashsetInt {


	
		public static void main(String[] args) {

			// ArrayList stores duplicates
			ArrayList<Integer> Number = new ArrayList<Integer>();
			Number.add(1);
			Number.add(2);
			Number.add(4);
			Number.add(8);

			System.out.println("Using ArrayList :" + Number);

			// Set stores unique elements and ignores duplication
			HashSet<Integer> Numbers = new HashSet<Integer>();
			Numbers.add(1);
			Numbers.add(1);
			Numbers.add(2);
			Numbers.add(2);

			System.out.println("Using Set :" + Numbers);

		}
	}



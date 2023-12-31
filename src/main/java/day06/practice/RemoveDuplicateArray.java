package day06.practice;

import java.util.ArrayList;

public class RemoveDuplicateArray{
    public static void main(String[] args) {
        // Create an ArrayList with duplicate elements
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Chennai");
        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Mumbai");
        cityList.add("Delhi");
        cityList.add("Lucknow");

        ArrayList<String> duplicateList = new ArrayList<>();
        for (String list : 
        	cityList) {
            if (!duplicateList.contains(list)) {
            	duplicateList.add(list);
            }
        }

        for (String lists : duplicateList) {
            System.out.println(lists);
        }
    }
}

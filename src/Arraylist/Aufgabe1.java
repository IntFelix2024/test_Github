package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe1 {
	
	public static void reduceToComments(List<String>lines) {
		if(lines.size()%4 == 0) {
		for(int i = 0; i < lines.size()-3; i++) {
			lines.remove(i);
			lines.remove(i);
			lines.remove(i);
		}
		System.out.println(lines);
		} else {
			System.out.println("Nicht durchführbar");
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> test = new ArrayList<String>();
		for(int i = 0; i < 20; i++){
		test.add("k");
		test.add("v");
		test.add("w");
		test.add("ko");
		}
		reduceToComments(test);
	}
}

package Stacks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswortTester {
	
	public static boolean passwortTesten(String input) {		
	
		boolean specialSignsUsed = false;
		boolean numeralsUsed = false;
		boolean lowerCaseUsed = false;
		boolean upperCaseUsed = false;		
		Pattern usableSigns = Pattern.compile("[!?/*+-]");
		Pattern numerals = Pattern.compile("[0-9]"); // 0 bis 9
		Pattern p1 = Pattern.compile("[a-z]");
		Pattern p2 = Pattern.compile("[A-Z]");
		Matcher usableSignsMatcher = usableSigns.matcher(input);
		Matcher numeralsMatcher = numerals.matcher(input);
		Matcher p1Matcher = p1.matcher(input);
		Matcher p2Matcher = p2.matcher(input);
		if(usableSignsMatcher.find()) {
			specialSignsUsed = true;	
		} else {
			specialSignsUsed = false;
		}
		if(numeralsMatcher.find()) {
			numeralsUsed = true;
		} else {
			numeralsUsed = false;
		}
		if(p1Matcher.find()) {
			lowerCaseUsed = true;
		} else {
			lowerCaseUsed = false;
		}
		if(p2Matcher.find()) {
			upperCaseUsed = true;
		} else {
			upperCaseUsed = false;
		}
		System.out.println(" Special Signs \t" +  specialSignsUsed + 
				"\n numerals \t" +  numeralsUsed +
				"\n lower Case \t" + lowerCaseUsed +
				"\n upper Case \t" + upperCaseUsed);
		
		if(specialSignsUsed == true && numeralsUsed == true && lowerCaseUsed == true && upperCaseUsed == true) {
			return true;
		}else {
		return false;
		}
	}

	public static void main(String[] args) {
		String str = "TEST634+5";
		System.out.println(passwortTesten(str));
	}

}

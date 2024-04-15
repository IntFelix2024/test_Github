package Stacks;

import java.util.Stack;

public class Aufgabe2 {
	
	private static boolean regelmäßigkeitPrüfen(char input1, char input2, char input3, char input4, Stack inputStack1, Stack inputStack2){
			if(inputStack1.size()==inputStack2.size()) {
				for(int i = 0; i < inputStack1.size(); i++) {
					if(inputStack1.get(i).equals(input1)&&inputStack2.get(i).equals(input3)) {
						return false;
					}
					if(inputStack1.get(i).equals(input2)&&inputStack2.get(i).equals(input4)) {
						return false;
					}
						
				}
			}else {
				return false;
			}
		return true;
	}
	
	public static String klammernPrüfen(String input) {
		Stack <Character> stackInput = new Stack<>();
		Stack <Character> klammerOffen = new Stack<>();
		Stack <Character> klammerZu = new Stack<>();
		int klammerZaehlerOffen = 0;
		int klammerZaehlerZu = 0;
		char input1 = '{';
		char input2 = '(';
		char input3 = '}';
		char input4 = ')';
		
		for(int i = 0; i < input.length(); i++) {
			stackInput.add(input.charAt(i));
		}
		
		for(int i = 0; i < stackInput.size(); i++) {
			if(stackInput.get(i).equals(input1)||stackInput.get(i).equals(input2)) {
				klammerOffen.add(stackInput.get(i));
				klammerZaehlerOffen++;
			}
			if(stackInput.get(i).equals(input3)||stackInput.get(i).equals(input4)) {
				klammerZu.add(stackInput.get(i));
				klammerZaehlerZu++;
			}
		}
		System.out.println(regelmäßigkeitPrüfen(input1, input2, input3, input4, klammerOffen, klammerZu));
		System.out.println(klammerOffen);
		System.out.println(klammerZu);
		return stackInput.toString();
	}

	public static void main(String[] args) {
		
		String input1 = "{(Helloa}";
		System.out.println(klammernPrüfen(input1));
		
		

	}
}
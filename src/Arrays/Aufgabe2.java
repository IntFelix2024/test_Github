package Arrays;

public class Aufgabe2 {
	
	public static boolean isProbablyApproaching(String[]signs) {
		for(int i = 0; i < signs.length-4; i++) {
			if(signs[i].equals(signs[i+1])&&signs[i+2].equals(signs[i+3])) {
				int i2 = (i+3);
				System.out.println("Salty Snooks Konvoi kommt zwischen Schiff " + i + " und Schiff " + i2 + " vorbei");
				return true;
			}
		}
		System.out.println("Salty Snook fährt nicht vorbei");
		return false;
	}

	public static void main(String[] args) {

		String[] signs1 = {"F", "DO", "MOS", "MOS", "MOS", "MOS", "WES"};
		
		String[] signs2 = {"F", "DO", "MOS", "MOS", "WES", "MOS","MOS"}; 
		
		isProbablyApproaching(signs1);
		isProbablyApproaching(signs2);
	}

}

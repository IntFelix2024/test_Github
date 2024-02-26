package Arrays;

public class Aufgabe1 {
	
	public static int count5PercentJumps(int[]gains) {
		int count = 0;
		for(int i = 0; i < gains.length-1; i++) {
			if(gains[i]*1.05>gains[i+1]) {
				count ++;
			}
		}
		System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) {
		int[]dailyGains = {1000, 2000, 500, 9000, 9010 };
		
		count5PercentJumps(dailyGains);
	}

}

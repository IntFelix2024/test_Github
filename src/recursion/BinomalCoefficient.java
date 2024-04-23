package recursion;

public class BinomalCoefficient {

	public static int calculateBinomalCoefficient(int n, int k) {
		if(k == 0 || k == n) {
			return 1;
		} else {
			return calculateBinomalCoefficient(n-1,k-1)+calculateBinomalCoefficient(n-1,k);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calculateBinomalCoefficient(4,2));
	}
}
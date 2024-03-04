package Arrays;

public class Aufgabe4 {
	
	public static int[][]magnify(int[][]array, int factor){
		int magnify[][] = new int [array.length*factor][array[0].length*factor];
		for(int x = 0; x < array.length; x++) {
			for(int y = 0; y < array[0].length; y++) {
			//	magnify[x*factor][y*factor] = array[x][y];
				System.out.println(magnify[x][y]);
			}
		}
		return magnify;
	}

	public static void main(String[] args) {
		int numbers[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
		magnify(numbers, 2);
	}

}

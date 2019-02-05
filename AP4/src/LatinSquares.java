/**
 * 
 * @author Kyle Parke
 *
 */
public class LatinSquares {
	static int [][] arr2D = {{0,1,2},{3,4,5},{6,7,8},{9,5,3}};
	/**
	 * 
	 * @param arr2D +3 size of arr2D.length, no bound errors, assigned element to new array
	 * @param c constant
	 * @return +1 elements in correct order
	 */
	public static int[] getColumn(int[][] arr2D, int c) {
		int[] result=new int[arr2D.length];
		for(int r=0;r<arr2D.length;r++) {
			result[r]=arr2D[r][c];
		}
		return result;
	}
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		return false;
		
	}
	public static boolean containsDuplicates(int[] arr) {
		return false;
		
	}
	/**
	 * +4 calls containsDuplicates and hasAllValues,applies hasAllValues and obtains valid column from square
	 * @param square
	 * @return  +1true/false appropriately
	 */
	public static boolean isLatin(int[][] square) {
		if(containsDuplicates(square[0])) {
			return false;
		}
		for(int r=1;r<square.length;r++) {
			if(!hasAllValues(square[0],square[r])) {
				return false;
			}
		}
		for(int c=0;c<square[0].length;c++) {
			if(!hasAllValues(square[0],getColumn(square,c))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] result =LatinSquares.getColumn(arr2D,1);
		
		for(int x: result) {
			System.out.print(x);
		}
	}
}
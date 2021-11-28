package step_homesork;

public class prob2_1 {
	public static void main(String[] args) {
		int[] array = {3, 24, 1, 55, 17, 43, 5};
		
		int temp = 0;
		
		for(int i=0; i<=array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(j+1 < array.length) {
					if(array[j] > array[j+1]) {
						temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			
			if(i != array.length-1) {
				System.out.print(", ");
			} else {
				System.out.println("");
			}
		}
	}
}

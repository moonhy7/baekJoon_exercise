package step_homesork;

public class SortUtil {
	public int[] ascending(int[] inputNumbers) {
		int temp = 0;
		
		for(int i=0; i<=inputNumbers.length; i++) {
			for(int j=0; j<inputNumbers.length; j++) {
				if(j+1 < inputNumbers.length) {
					if(inputNumbers[j] > inputNumbers[j+1]) {
						temp = inputNumbers[j];
						inputNumbers[j] = inputNumbers[j+1];
						inputNumbers[j+1] = temp;
					}
				}
			}
		}
		return inputNumbers;
	}

	public static void main(String[] args) {
		SortUtil util = new SortUtil();
		int[] numbers = new int[] {7, 5, 2, 19, 34,51, 32, 11, 67, 21};
		
		
		numbers = util.ascending(numbers);

		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]);
			
			if(i != numbers.length-1) {
				System.out.print(", ");
			} else {
				System.out.println("");
			}
		}
		System.out.println("Successfully!!!");
	}
}

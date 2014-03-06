public class Selection {
	
	public int[] numbers = {3, 1, 6, 7, 1, 2};
	public static void main(String[] args) {
		
	}
	public Selection(int[] numbers) {
		int placeHolder = numbers[0];
		i

		for (int k=1; k<numbers.length(); k++) {
			for (int s = placeHolder + 1; s<numbers.length(); s++) {
				if (numbers[s] < numbers[k-1]) {
					;
					
				}
			}
			
		}
	}

	public void print(int[] numbers) {
		for (int i=0; i<numbers.length(); i++) {
			System.out.println(numbers[i]);
		}
	}

	public boolean isSorted(int[] numbers) {
		for (int j=1; j<numbers.length; j++) {
			if (numbers[j] <= numbers[j-1]) {
				return true;
			} else {
				return false;
			}
		}
	}

	
	}
}
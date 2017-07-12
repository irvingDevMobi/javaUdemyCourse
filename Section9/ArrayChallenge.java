import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

	public static void main(String[] args) {
		int n = 5;
		int []  values = getIntegers(n);
		printIntArray(values);
		printIntArray(sortedIntegers(values));
		
	}
	
	static int[] getIntegers(int nInputs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type " + nInputs + " numbers");
		int[] inputs = new int[nInputs];
		for (int i = 0; i < nInputs; i++) {
			inputs[i] = scanner.nextInt();
		}
		return inputs;
	}
	
	static void printIntArray(int [] array) {
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
	
	static int [] sortedIntegers(int [] unorderedArray) {
		int [] sortedArray = Arrays.copyOf(unorderedArray, unorderedArray.length);
		for (int i = 0; i < sortedArray.length - 1; i++) {
			for (int j = i+1; j < sortedArray.length; j++) {
				if (sortedArray[j] > sortedArray[i]) {
					int aux = sortedArray[j];
					sortedArray[j] = sortedArray[i];
					sortedArray[i] = aux;	
				}
			}
		}			
		return sortedArray;
	}
}
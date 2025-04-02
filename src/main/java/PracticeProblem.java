import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {

	}

		public static int[] bubbleSort(double[] num){
				int[] data = new int[2];
				for(int i = 0; i < num.length; ++i){
						boolean sorted = true;
						for(int j = 0; j < num.length-i-1; ++j){
								data[1]++;
								if(num[j] > num[j+1]){
										double temp = num[j];
										num[j] = num[j+1];
										num[j+1] = temp;
										sorted = false;
										data[0] += 3;
								}
						}
						if(sorted){
								break;
						}
				}
				return data;
		}

		public static int[] selectionSort(double[] num){
				int[] data = new int[2];
				for(int i = 0; i < num.length-1; ++i){
						int maxIndex = i;
						for(int j = i+1; j < num.length; ++j){
								data[1]++;
								if(num[j] < num[maxIndex]){
										maxIndex = j;
										data[0]++;
								}
						}
						double temp = num[i];
						num[i] = num[maxIndex];
						num[maxIndex] = temp;
						data[0] += 3;
				}
				return data;
		}

		static int[] insertionSort(double[] num){
				int[] data = new int[2];
				for(int i = 1; i < num.length; ++i){
						double key = num[i];
						data[0]++;
						int index = i-1;
						for(;index > -1 && key < num[index]; --index){
								data[1]++;
								num[index+1] = num[index];
								data[0]++;
						}
						num[index+1] = key;
						data[0]++;
				}
				return data;
		}
	public static String leastSwaps(double[] nums) {
		double[] nums1 = nums.clone();
		double[] nums2 = nums.clone();

		int bubbleSwaps = bubbleSort(nums)[0];
		int selectionSwaps = selectionSort(nums1)[0];
		int insertionSwaps = insertionSort(nums2)[0];

		if(bubbleSwaps <= insertionSwaps && bubbleSwaps <= selectionSwaps){
			return "Bubble";
	}else if(insertionSwaps <= selectionSwaps){
			return "Insertion";
	}else{
			return "Selection";
	}

	}
	public static String leastIterations(double[] nums) {
		double[] nums1 = nums.clone();
		double[] nums2 = nums.clone();

		int bubbleComps = bubbleSort(nums)[1];
		int selectionComps = selectionSort(nums1)[1];
		int insertionComps = insertionSort(nums2)[1];

		if(bubbleComps <= insertionComps && bubbleComps <= selectionComps){
			return "Bubble";
	}else if(insertionComps <= selectionComps){
			return "Insertion";
	}else{
			return "Selection";
	}
	}
}

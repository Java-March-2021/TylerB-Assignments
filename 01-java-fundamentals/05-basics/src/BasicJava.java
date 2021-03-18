import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
	public Integer printNums(int maxInt) {
		for(int i = 0; i <= maxInt; i++) {
			System.out.println(i);
		}
		return null;
		
	}
	public Integer printOdds(int maxInt) {
		for(int i = 0; i <= maxInt; i++) {
			if(i % 2 == 1){
				System.out.println(i);
			}
		}
		return null;
	}
	public void printSum(int maxInt) {
		int sum = 0;
		for(int i = 0; i<= maxInt; i++) {
			sum = sum + i;
			System.out.println("New number:" + i + " Sum:" + sum);
		}
	}
	public void arrItem(int[] myArray) {
		for(int i : myArray) {
			System.out.println(i);
		}
	}
	public int findMax(int[] arrMax) {
		int max = arrMax[0];
		for (int i = 0; i < arrMax.length; i++) {
			if (arrMax[i] > max) {
				max = arrMax[i];
			}
		}
		return max;
	}
	public int findAvg(int[]thisArr) {
		int sum = 0;
		for (int i = 0; i < thisArr.length; i++) {
			sum = sum + thisArr[i];
		}
		int avg = sum / thisArr.length;
		return avg;
	}
	public ArrayList<Integer> arrList(int num) {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i = 0; i <= num; i++) {
			if(i % 2 == 1) {
				y.add(i);
			}
		}
		return y;
	}
	public int greaterThanY(int[] thisArr, int y) {
		int sum = 0;
		for(int i = 0; i < thisArr.length; i++) {
			if (thisArr[i] > y) {
				sum = sum + 1;
			}
		}
		return sum;
	}
	public ArrayList<Integer> valSquared(int[] thisArr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for(int i = 0; i < thisArr.length; i++) {
			newArr.add(thisArr[i]*thisArr[i]);
		}
		return newArr;
	}
	public void noNeg(int[] thisArr) {
		for(int i = 0; i < thisArr.length; i++) {
			if (thisArr[i] < 0) 
				thisArr[i] = 0;
		}
		System.out.println(thisArr);
	}
	public void maxMinAvg(int[] thisArr) {
		int max = thisArr[0];
		int min = thisArr[0];
		int sum = 0;
		for(int i = 0; i < thisArr.length; i++) {
			if(thisArr[i] > max) {
				max = thisArr[i];
			}
			if(thisArr[i] < min) {
				min = thisArr[i];
			}
			sum = sum + thisArr[i];
		}
		int avg = sum / thisArr.length;
		int[] resultArr = {max, min, avg};
		System.out.println(Arrays.toString(resultArr));
	}
	public void valShift(int[] thisArr) {
		for(int i = 0; i < thisArr.length; i++) {
			if(i == thisArr.length - 1) {
				thisArr[i] = 0;
			} else {
				thisArr[i] = thisArr[i + 1];
			}
		}
		System.out.println(Arrays.toString(thisArr));
	}
}

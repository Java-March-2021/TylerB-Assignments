import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class PuzzleJava {
	public ArrayList<Integer> sumArray(int[] numArr) {
		int sum = 0;
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
			if (numArr[i] > 10) {
				newArr.add(numArr[i]);
			}
		}
		System.out.println(sum);
		return newArr;
	}
	public ArrayList<String> nameArray(String[] nameArr){
		ArrayList<String> newArr = new ArrayList<String>();
		for(int i = 0; i < nameArr.length; i++) {
			if (nameArr[i].length() > 5) {
				newArr.add(nameArr[i]);
			}
		}
		List<String> strList = Arrays.asList(nameArr);
		Collections.shuffle(strList);
		System.out.println(strList);
		return newArr;
	}
	public String abcShuffle(String[] abcArr) {
		List<String> abcs = Arrays.asList(abcArr);
		Collections.shuffle(abcs);
		abcs.toArray(abcArr);
		System.out.println(abcArr[0]);
		System.out.println(abcArr[25]);
		if(abcArr[0] == "a" ||
				abcArr[0] == "e" ||
				abcArr[0] == "i" ||
				abcArr[0] == "o" || 
				abcArr[0] == "u") {
			return "Vowel detected!";
		}
		return null;
	}
	public ArrayList<Integer> randomTen() {
		ArrayList<Integer> randArray = new ArrayList<Integer>();
		Random num = new Random();
		for (int i = 0; i < 10; i++) {
			int newNum = num.nextInt(45) + 55;
			randArray.add(newNum);
		}
		return randArray;
	}
	public ArrayList<Integer> randomThenSort() {
		ArrayList<Integer> randArray = new ArrayList<Integer>();
		Random num = new Random();
		for (int i = 0; i < 10; i++) {
			int newNum = num.nextInt(45) + 55;
			randArray.add(newNum);
		}
		Collections.sort(randArray);
		return randArray;
	}
	public String randString() {
		StringBuilder result = new StringBuilder();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random num = new Random();
		for(int i = 0; i < 5; i++) {
			String letter = Character.toString(alphabet.charAt(num.nextInt(26)));
			result.append(letter);
			System.out.println(letter);
		}
		String randomString = result.toString();
		return randomString;
	}
	public ArrayList<String> tenStrings(){
		ArrayList<String> tenStrings = new ArrayList<String>();
		for(int i = 0; i < 10; i++) {
			String str = randString();
			tenStrings.add(str);
		}
		return tenStrings;
	}
}

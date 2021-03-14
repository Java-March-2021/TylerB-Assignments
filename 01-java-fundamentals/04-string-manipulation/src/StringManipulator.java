
public class StringManipulator {
	public String trimAndConcat(String string1, String string2) {
		String trim1 = string1.trim();
		String trim2 = string2.trim();
		String result = trim1.concat(trim2);
		return result;
	}
	
	public Integer getIndexOrNull(String testString, char letter) {
		int index = testString.indexOf(letter);
		if(index == -1) {
			return null;
		} else {
			return index;
		}
	}
	public Integer getIndexOrNull(String string1, String string2) {
		int index = string1.indexOf(string2);
		if(index == -1) {
			return null;
		} else {
			return index;
		}
	}
	public String concatSubstring(String string1, int a, int b, String string2) {
		String substr = string1.substring(a,b);
		String newStr = substr.concat(string2);
		return newStr;
	}
}

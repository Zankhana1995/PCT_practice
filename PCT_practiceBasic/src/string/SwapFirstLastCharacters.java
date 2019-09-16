package string;

public class SwapFirstLastCharacters {

	public static void main(String[] args) {
		String str = "Zankhana Patel";
		System.out.println(swap(str));
	}

	private static String swap(String str) {
		char[] ch = str.toCharArray();
		String newStr = "";
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			char temp = ch[k];
			ch[k] = ch[i-1];
			ch[i-1] = temp;
		}
		newStr = String.copyValueOf(ch);
		return newStr;
	}

}

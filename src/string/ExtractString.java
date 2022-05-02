package string;

public class ExtractString {

	public String doStuff(String conversation) {

		String[] array = conversation.split(" ");

		int sum = 0;
		String ans = "";
		for (String string : array) {
			try {
				int num = Integer.parseInt(string);
				ans += string;
			} catch (Exception e) {
				switch (string) {
				case "zero":
					sum += 0;
					break;
				case "one":
					sum += 1;
					break;
				case "two":
					sum += 2;
					break;
				case "three":
					sum += 3;
					break;
				case "four":
					sum += 4;
					break;
				case "five":
					sum += 5;
					break;
				case "six":
					sum += 6;
					break;
				case "seven":
					sum += 7;
					break;
				case "eight":
					sum += 8;
					break;
				case "nine":
					sum += 9;
					break;
				}
			}
		}
		
		return ans;
	}
}

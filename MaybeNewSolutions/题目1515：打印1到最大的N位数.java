
import java.util.Scanner;

public class Main {
	/*
	 * 1507
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			StringBuffer sb = new StringBuffer();
			for (int i = 1; i < Math.pow(10, N); i++) {
				sb.append(i+"\n");
			}
			System.out.print(sb.toString());
		}
	}
}

/**************************************************************
	Problem: 1515
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:680 ms
	Memory:39724 kb
****************************************************************/


                        
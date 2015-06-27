
import java.io.StreamTokenizer;

public class Main {
	/*
     * 1122
     */
	public static void main(String[] args) throws Exception {
		long array[] = new long[21];
		array[1] = 1;
		array[2] = 2;
		for (int i = 3; i < 21; i++) {
			array[i] = array[i-1] + array[i-2];
		}
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int n = (int) st.nval;
        	System.out.println(array[n]);
        }
    }
}
/**************************************************************
	Problem: 1122
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:70 ms
	Memory:14544 kb
****************************************************************/


                        
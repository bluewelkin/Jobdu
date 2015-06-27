
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
	/*
     * 1352
     */
    public static void main(String[] args) throws Exception {
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int k = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (int) st.nval;
			}
            int low = 0 ;
            int high = n - 1;
            while (low < high) {
				if (array[low] + array[high] > k) {
					high -- ;
				}else if (array[low] + array[high] < k) {
					low ++;
				}else {
					break;
				}
			}
            if( low < high ){
            	System.out.println(array[low]+" "+array[high]);
            }else {
            	System.out.println("-1 -1");
			}
        }
    }

}
/**************************************************************
	Problem: 1352
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:3290 ms
	Memory:30608 kb
****************************************************************/


                        
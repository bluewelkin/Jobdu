
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1472
     */
	private static int maxn = 2002;
	private static int addNum = 1000;
    public static void main(String[] args) throws Exception{
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));  
        while (st.nextToken() != StreamTokenizer.TT_EOF) {  
        	int indexArr[] = new int[maxn];
            int n1 = (int)st.nval;
            for (int i = 0; i < n1; i++) {
            	st.nextToken();
                int ratioNum = (int)st.nval;
                st.nextToken();
                int indexNum = (int)st.nval;
                indexArr[indexNum+addNum] += ratioNum;
            }
            st.nextToken();
            int n2 = (int)st.nval;
            for (int i = 0; i < n2; i++) {
            	st.nextToken();
                int ratioNum = (int)st.nval;
                st.nextToken();
                int indexNum = (int)st.nval;
                indexArr[indexNum+addNum] += ratioNum;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = maxn-1; i >= 0; i--) {
                if (indexArr[i] != 0) {
                    sb.append(indexArr[i]+" "+(i - addNum)+" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
/**************************************************************
	Problem: 1472
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:170 ms
	Memory:24020 kb
****************************************************************/


                        
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());   //슬라이딩 윈도우의 크기
        int[] A = new int[N];
        int[] D = new int[N];
        int start, end, min;

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
            if(i-L+1<0)     //start와 end 초기화
                start = 0;
            else start = i-L+1;
            end = i;

            min = A[start];
            while(start != end){
                if(min>A[end]){
                    min=A[end];
                }
                end--;
            }
            D[i] = min;
        }

        for(int i=0; i<N; i++){
            bw.write(D[i]+" ");
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}

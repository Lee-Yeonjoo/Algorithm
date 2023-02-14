import java.util.Scanner; //구간 합 알고리즘 사용하지 않은 코드 수행시간 비교해보기
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] S = new int[N]; //합배열
        int i, j;

        for(int k=0; k<N; k++){
            A[k] = sc.nextInt();
            if(k==0)
                S[k]=A[k];
            else
                S[k] = S[k-1] + A[k];
        }

        for(int k=0; k<M; k++){
            i = sc.nextInt()-1;
            j = sc.nextInt()-1;
            if(i==0)
                System.out.println(S[j]);
            else
                System.out.println(S[j]-S[i-1]);
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int start, end, cnt=0;
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            start=1;
            end=N-1;
            while(a[start]+a[end] != a[0]){
                end--;
                if(start==end){
                    start++;
                    end=N-1;
                }
                if(start==N-1) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(N-cnt);
    }
}
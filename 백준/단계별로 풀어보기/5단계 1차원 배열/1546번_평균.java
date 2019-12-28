import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] scores = new int[input];

        for(int i=0; i<input; i++){
            scores[i] = Integer.parseInt(st.nextToken()); //st.nextToken()은 한번만 쓰여야한다.
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<input; i++){
            int temp = scores[i];
            if(max < temp){
                max = temp;
            }
        }

        double mid = 0.0;
        double sum = 0.0;

        for(int i=0; i<input; i++){
            double temp = scores[i];
            temp = (temp/max)*100;
            sum = sum + temp;
        }
        mid = sum/input;
        System.out.println(String.format("%.2f", mid));
    }
}

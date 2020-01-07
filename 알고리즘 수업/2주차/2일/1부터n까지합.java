package week02_d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.printf("1부터 %d 까지의 합: %d", n,sum);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("요솟수: ");
        int input = Integer.parseInt(br.readLine());
        int[] arr = new int[input];

        // 배열값 할당
        for(int i=0; i<input; i++){
            System.out.printf("arr["+i+"] : ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        //버블정렬
        int[] temp;
        int index1;
        int index2;

        for(int i=0; i < input-1; i++){

        }

        // 정렬된 배열 출력
        System.out.println("오름차순 정렬");
        for(int i=0; i<input; i++){
            System.out.println("arr["+i+"] : "+arr[i]);
        }


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
 
        if(input.length()/10 < 1) {
            System.out.println(input);
        }
        else if(input.length()/10 >= 1){
            if(input.length()%10 == 0){
                for (int i = 0; i < input.length() / 10; i++) {
                    System.out.println(input.substring((10 * i), 10 + (10 * i)));
                }
            }else{
                for (int i = 0; i < input.length() / 10; i++) {
                    System.out.println(input.substring((10 * i), 10 + (10 * i)));
                }
                System.out.println(input.substring(input.length()/10*10));
            }
        }
    }
}

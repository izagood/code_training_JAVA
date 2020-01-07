package week02.d1.ch3;

public class Recursion {

    int RecFunc(int num){
//        int sum = 0;
        if(num ==1){
            return 1;
        }

        else{
            return recFuncTail(num,1);
//            sum = num + RecFunc(num - 1);
        }
//        return sum;
    }

    int recFuncTail(int num, int acc){

        if(num ==1){
            return acc;
        }
        return recFuncTail(num - 1, acc + num);
    }

    public static void main(String[] args) {
        Recursion rc = new Recursion();

        System.out.println("1부터 5까지의 합은 : " + rc.RecFunc(5));

    }
}
//1부터 n 까지의 합을 구하는 예를 재귀함수를 통해 구현하여라.
//
//
//
//        예) 다음과 같이 main 을 작성할때 RecFunc(int num) 을 구함.
//
//public static void main(String[] args){
//
//        System.out.println("1부터 5까지의 합은 : " + RecFunc(5));
//
//        }

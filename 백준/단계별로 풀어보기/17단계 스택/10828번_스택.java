// 

public class Main{
    public static void main(String[] args) {

        int max;
        int ptr;
        int[] stk;

        public class EmptyIntStackException extends RuntimeException{
                public EmptyIntStackException(){}
            }
            public class OverflowIntStackException extends RuntimeException{
                public OverflowIntStackException(){}
            }

            public Main(int capacity){
                ptr = 0;
                max = capacity;
                try{
                    stk = new int[max];
                }catch(OutOfMemoryError e){
                    max = 0;
                }
            }

    }
}

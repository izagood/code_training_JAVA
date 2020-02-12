# 6장

## 1
3 : 하나의 클래스로 여러개의 객체 생성 가능

## 2
4 : 로컬 변수를 클래스에서는 필드라고 한다.

## 3
4 : 모두 가질 필요 없다.

## 4
?

## 5
1 : 생성자가 있어야 객체를 생성한다.

## 6
4 : 중복 선언 가능(오버라이딩)

## 7
2 : 리턴 타입과 상관없다. 
매개변수와 관련이 있다.
(1. 타입 다름, 2. 개수 다름, 3. 순서 다름)

## 8
2 : 정적 블록에서 초기화 x??

## 9
2 : 선언할 때 초기화 하여야 한다.

## 10
4 : 코드 수정을 하여야 동작

## 11
3: default는 패키지 내부에서만 사용 가능

## 12
필드
생성자
메소드

## 13
    public class Member{
        String name;
        String id;
        String password;
        int age;
    }

## 14
    public class Member{
        String name;
        String id;
        String password;
        int age;
        
        public Member(String name, String id){
            this.name = name;
            this.id = id;
        }
    }


## 15
    public class MemberService{
        String id;
        String password;
    
        boolean login(String id, String password){
            this.id = id;
            this.password = password;
        }
        
        void logout(String id){
            this.id = id;
        }
    }

## 16
    public class Printer{
    
        void println(int input){
            System.out.println(input);
        }
        
        void println(boolean input){
            System.out.println(input);
        }
        
        void println(double input){
            System.out.println(input);
        }
        
        void println(String input){
            System.out.println(input);
        }
    }

## 17
public class Printer{
    
        static void println(int input){
            System.out.println(input);
        }
        
        static void println(boolean input){
            System.out.println(input);
        }
        
        static void println(double input){
            System.out.println(input);
        }
        
        static void println(String input){
            System.out.println(input);
        }
    }

## 18
    public class ShopService{
    
        private static ShopService ss = new ShopService();
    
        private ShopService(){
            
        }
        
        static ShopService getInstance(){
            return ss;
        }
        
    }
    
    public class ShopServiceExample{
        public static void main(String[] args){
            ShopService obj1 = ShopService.getInstance();
            ShopService obj2 = ShopService.getInstance();
            
            if(obj1 == obj2){
                System.out.println("같은 ShopService 객체 입니다.");
            }
            else{
                System.out.println("다른 ShopService 객체 입니다.");
            }
        }
    }

## 19
    public class Account {

	    final int MIN_BALANCE = 0;
	    final int MAX_BALANCE = 1000000;
	    private int balance;

	    public int getBalance() {
		    return balance;
	    }

	    public void setBalance(int balance) {
		    if (balance >= MIN_BALANCE || balance <= MAX_BALANCE) {
			    this.balance = balance;
		    }
	    }
    }

## 20




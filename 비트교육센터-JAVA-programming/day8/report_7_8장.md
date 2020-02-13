# 7장

## 1
1 : 다중 상속을 하지 못 한다.

## 2
2 : 슈퍼 객체를 자식 객체로 강제 타입 변환하기 위해서는
우선적으로 자식 객체를 슈퍼 객체에 업캐스팅을 하고 난 이후에 캐스팅 하는 경우에 가능하다?

## 3
1 : final은 서브 클래스에서 슈퍼 클래스의 매서드를 오버라이딩하지 못 하게 하는 것이지 상속은 가능하다.

## 4
4 : 있다 - 2번 잘 모르곘음?

## 5
this.name -> super.name 으로 바뀌어야 하다.

## 6
Parent(String nation) call
-> Parent() call
-> Child(String name) call
-> Child() call

## 7
스노우 타이어가 굴러갑니다.
스노우 타이어가 굴러갑니다.

## 8
2 : 업캐스팅 후 다운캐스팅 하여야 한다.

# 8장

## 1
3 : 상수와 추상 메소드만 가질 수 있다.

## 2
4 : 업캐스팅 하면 된다.

## 3
    public Cat implements Soundable{
    
        @Override
        public String sound(){
            return "야옹";
        }        
    }
    
    public Dog implements Soundable{
    
        @Override
        String sound(){
            return "멍멍";
        }
    }

## 4
    public interface DataAccessObject{
        
        abstract void select();
        abstract void insert();
        abstract void update();
        abstract void delete();
    }
    
    public class OracleDao implements DataAccessObject{
        
        @Override
        void select(){
            System.out.println("Oracle DB에서 검색")
        }
        @Override
        void insert(){
            System.out.println("Oracle DB에 삽입")
        }
        @Override
        void update(){
            System.out.println("Oracle DB를 수정")
        }
        @Override
        void delete(){
            System.out.println("Oracle DB에서 삭제")
        }
        
    
    }
    
    
    public class MySqlDao implements DataAccessObject{
    
        @Override
        void select(){
            System.out.println("MySql DB에서 검색")
        }
        @Override
        void insert(){
            System.out.println("MySql DB에 삽입")
        }
        @Override
        void update(){
            System.out.println("MySql DB를 수정")
        }
        @Override
        void delete(){
            System.out.println("MySql DB에서 삭제")
        }
    }

## 5
    new Action(){
    
        @Override
        void work(){
            System.out.print("복사를 합니다.");
        }
    
    };

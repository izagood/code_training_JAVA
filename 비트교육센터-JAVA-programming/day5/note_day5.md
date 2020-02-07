# day5


## 생성자 오버로딩
생성자 this()에서 this()는 다른 생성자에서 사용할때 가장 위에 위치해야 한다.

## private 생성자(){}
생성자 앞에 private를 붙이면 객체를 딱 한번만 찍는다.
싱글 톤 -> 객체를 단 한번만 찍어낸다.

### example
    class Person{
        private Person p = new Person();
    
        public Person getInsance(){
            return p;
        }
        
        private Person(String name){
            this.name = name;
        }
    }
    
    class Main{
        Person p1 = Person.getInsance();
    }

## Math.random()
0.0 <= Math.random() < 1.0 사이의 숫자를 무작위로 추출

1단계 : 0.0*10 <= <1.0*10
2단계 : (int)0.0 <= (int)(Math.random()*10) < (int)10.0
3단계 : 0 + 1 <= (int)(Math.random()*10+1) < 10 + 1

결국 -> int num = (int)(Math.random()*숫자범위+시작숫자);

## 오버라이딩
서브클래스 와 수퍼클래스에 동일한 메서드가 있는 경우 서브클래스의 메서드가 실행된다.

## 업캐스팅
서브클래스 객체를 수퍼클래스의 객체의 변수에 넣을 수는 있지만 서브클래스에 있는 필드 와 메서드가 가려진다.

**예외** !!! 가려져 있더라도 오버라이딩 되어있는 경우에는 서브클래스의 필드와 메서드가 실행된다.

### example
    Police sub1 = new Police();
    Teacher sub2 = new Teacher();
    Person super = sub1;
    super.study(); // Police의 메서드 실행
    super = sub2;
    super.study(); //Teacher의 메서드 실행
    
    class Person{ study(){} }
    
    class Police extends Person{ study(){} }
    
    class Teacher extends Person{ study(){} }
    
### super. / super()
부모 자체를 지칭

## static
필드, 메서드에 사용 가능

클래스 로더가 메인 메서드를 실행하기 전에 모든 클래스를 스캔하여 메모리에 로딩을 해 놓는다.
( 모든 클래스, static 필드, static 메서드 )

### example
    class person{
        static int sn;
    }
    
    Person.sn = 1;


# day6

## java.lang.Object

모든 클래스의 superclass 

## 어노테이션 @

@로 시작하는 문법 -> 컴파일러에 알려주는 메세지의 역할

스프링에서는 컴파일러에 환경설정을 알려주는 메세지

## abstract 추상 메서드
### 꼭 오버라이딩 하게 만들기

superclass의 메서드를 추상메서드로 생성하면 subclass에서 꼭 오버라이딩 하여야 한다.

### example

    abstract void eat();
    // {} 몸통이 없다.
    
## 추상 클래스 abstract

추상 메서드가 포함되어 있는 클래스

예외 - 추상 클래스 내부에 추상 메서드가 없어도 추상 클래스로 선언할 수 있다.

추상 클래스가 필요한 이유는 서브클래스가 강제적으로 오버라이딩하게 만들기 위해서 이다.

사용 목적 : 규격화

### 주의
추상 클래스인 경우 직접적으로 객체 생성이 되지 않는다

그렇기 때문에 추상 클래스를 사용하기 위해서는 상속하여 사용하여야한다.

## 인터페이스 interface
강제적으로 오버라이딩하게 만들기 위해서 사용
 
implements(구현) 로 상속가능
 
상수와 추상메서드로만 구성되는 클래스
 
일반 메서드 존재 불가능
일반 필드 존재 불가능

사용 목적 : 규격화

인터페이스는 상속할 때는 extends 로 할 수 있고 구현할 때는 implements로 하면 된다.

### 주의
인터페이스인 경우 직접적으로 객체 생성이 되지 않는다

### example
    interface Animal{
        final double PI=3.14;
        abstract void eat();
    }// final과 abstract를 쓰지 않아도 컴파일러가 자동으로 붙여서 컴파일 한다.

## 다중 상속
Java는 원칙적으로 다중 상속을 사용할 수 없다.

하지만 밑의 example 과 같이 우회하여 다중 상속할 수는 있다.
### example

    public class Lion extends Animal implements Person, School, ..., interface_name{...}

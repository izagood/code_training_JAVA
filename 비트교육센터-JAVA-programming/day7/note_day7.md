# day7

## 자바의 특징
: 캡슐화, 상속, 다형성

## 클래스의 종류
: 일반클래스, 추상클래스, 인터페이스

# 쇼핑몰 만들기 - 결제 시스템

## 필요한 객체
: 회원, 결제수단(현금, 신용카드), 주문

Person, Payment( Cash, CreditCard ), Order

## 다운 캐스팅
전제 : 업캐스팅 된 상황에서만 할 수 있다.

    class Person{}
    
    class Police extends Person{}
    
    Police sub = new Police();
    Person super;
    super = sub;
    super.eat();
    // super.catch(); // error
    
    sub = (Police)super;
    sub.catch();
    
## Java 8 API doc

Package -> All class -> 상속관계 표시( super클래스의 필드와 메서드도 사용 가능 )

## 메서드 체인 기법
Object obj;
Class c1 = obj.getClass();
String s = c1.getName();

=> obj.getClass().getName()

### example

    System.out.println();
## Wrapper 클래스
Byte, Short, Integer, Long, Character, Float, Double, Boolean

기본 타입의 값을 객체화 해주는 역할



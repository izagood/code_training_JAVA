# day4

## this의 사용법

this.필드 or this.메소드
: this는 객체 자기 자신을 가르킨다

this()
: 생성자가 2개 이상일때 오버로딩 시키고 싶은 생성자 내부에 this(); 로 작성하여 필드를 다시 작성하지 않고 가져와서 사용할 수 있다.

## 생성자

생성자는 new를 통해 객체를 생성할 때, 객체당 한 번 호출

생성자의 목적은 객체 초기화

## 접근제한자 4종류

### private
현재의 객체 내에서만 접근 가능

### default( 아무것도 쓰지 않았을 때 적용 )
현재의 패키지 내에서만 접근 가능

### protected
default + 다른 패키지에 있는 것도 접근 가능(if 상속관계에 있으면)

### public
import만 되어 있으면 모두 접근 

### 클래스의 헤더

public 과 default 만 사용가능

### 필드, 메서드의 헤더

public , default, protected, public 모두 사용 가능

## final 제한자

클래스, 필드, 메서드 앞에 모두 사용 가능

필드 : 필드 앞에 붙이는 final은 상수( 변수 변경 금지 )
메서드 : 메서드 앞에 붙이면 메서드 오버로딩 금지( 오버로딩 금지 )
클래스 : 클래스 앞에 붙이면 클래스르 상속하지 금지( 상속 금지 )

## 상속

public class Person{ int age; }

public class Student **extends** Person{ String name; }






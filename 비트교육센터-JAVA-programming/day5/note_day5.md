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
3단계 : 0 +1 <= (int)(Math.random()*10)+1 < 10 + 1

결국 -> int num = (int)(Math.random()*n)+start

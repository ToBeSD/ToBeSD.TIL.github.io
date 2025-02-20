# 참조 타입

자바의 **참조 타입(Reference Type)**은 변수에 실제 값을 저장하는 것이 아니라, 객체의 메모리 주소(참조)를 저장하는 데이터 타입이다. 기본 타입(Primitive Type)과는 다르게 동적으로 크기가 변할 수 있으며, 힙(Heap) 영역에 저장된 객체를 가리킨다.

## 종류

Interface Type : 인터페이스를 구현한 객체의 참조를 저장하는 타입.

Class Type : 사용자가 정의한 클래스의 인스턴스를 참조하는 타입.

Array Type : 여러 개의 값을 저장하는 참조 타입. 배열 자체도 객체이므로 new 키워드를 사용하여 생성됨.

Enum Type : 미리 정의된 상수 값을 갖는 타입.

Object : 모든 클래스의 최상위 부모 클래스.

## 참조 타입의 특징

1. null 값을 가질 수 있다.

참조 타입 변수는 객체를 가리키지 않을 수도 있으며, 기본값이 null이다.

```
String str = null;
System.out.println(str.length()); // NullPointerException
```

2. 힙(Heap) 메모리에서 관리됨

참조 타입의 객체는 new 키워드를 통해 힙 영역에 생성됨
GC(Garbage Collector)가 사용되지 않는 객체를 자동으로 제거

3. 동일한 객체를 여러 개의 변수에서 참조 가능

```
Person p1 = new Person();
Person p2 = p1; // 같은 객체를 참조함
p2.name = "shim yosub";
System.out.println(p1.name); // "shim yosub" 출력
```

> Shim : 위의예제와 같이 동일한 객체를 여러 변수에서 참조할 수 있기떄문에, 객체의 변경에 의해 의도치않은 동작을 하게되는 경우가 일어난다. 떄문에 Immutable한 객체를 만드는 방법이 고안되었다고 생각한다. (e.g. Dto)

## 참조타입 변수의 ==, != 연산

==, != 연산자는 변수의 값이 같은지를 비교한다.
참조형 변수의 값은 객체의 주소(포인터)이므로,
참조형 변수에서 ==, != 연산자는 주소를 비교한다.
주소가 같다면 같은 객체를 참조하고 있으며, 다르면 서로 다른 객체를 참조하고 있다는 의미가 된다.

```
Human human1 = new Human("Shim");
Human human2 = new Human("Yosub");
Human human3 = human1;

human1 == human2 // false
human1 == human3 // true
```

human1과 human2는 각각 메모리의 Heap 영역에서 서로 다른 주소를 가지고 있다.
따라서 내부 문자열이 동일하더라도 메모리 주소가 다르므로 위 예제처럼 false가 나온다.

반면, human1과 human3는 Heap 영역에서 같은 객체를 참조하고 있으므로 true가 된다.

# String

String 타입은 자바에서 문자열을 다루는 대표적인 클래스이며, 불변(immutable)성과 다양한 편의 기능을 제공한다.

## String의 특징

###  불변 객체 (Immutable Object)

- String 객체는 한 번 생성되면 변경할 수 없다.
- 문자열을 수정하는 것처럼 보여도, 기존 문자열을 수정하는 것이 아니라 새로운 객체를 생성한다.

```
String str = "Hello";
str = str + " World"; // 기존 문자열을 변경하는 것이 아니라, 새로운 객체 생성
```

위 코드에서 "Hello World"라는 새로운 String 객체가 생성되고, str이 이를 참조하게 된다. 기존 "Hello"는 가비지 컬렉션의 대상이 된다.

### 리터럴 풀 (String Constant Pool) 사용

- String 리터럴(e.g.: "hello")은 String Constant Pool 에 저장되어 중복 생성을 방지한다.

```
String a = "hello";  
String b = "hello";  
System.out.println(a == b); // true (같은 객체를 참조)
```
같은 문자열 리터럴을 사용하면 새로운 객체를 생성하지 않고 기존 객체를 재사용한다.

⚠️ new 키워드를 사용하면 새로운 객체 를 생성한다.
```
String a = "hello";  
String b = new String("hello");
System.out.println(a == b); // false (다른 객체)
```

### 문자열 연결 시 성능 문제

- String은 불변 객체이므로, + 연산으로 문자열을 연결하면 매번 새로운 객체를 생성한다.
- 따라서 문자열을 자주 변경해야 할 경우 StringBuilder 또는 StringBuffer 를 사용하는 것이 성능상 유리하다.

```
// 성능이 좋지 않음 (매번 새로운 객체 생성)
String str = "";
for (int i = 0; i < 1000; i++) {
    str += i; // 새로운 객체가 계속 생성됨
}

// 성능이 좋음 (동일 객체를 변경)
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i); // 같은 객체에서 문자열 추가
}
```


### 문자열 비교 (`==` vs `equals()`)

| 비교 방법 | 설명 |
|----------|------|
| `==` | 두 객체의 **참조 주소**(메모리 위치)가 같은지 비교 | 
| `equals()` | 문자열의 **내용(값)** 이 같은지 비교 |

```
String a = "hello";  
String b = new String("hello");

a == b // false
a.equals(b); // true
```
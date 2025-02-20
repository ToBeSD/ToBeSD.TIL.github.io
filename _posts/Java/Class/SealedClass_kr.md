# Java `sealed` 키워드  

Java 15부터 등장한 `sealed` 키워드는 클래스 계층 구조를 명확하게 설계하고 안전하게 관리하기 위해 도입된 새로운 키워드다.  

---

## 목차  
1. [왜 `sealed`가 등장했는가?](#왜-sealed가-등장했는가)  
2. [`sealed`의 특징 및 키워드 설명](#sealed의-특징-및-키워드-설명)  
3. [사용법 및 예시](#사용법-및-예시)  
4. [장점 및 단점](#장점-및-단점)  
5. [관련 질문 및 답변](#관련-질문-및-답변)  
6. [참고 자료](#참고-자료)  

---

## 왜 `sealed`가 등장했는가?  
- **클래스 계층의 안전한 설계**  
  - 기존의 `final`은 상속 자체를 막고, `abstract`는 상속에 제한이 없었다.  
  - `sealed`는 이 둘 사이에서 **상속을 허용하되 특정 클래스만 상속 가능**하도록 제한한다.  

- **코드 가독성 및 유지보수성 향상**  
  - 허용된 하위 클래스만 존재하기 때문에 클래스 계층을 쉽게 파악할 수 있다.  

- **패턴 매칭의 안정성 보장**  
  - Java 16부터 등장한 **패턴 매칭**과 함께 사용하면 `switch` 문에서 누락된 케이스가 없는지 컴파일 타임에 검증할 수 있다.

---

## `sealed`의 특징 및 키워드 설명  
`sealed` 키워드는 다음과 같이 사용할 수 있다:
- **`sealed`**: 상속을 허용하지만 특정 클래스만 상속 가능  
- **`permits`**: 상속할 수 있는 클래스를 명시  
- **`final`**: 더 이상 상속 불가능  
- **`non-sealed`**: 제한 없이 상속 가능  

### 하위 클래스 규칙  
`sealed` 클래스를 상속하는 하위 클래스는 다음 중 하나로 선언해야 한다:  
- `final`: 상속 불가  
- `sealed`: 다시 한 번 상속 제한 가능  
- `non-sealed`: 제한 없이 상속 가능  

---

## 사용법 및 예시  
```java
// 상위 클래스 선언
public sealed class Shape permits Circle, Rectangle {}

// 하위 클래스 선언
public final class Circle extends Shape { }          // 더 이상 상속 불가
public non-sealed class Rectangle extends Shape { }  // 제한 없이 상속 가능

// non-sealed 덕분에 Rectangle은 상속 가능
public class Square extends Rectangle { }

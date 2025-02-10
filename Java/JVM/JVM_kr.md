## JVM(Java Virtual Machine) 

JVM(Java Virtual Machine)은 자바 프로그램을 실행하는 가상 머신으로, 자바 바이트코드(.class)를 실행할 수 있는 런타임 환경을 제공한다. 자바 프로그램이 운영체제(OS)와 독립적으로 동작할 수 있도록 해주며, 다양한 운영체제에서 동일한 바이트코드를 실행할 수 있게 한다.

## JVM메모리관리와 가비지 컬렉션
JVM은 바이트코드실행 뿐만 아니라 메모리 관리를 해준다.

JVM은 자바 객체를 힙(Heap) 메모리에 할당하고, 필요 없는 객체를 자동으로 제거하는 **Garbage Collector** 를 통해 메모리를 효율적으로 관리한다.

## JVM 실행 과정

1. **Java 파일 컴파일**
    
    HelloWorld.java → HelloWorld.class (바이트코드 생성)

2. **JVM 실행**
    
    java HelloWorld 실행 시, JVM이 HelloWorld.class 로드

3. **클래스 로딩**
    
    클래스 로더가 HelloWorld.class를 메모리에 로드

4. **바이트코드 실행**
    
    실행 엔진이 바이트코드를 실행 (인터프리터 또는 JIT 컴파일러 사용)

5. **가비지 컬렉션 수행**
    
    사용되지 않는 객체를 정리하여 메모리 최적화
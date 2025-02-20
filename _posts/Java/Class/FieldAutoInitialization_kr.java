// Class
// 자바에서 클래스의 필드는 별도로 초기화하지 않아도 자동으로 기본값이 할당됩니다.

class FieldExample {
    byte byteField;     // 기본값 0
    char charField;     // 기본값 '\u0000' 
    short shortField;   // 기본값 0
    int intField;       // 기본값 0
    long longField;     // 기본값 0L
    float floatField;   // 기본값 0.0f
    double doubleField; // 기본값 0.0d
    boolean flagField;  // 기본값 false
    String textField;   // 기본값 null

    void printValues() {
        System.out.println("byteField = " + byteField);
        System.out.println("charField = " + charField);
        System.out.println("shortField = " + shortField);
        System.out.println("intField = " + intField);
        System.out.println("longField = " + longField);
        System.out.println("floatField = " + floatField);
        System.out.println("doubleField = " + doubleField);
        System.out.println("flagField = " + flagField);
        System.out.println("textField = " + textField);
    }
}

public class FieldAutoInitialization_kr {
    public static void main(String[] args) {
        FieldExample ex = new FieldExample();
        ex.printValues();
    }
}
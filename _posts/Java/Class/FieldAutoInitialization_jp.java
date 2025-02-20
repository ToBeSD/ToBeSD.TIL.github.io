// Class
// Javaでは、クラスのフィールドは特に初期化しなくても、自動的にデフォルト値が割り当てられます。

class FieldExample {
    byte byteField;     // 初期値 0
    char charField;     // 初期値 '\u0000' 
    short shortField;   // 初期値 0
    int intField;       // 初期値 0
    long longField;     // 初期値 0L
    float floatField;   // 初期値 0.0f
    double doubleField; // 初期値 0.0d
    boolean flagField;  // 初期値 false
    String textField;   // 初期値 null

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

public class FieldAutoInitialization_jp {
    public static void main(String[] args) {
        FieldExample ex = new FieldExample();
        ex.printValues();
    }
}
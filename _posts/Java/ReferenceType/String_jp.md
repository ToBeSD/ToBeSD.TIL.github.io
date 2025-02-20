# String

String 型は Java で文字列を扱う代表的なクラスであり、不変（immutable）性とさまざまな便利な機能を提供します。

## String の特徴

### 不変オブジェクト（Immutable Object）

- String オブジェクトは一度作成されると変更できません。
- 文字列を変更するように見えても、実際には既存の文字列を変更するのではなく、新しいオブジェクトを生成します。

```
String str = "Hello"; 
str = str + " World"; // 既存の文字列を変更するのではなく、新しいオブジェクトを生成
```

上記のコードでは、"Hello World" という新しい String オブジェクトが作成され、`str` がそれを参照するようになります。元の `"Hello"` はガベージコレクションの対象になります。

### リテラルプール（String Constant Pool）の使用

- String リテラル（例："hello"）は String Constant Pool に保存され、重複したオブジェクトの作成を防ぎます。

```
String a = "hello";
String b = "hello";
System.out.println(a == b); // true （同じオブジェクトを参照）
```

同じ文字列リテラルを使用すると、新しいオブジェクトを作成せず、既存のオブジェクトを再利用します。

⚠️ `new` キーワードを使用すると、新しいオブジェクトが作成されます。
```
String a = "hello";
String b = new String("hello"); System.out.println(a == b); // false （異なるオブジェクト）
```


### 文字列結合時のパフォーマンス問題

- String は不変オブジェクトのため、`+` 演算子で文字列を結合すると、毎回新しいオブジェクトが作成されます。
- そのため、頻繁に文字列を変更する場合は `StringBuilder` または `StringBuffer` を使用する方がパフォーマンス的に有利です。

```
// パフォーマンスが悪い（毎回新しいオブジェクトが作成される） 
String str = ""; 
for (int i = 0; i < 1000; i++) {
    str += i; // 新しいオブジェクトが次々に作成される 
}

// パフォーマンスが良い（同じオブジェクトを変更する） 
StringBuilder sb = new StringBuilder(); 
for (int i = 0; i < 1000; i++) { 
    sb.append(i); // 同じオブジェクトに文字列を追加 
}
```


### 文字列の比較（`==` vs `equals()`）

| 比較方法 | 説明 |
|----------|------|
| `==` | 2 つのオブジェクトの **メモリ住所** が同じかどうかを比較 | 
| `equals()` | 文字列の **内容（値）** が同じかどうかを比較 |

```
String a = "hello";
String b = new String("hello");

a == b // false a.equals(b); // true
```
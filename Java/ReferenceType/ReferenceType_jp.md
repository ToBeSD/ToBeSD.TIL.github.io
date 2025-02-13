# 参照型

Javaの「**参照型（Reference Type）**」は、変数に実際の値を保存するのではなく、オブジェクトのメモリアドレスを保存するデータ型です。基本型（Primitive Type）とは異なり、動的にサイズが変わることができ、ヒープ（Heap）領域に保存されたオブジェクトを指します。

## 種類

Interface Type : インターフェースを実装したオブジェクトの参照を保存する型。

Class Type : ユーザーが定義したクラスのインスタンスを参照する型。

Array Type : 複数の値を保存する参照型。配列自体もオブジェクトであるため、new キーワードを使用して生成される。

Enum Type : あらかじめ定義された定数値を持つ型。

Object : すべてのクラスの最上位の親クラス。

## 参照型の特徴

1. null 値を持つことができる

参照型変数はオブジェクトを指さないことがあり、デフォルト値は null である。

```
String str = null; 
System.out.println(str.length()); // NullPointerException
```


2. ヒープ（Heap）メモリで管理される

参照型のオブジェクトは new キーワードを使ってヒープ領域に生成される。
GC（Garbage Collector）が使用されていないオブジェクトを自動で削除する。

3. 同じオブジェクトを複数の変数で参照できる

```
Person p1 = new Person(); 
Person p2 = p1; // 同じオブジェクトを参照 
p2.name = "shim yosub"; 
System.out.println(p1.name); // "shim yosub" を出力
```

> Shim : 上記の例のように、同じオブジェクトを複数の変数で参照できるため、オブジェクトの変更によって意図しない動作が発生することがある。
そのため、Immutable（不変）なオブジェクトを作る方法が考案されたのだろう。e.g. Dto。


## 参照型変数の ==, != 演算

==, != 演算子は変数の値が同じかどうかを比較する。参照型変数の値はオブジェクトのアドレス（ポインタ）なので、
参照型変数の ==, != 演算子はアドレスの比較を行う。
アドレスが同じであれば同じオブジェクトを参照し、異なれば異なるオブジェクトを参照していることになる。

```
String refVar1 = "name"; 
String refVar2 = refVar1; 
String refVar3 = "age";

refVar1 == refVar2 // true 
refVar1 != refVar2 // false

refVar1 == refVar3 // false 
refVar1 != refVar3 // true
```
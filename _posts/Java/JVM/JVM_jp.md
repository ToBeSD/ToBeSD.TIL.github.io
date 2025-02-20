## JVM(Java Virtual Machine)
JVM(Java Virtual Machine)は、Javaプログラムを実行する仮想マシンであり、Javaバイトコード（.class）を実行できるランタイム環境を提供します。JavaプログラムがOSに依存せず動作できるようにし、異なるOS上でも同じバイトコードを実行できるようにします。

## JVMのメモリ管理とガベージコレクション
JVMはバイトコードの実行だけでなく、メモリ管理も行います。

JVMはJavaオブジェクトをヒープ(Heap)メモリに割り当て、不要になったオブジェクトを **ガベージコレクター(Garbage Collector)** によって自動的に削除し、メモリを効率的に管理します。

## JVMの実行プロセス
1. **Javaファイルのコンパイル**
    
    HelloWorld.java → HelloWorld.class（バイトコードの生成）

2. **JVMの実行**   
    
    java HelloWorld を実行すると、JVMが HelloWorld.class をロード

3. **クラスのロード**
    
    クラスローダーが HelloWorld.class をメモリにロード

4. **バイトコードの実行**
    
    実行エンジンがバイトコードを実行（インタープリターまたはJITコンパイラーを使用）

5. **ガベージコレクションの実行**
    
    使われなくなったオブジェクトを整理し、メモリを最適化
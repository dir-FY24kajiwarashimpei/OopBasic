package company;

import java.lang.invoke.VarHandle;

public class ObjectSample {

    public static void main(String[] args) {
        //インスタンスの作成
        Employee employee = new Employee("鈴木", "営業部", "課長", 100);

        //インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        
    }

}

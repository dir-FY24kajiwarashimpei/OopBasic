package company;

import java.lang.invoke.VarHandle;

public class ObjectSample {

    public static void main(String[] args) {
        //インスタンスの作成
        Department department = new Department("営業部", "××", 1000000);
        Employee employee = new Employee("鈴木", department, "課長", 100);

        //インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        employee.joinMeeting();
        
        
        //１行開ける
        System.out.println("");
        
        //インスタンスの作成
        Department devDepartment = new Department("開発部", "yy", 0);
        Employee engineer = new Employee("田中", devDepartment, "一般社員", 88);
        
        
        //インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
    }

}

package company;

import java.lang.invoke.VarHandle;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        Department salesDepartment = new Department("営業部", "××", 1000000);
        Employee sales = new Sales("鈴木", salesDepartment, "課長", 100);

        // インスタンスメソッドの呼び出し
        sales.report();
        sales.report(2);
        sales.joinMeeting();

        // １行開ける
        System.out.println("");

        // インスタンスの作成
        Department devDepartment = new Department("開発部", "yy", 0);
        Engineer engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");

        // インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        //１行開ける
        System.out.println("");

        // ポリモーフィズムの確認
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");

        // インスタンスメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            // developSoftwareメソッドを呼び出す
            ((Engineer) projectManager).developSoftware();
        }

        // 1行開ける
        System.out.println("");

        // アルバイトのインスタンスの作成
        ParttimeWorker parttimeWorker = new ParttimeWorker("太田", salesDepartment);

        // 実装したメソッドの呼び出し
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();

    }

}

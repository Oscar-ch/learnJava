/*
这是一个演示抽象类的程序

抽象类的特点：
    1. 抽象方法一定定义在抽象类中
    2. 抽象方法和抽象类都必须被abstract关键字修饰
    3. 抽象类不可以创建对象，因为调用抽象方法没有意义
    4. 抽象类中的方法要被使用，必须由子类复写所有的抽象方法后，建立子类对象调用
        如果子类指覆盖了部分抽象方法，该子类还是一个抽象类
*/

//当多个类中出现相同功能，但是功能主体不同，这时可以向上抽取，这时只抽取功能定义，而不抽取功能主体
abstract class Student{

    abstract void study();

    void sleep() {}
}

class BaseStudent extends Student{

    void study() {

        System.out.println("base study");
    }
}

class AdvStudent extends Student{

    void study() {

         System.out.println("advanced study");
    }
}
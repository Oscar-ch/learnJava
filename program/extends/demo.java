/*
这是一个演示继承的程序

子父类出现后，类成员的特点：
    1. 变量
    2. 函数
    3. 构造函数
1. 变量
    如果子类中出现非私有的同名成员变量时，
    子类要访问本类中的变量，用this，
    子类要访问父类中的变量，用super

        super的使用和this的使用几乎一致
        this代表的是本类对象的引用
        super代表的是父类对象的引用
2. 函数
    如果同名，则重写/覆盖（函数的另一种特性）

    注意：
    1.子类覆盖父类，必须保证子类权限大于等于父类权限，否则编译失败
    2. 静态只能覆盖静态。

    对比：
    重载：只看同名函数的参数列表
    重写：子父类方法要一模一样

3. 子父类中的构造函数
    子类对象初始化时，父类构造函数也会运行，
    那是因为子类的构造函数默认第一行有一条隐式的语句super();
    super():会访问父类中空参数的构造函数，而且子类中所有的构造函数默认都是super();

    注意：
    super语句一定要放在构造函数的第一行

*/

class Father{ //extends Object

    int num = 4;

    //用于解释构造函数重写
    Father() {

        System.out.println("This is Father class");
    }

    //用于解释函数重写
    void show() {

        System.out.println(num);
    }

    void speak() {

        System.out.println("vb");
    }
}

class Son extends Father{

    int num = 5;

     //用于解释构造函数重写
    Son() {
        //super();
        System.out.println("This is Son class");
    }

    Son(int x) {
        //super();
        System.out.println("Son..."+x);

    }

    //用于解释函数重写
    void show() {

        super.show();
        System.out.println(num);
        System.out.println(super.num);
    }

    void speak() {

        System.out.println("java");
    }
}

class ExtendsDemo{

    public static void main(String[] args) {

        Son son = new Son();
        Son son1 = new Son(4);

         son.show();
        //System.out.println(son.num1 + "......" + son.num2);
    }
}
/*
描述小汽车

分析：
1.属性
    轮胎数，颜色
2.行为
    运行

定义类其实就是在定义类中的成员。
成员：成员变量<-->属性，成员函数<-->行为

*/

class CarDemo{

    public static void main(String[] args){
        //在计算机中创建一个car的实例，通过new关键字
        Car   c = new Car();//c就是一个类类型的应用变量，指向该类的对象
        c.num = 4;
        c.color = "red";
        c.run();//

        Car c1 = new Car();
        c1.num = 5;
        c1.color = "blue";
        c1.run();

        Car c2 = c1;
        c1.num = 8;
        c2.color = "red";
        c2.run();
        c1.run();

        Car c3 = new Car();
        Car c4 = new Car();
        show(c3);
        show(c4);


        //匿名对象
        new Car().num = 5;
        new Car().color = "green";
        new Car().run();
        show(new Car())
    }

    //汽车改装厂
    public static void show(Car c) {
    //类类型的变量，一定指向对象或者null。
    c.num = 3;
    c.color = "black";
    System.out.println(c.num+"..."+c.color);
    }
}

class Car {

    int num;
    String color;//String是个类

    void run() {
        System.out.println(num+"..."+color);//要使用对象中的内容可以通过，对象、成员的形式来完成调用
    }
}
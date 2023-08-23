/**
这是一个演示抽象类的程序，提供了抽象的Employee父类和Pro,Manager子类
@author Oscar
@version V1.1
*/

/*
假如我们在开发系统时需要对员工建模，员工包含3个属性：
姓名、工号、工资。
经理也是员工,除含有员工属性外，另外还有一个奖金属性。
请使用继承的思想设计出员工类和经理类。要求类中提供必要方法进行属性访问。

员工类：name id salary
经理类：继承了员工，并有自己的bonus
*/

public abstract class Employee{

    private String name;
    private String id;
    private double salary;

    /**
     抽象父类的构造函数
     @param name 接收一个字符串表示名字
     @param id 接收一个字符串表示员工id
     @param salary 接收一个double类型的数表示工资
    */
    Employee(String name, String id, double salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /**
     用于表示工作的抽象类，需要在子类中实现
    */
    public abstract void work();
}

class Pro extends Employee{

    /**
     子类的构造函数
     @param name 接收一个字符串表示名字
     @param id 接收一个字符串表示员工id
     @param salary 接收一个double类型的数表示工资
    */
    Pro(String name, String id, double salary){
        super(name,id,salary);
    }

    /**
     表示工作的方法
     @return 无返回
    */
    public void work() {

        System.out.println("pro work");
    }
}

class Manager extends Employee{

    private int bonus;

    /**
     子类Manager的构造函数
     @param name 接收一个字符串表示名字
     @param id 接收一个字符串表示员工id
     @param salary 接收一个double类型的数表示工资
     @param bonus 接受一个int类型的数表示奖金
    */
    Manager(String name, String id, double salary, int bonus) {

        super(name,id,salary);
        this.bonus = bonus;
    }

    /**
    表示工作的方法
     @return 无返回
    */
    public void work() {

        System.out.println("manager work");
    }
}
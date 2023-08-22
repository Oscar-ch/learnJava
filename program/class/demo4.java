/*
用于演示构造函数的程序
*/

class Person{
    private String name;
    private int age;

    //定义一个Person类的构造函数
    Person() {
        //构造函数，且是空参数
        name = "baby";
        age = 1;
        System.out.println("person run");
        speak();//构造函数可以直接调用一般函数，反过来不行
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this(name);//构造函数如何调用构造函数，且只能定义在第一行
        this.age = age;
    }

    public void speak() {
        System.out.println(name + ":" + age);
    }

    public boolean compare(Person p) {

        return this.age == p.age;//this的应用场景
    }
}

class ConstructureDemo{

    public static void main(String[] args){

        Person p = new Person();
        p.speak();

        Person p1 = new Person("小王");
        p1.speak();

        Person p2 = new Person("小李",18);
        p2.speak();

        System.out.println(p1.compare(p2));
    }
}
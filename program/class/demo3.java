/*
演示封装的程序

private:私有，是一个权限修饰符，用于修饰成员
            私有的内容只在本类中有效
注意：私有仅仅是封装的一种体现而已

*/

class Person{
    //定义类
    /*人
    属性：
        年龄；
    行为：
        说话；
    */
    private int age;//设置私有，外部无法访问

    public void setAge(int a) {
        //对外的方法，修改age
        if(a > 0 && a < 3)
            age = a;
        else
            System.out.println("错误的数据");
    }

    public int getAge() {
        //对外的方法，获取age值
        return age;
    }

    void speak() {
        System.out.println("age = " + age);
    }
}

class PersonDemo{

    public static void main(String[] args) {

        Person p = new Person();
        //p.age = 20;
        p.speak();
    }
}
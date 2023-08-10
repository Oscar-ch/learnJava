class OperateDemo4{
    public static void main(String[] args){
        System.out.println(8&4);
        System.out.println(8|4);
        System.out.println(9&5);
        System.out.println(9|5);
        System.out.println(~6);//-7+1
        System.out.println(3<<2);//所有位数左移2位，空缺位用0补
        System.out.println(3>>2);//所有位数右移2位，除以2的几次幂，最高位缺失的用本来的补
        System.out.println(-3>>2);
        System.out.println(156>>>2);//最高位空位用0补
        System.out.println(-156>>>2);
    }
}
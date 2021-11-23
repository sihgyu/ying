package day02;

/**
 * @author yusx
 * @date 2021/11/23 3:22 下午
 * 当数据类型不一样时，将会发生数据类型转换。
 * <p>
 * 自动类型转换（隐式）
 * 1. 特点：代码不需要进行特殊处理，自动完成。
 * 2. 规则：数据范围从小到大。
 * <p>
 * 强制类型转换（显式）
 */
public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024); // 这就是一个整数，默认就是int类型
        System.out.println(3.14); // 这就是一个浮点数，默认就是double类型

        // 左边是long类型，右边是默认的int类型，左右不一样
        // 一个等号代表赋值，将右侧的int常量，交给左侧的long变量进行存储
        // int --> long，符合了数据范围从小到大的要求
        // 这一行代码发生了自动类型转换。
        long num1 = 100;
        System.out.println(num1); // 100

        // 左边是double类型，右边是float类型，左右不一样
        // float --> double，符合从小到大的规则
        // 也发生了自动类型转换
        double num2 = 2.5F;
        System.out.println(num2); // 2.5

        // 左边是float类型，右边是long类型，左右不一样
        // long --> float，范围是float更大一些，符合从小到大的规则
        // 也发生了自动类型转换
        float num3 = 30L;
        System.out.println(num3); // 30.0


        //      1     2     2         4     8    4         8
        // 结论：byte,short,char -- > int-->long->float-->double

        // 那么 为什么long 可以转换成float呢
        // 因为浮点型是通过科学计数法存储的，整数是二进制存储的， 所以float的范围其实是-2的128次方 到 2的128次方 远远大于long的取值范围
    }
}

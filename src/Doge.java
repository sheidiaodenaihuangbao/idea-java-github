import java.util.Scanner;
//3) 我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗相当于人类多少年龄呢？
// 应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
//4)编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。如果用户输入负数，请显示一个提示信息。
public class Doge {
    public static void main(String[] ignoredArgs) {
        //创建scanner用于接收
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入狗的年龄:");
        int age = scanner.nextInt();
        if ( age < 0){
            System.out.println("输入错误，请输入正数。");
        } else{
            double a = dog(age);
            System.out.println("狗的年龄是" + a);
        }
    }

    public static double dog(int age) {
        //判断年龄
        double dogAge;
        if ( age <= 2){
            dogAge = 10.5 * age;
        } else{
            dogAge = (10.5 * 2) + 4 * (age - 2);
        }
        return dogAge;
    }
}
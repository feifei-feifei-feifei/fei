import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import org.junit.Test;

public class Siy {
	int ts, tf, zf, fh, jg;

	void yunsuan() throws FileNotFoundException {
		PrintStream ps = new PrintStream("d:/jieguo.txt"); // 在d盘生成txt文档
		System.setOut(ps);
		for (int i = 0; i < ts; i++) { // 用循环控制题目个数
			int a = (int) (Math.random() * tf + 1); // 生成随机数赋值给a
			if (zf == 0) { // zf=0有负数
				int c = (int) (Math.random() * 2);
				switch (c) { // 输出带负数的随机数a
				case 0:
					a = a * -1;
					System.out.print(a);
					break;
				case 1:
					System.out.print(a);
					break;
				}

			}

			if (zf == 1) { // 输出不带负数的随机数a
				System.out.print(a);
			}
			int f = (int) (Math.random() * 2);
			if (fh == 2) { // 输出“+”，“-”
				switch (f) { // 随机生成运算符
				case 0:
					System.out.print("+");
					break;
				case 1:
					System.out.print("-");
					break;
				}
				int b = (int) (Math.random() * tf + 1); // 生成随机数b
				int sum = a + b;
				if (zf == 0) { // zf=0有负数
					int c = (int) (Math.random() * 2);
					switch (c) { // 输出带负数的随机数b
					case 0:
						b = b * -1;
						System.out.print("(" + b + ")");
						break;
					case 1:
						System.out.print(b);
						break;
					}

				}
				if (zf == 1) { // 输出不带负数的随机数b
					System.out.print(b);
				}

				if (jg == 2) { // 控制是否输出结果
					if (f == 0) {
						int n = a + b;
						System.out.println("=" + n);
					}
					if (f == 1) {
						int n = a - b;
						System.out.println("=" + n);
					}
					// 输出等号
				} else {
					System.out.println("="); // 输出等号
				}

			}

			if (fh == 1) { // 输出乘除的运算
				int tt = (int) (Math.random() * 4);
				switch (tt) { // 随机生成四种符号
				case 0:
					System.out.print("+");
					break;
				case 1:
					System.out.print("-");
					break;
				case 2:
					System.out.print("*");
					break;
				case 3:
					System.out.print("/");
					break;
				}
				int b = (int) (Math.random() * tf + 1); // 生成随机数b
				if (zf == 0) { // zf=0有负数
					int c = (int) (Math.random() * 2);
					switch (c) { // 输出带负数的随机数b
					case 0:
						b = b * -1;
						System.out.print("(" + b + ")");
						break;
					case 1:
						System.out.print(b);
						break;
					}

				}
				if (zf == 1) { // 输出不带负数的随机数b
					System.out.print(b);
				}
				if (jg == 2) {
					int n;
					switch (tt) {
					case 0:
						n = a + b;
						System.out.println("=" + n);
						break;
					case 1:
						n = a - b;
						System.out.println("=" + n);
						break;
					case 2:
						n = a * b;
						System.out.println("=" + n);
						break;
					case 3:
						n = a / b;
						System.out.println("=" + n);
						break;
					}
					// 输出等号
				} else {
					System.out.println("="); // 输出等号
				}

			}
		}
	}

	void show() throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in); // 创建Scanner对象从键盘获取一个值

		System.out.print("请输入生成四则运算的数量：");
		ts = sc.nextInt();
		// 控制题目生成个数
		try {
			System.out.print("请输入操作数的范围(结果也会小于该值哦)：");
			tf = sc.nextInt();
			// 控制题目取值范围
		} catch (Exception e) {
			System.out.println("请输入正确的取值范围");
			show();
		}
	

		System.out.println("请选择算式是否有负数，“0.是”，“1.否”：");
		zf = sc.nextInt();
		// 控制算式是否有负数

		System.out.println("请选择是否有乘除，“1.是”，“2否”：");
		fh = sc.nextInt();
		// 控制是否生成乘除

		System.out.print("是否输出运算结果.1否，2是：");
		jg = sc.nextInt();
		// 选择是否输出运算结果
		yunsuan();
	}
}
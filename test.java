import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import org.junit.Test;

public class Siy {
	int ts, tf, zf, fh, jg;

	void yunsuan() throws FileNotFoundException {
		PrintStream ps = new PrintStream("d:/jieguo.txt"); // ��d������txt�ĵ�
		System.setOut(ps);
		for (int i = 0; i < ts; i++) { // ��ѭ��������Ŀ����
			int a = (int) (Math.random() * tf + 1); // �����������ֵ��a
			if (zf == 0) { // zf=0�и���
				int c = (int) (Math.random() * 2);
				switch (c) { // ����������������a
				case 0:
					a = a * -1;
					System.out.print(a);
					break;
				case 1:
					System.out.print(a);
					break;
				}

			}

			if (zf == 1) { // ������������������a
				System.out.print(a);
			}
			int f = (int) (Math.random() * 2);
			if (fh == 2) { // �����+������-��
				switch (f) { // ������������
				case 0:
					System.out.print("+");
					break;
				case 1:
					System.out.print("-");
					break;
				}
				int b = (int) (Math.random() * tf + 1); // ���������b
				int sum = a + b;
				if (zf == 0) { // zf=0�и���
					int c = (int) (Math.random() * 2);
					switch (c) { // ����������������b
					case 0:
						b = b * -1;
						System.out.print("(" + b + ")");
						break;
					case 1:
						System.out.print(b);
						break;
					}

				}
				if (zf == 1) { // ������������������b
					System.out.print(b);
				}

				if (jg == 2) { // �����Ƿ�������
					if (f == 0) {
						int n = a + b;
						System.out.println("=" + n);
					}
					if (f == 1) {
						int n = a - b;
						System.out.println("=" + n);
					}
					// ����Ⱥ�
				} else {
					System.out.println("="); // ����Ⱥ�
				}

			}

			if (fh == 1) { // ����˳�������
				int tt = (int) (Math.random() * 4);
				switch (tt) { // ����������ַ���
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
				int b = (int) (Math.random() * tf + 1); // ���������b
				if (zf == 0) { // zf=0�и���
					int c = (int) (Math.random() * 2);
					switch (c) { // ����������������b
					case 0:
						b = b * -1;
						System.out.print("(" + b + ")");
						break;
					case 1:
						System.out.print(b);
						break;
					}

				}
				if (zf == 1) { // ������������������b
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
					// ����Ⱥ�
				} else {
					System.out.println("="); // ����Ⱥ�
				}

			}
		}
	}

	void show() throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in); // ����Scanner����Ӽ��̻�ȡһ��ֵ

		System.out.print("�������������������������");
		ts = sc.nextInt();
		// ������Ŀ���ɸ���
		try {
			System.out.print("������������ķ�Χ(���Ҳ��С�ڸ�ֵŶ)��");
			tf = sc.nextInt();
			// ������Ŀȡֵ��Χ
		} catch (Exception e) {
			System.out.println("��������ȷ��ȡֵ��Χ");
			show();
		}
	

		System.out.println("��ѡ����ʽ�Ƿ��и�������0.�ǡ�����1.�񡱣�");
		zf = sc.nextInt();
		// ������ʽ�Ƿ��и���

		System.out.println("��ѡ���Ƿ��г˳�����1.�ǡ�����2�񡱣�");
		fh = sc.nextInt();
		// �����Ƿ����ɳ˳�

		System.out.print("�Ƿ����������.1��2�ǣ�");
		jg = sc.nextInt();
		// ѡ���Ƿ����������
		yunsuan();
	}
}

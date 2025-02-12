package edu.kh.variable.ex1;

public class PrintExample {
	public static void main(String[] args) {
		/*
		 * %d %o %x
		 * %c %s
		 * %f %e %g
		 * %A
		 * %b
		 * 
		 * \t
		 * \n
		 * \\
		 * \' \"
		 * \u0041 A 
		 */
		int d = 1;
		int o = 8;
		float f = 0.1f;
		char c = 'a';
		boolean b = false;
		String str = "Hello!";
		System.out.printf("%5d\n",d);
		System.out.printf("%5o\n",o);
		System.out.printf("%.3f\n",f);
		System.out.printf("%5c\n",c);
		System.out.printf("%5s\n",str);
		System.out.printf("%5b\n",b);
		
	}
}

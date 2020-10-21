// Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where
//F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5
public class Fibonacci {
 public static void main(String args[]) {
	 float a=1;
	 float b=1;
	 float c=0;
	 
	 System.out.print(a+" "+b+" ");
	 for(int i=1;i<=20;i++) {
		 c= a+b;
		 System.out.print((int)c+" ");
		 a=b;
		 b=c;
		 
	 }
	 System.out.println();
	 System.out.print("the average is "+(c/20));
}
}
//Q5.
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8 
public class pardisem {
	public static void main(String args[]) {
		int x[][] = new int[8][];
		int p=7;
		for(int i = 0; i <= 8; i++)
	      {
	         for(int j = 0; j <= i; j++)
	            if(j == 0 || j == i)
	               x[i][j] = 1;
	            else
	               x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
	      }
	      for(int i = 0; i < 8; i++)
	      {
	         for(int j = 0; j <= p; j++)
	            System.out.print(" ");
	         p--;
	         for(int j = 0; j <= i; j++)
	            System.out.print(x[i][j] + " ");
	         System.out.println();
	      }
	}
}

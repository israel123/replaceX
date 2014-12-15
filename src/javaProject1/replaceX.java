package javaProject1;

public class replaceX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x=5, y=7 ;
	int temp;
	
	System.out.print("Before swapping " + "x=" + x );
	System.out.println( " y=" + y );

	temp = x;
	x = y;
	y = temp;
	System.out.print("After swapping " + "x=" + x );
	System.out.print( " y=" + y );
	}

}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 10}; 
        int sum = 0; 
        //Advanced for loop
        for( int num : array) { 
            sum = sum+num; 
        } 
        System.out.println("Sum of array elements is:"+sum);
    }

    
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		float first = 2.50f, second = 4.50f; 
        System.out.println("--Before swap--"); 
        System.out.println("First number = " + first); 
        System.out.println("Second number = " + second); 
 
        // Value of first is assigned to temporary
       float temporary = first; 
 
       // Value of second is assigned to first
       first = second; 
 
       // Value of temporary (which contains the initial value of first) is assigned to second

       second = temporary; 
 
       System.out.println("--After swap--"); 
       System.out.println("First number = " + first); 
       System.out.println("Second number = " + second);

	    
	} 

    
}


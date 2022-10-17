/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int i =0; 
        int num =0; 
        //Empty String
        String primeNumbers = ""; 
 
        for (i = 1; i <= 100; i++) 
        { 
          
          int counter=0; 
          for(num =i; num>=1; num--) 
         { 
             if(i%num==0) 
           { 
            counter = counter + 1; 
           } 
        } 
        if (counter ==2) 
        { 
           //Appended the Prime number to the String
           primeNumbers = primeNumbers + i + " "; 
        } 
    } 
    System.out.println("Prime numbers from 1 to 100 are :"); 
    System.out.println(primeNumbers); 
   }

    
}

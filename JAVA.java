
/*
class hello{
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}

*/


//Data Types
/*
public class Datatypes{
    public static void main(String args[])
    {
        int age = 25;
        double price = 99.99;
        char grade = 'A';
        boolean isAlive = true;
        String name = "John";

        System.out.println(age);
        System.out.println(price);
        System.out.print(grade);
        System.out.println(" "+ name);
        System.out.println(age + price);
        System.out.println(age + ", " + price + ", " + grade + ", " + isAlive + ", " + name);


    }
}
*/




// Control flow

/*
class Controlflow {
    public static void main(String[] args) {
        int num = 7;

        if ( num %2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        System.out.println("Switch Case");
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good Job!");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            default:
                System.out.println("Try Harder Next Time"); 
        }
    }
}
*/
/*
class Controlflow2 {
    public static void main(String[] args) {
        
        System.out.println("Count Down");
        for ( int i =5; i >=1; i --) {
            System.out.println(i);
        }

        System.out.println("While");
        int i =1;
        while (i < 6) {
            System.out.println("Hello " + i);
            i++; 
        }

        System.out.println("do");
        int j =1;
        do {
            System.out.println("java loop " + i);
            i++;
        } while ( i<=2);

    }
}
*/




// Operators
// Arithmetic Operators ( + - * / % )

/*
public class OperatorExamples {

    public static void main(String[] args) {
        arithmeticOperators();
        relationalOperators();
        logicalOperators();
        assignmentOperators();
        unaryOperators();
        ternaryOperator();
    }

    public static void arithmeticOperators() {
        int a = 10, b = 3;
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    public static void relationalOperators() {
        int x = 5, y = 10;
        System.out.println("\nRelational Operators:");
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x >= 5: " + (x >= 5));
    }

    public static void logicalOperators() {
        int age = 20;
        boolean hasID = true;
        System.out.println("\nLogical Operators:");
        System.out.println("age >= 18 && hasID: " + (age >= 18 && hasID));
        System.out.println("age < 18 || hasID: " + (age < 18 || hasID));
        System.out.println("!hasID: " + (!hasID));
    }

    public static void assignmentOperators() {
        int num = 5;
        System.out.println("\nAssignment Operators:");
        num += 3;  // num = num + 3
        System.out.println("After += : " + num);
        num *= 2;  // num = num * 2
        System.out.println("After *= : " + num);
    }

    public static void unaryOperators() {
        int x = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("++x: " + (++x));
        System.out.println("x--: " + (x--));
        System.out.println("-x: " + (-x));
    }

    public static void ternaryOperator() {
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max: " + max);
    }
}
*/




// Input
/*
import java.util.Scanner;

class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter your Age: ");
        int age = sc.nextInt();

        System.out.println("Enter your Marks: ");
        double marks = sc.nextDouble();

        System.out.println("Given about details are T/F: ");
        boolean b = sc.nextBoolean();


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + marks);
        System.out.println("Given about details are " + b);
    }
}
*/



/*      // Codes for CodeChef


public class Main {
    public static void main(String[] args) {
        String phrase = "Coding, World!";
        System.out.println(phrase.charAt(6));   // prints the ","
    }
}


//"first" + " " + "second";
//first.concat(" ").concat(second); give same output   =  first second



public class Main {
    public static void main(String[] args) {
        String word = "Java";
        word = word.replace('J', 'P');
        System.out.println(word); // prints  "Pava"
    }
}


// to change the character at index 3 of the String "Cable" to 'r'
char[] charArray = "Cable".toCharArray();
charArray[3] = 'r';
String str = new String(charArray);

System.out.println(str.length()); // tp print the length of the string variable



class Patterns {
    public static void main(String[] args) {
        PrintWordLengths();
    }

    public static void PrintWordLengths() {
        String sentence = "Coding on CodeChef";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word + " - " + word.length());
        }

        System.out.println(sentence + " - " + sentence.length());
    }
}

*/


/*

import java.util.Scanner;  // Prompts the user to enter two characters and prints the sum of their ASCII values.

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       char first, second;
       first = scanner.next().charAt(0);
       second = scanner.next().charAt(0);
       System.out.println(first + second);
       scanner.close();
    }
}


import java.util.Scanner; // Get input and print 7index charcter
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.charAt(7));
    }
}


import java.util.Scanner; // To get two int input to perform tasks
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        System.out.println(one / two);
    }
}


import java.util.Scanner; // Two word Input and Concardinate Output

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String a = sc.nextLine();
		String b= sc.nextLine();
		System.out.println(a+ " "+ b);

	}
}




import java.util.*;
class Codechef
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt(), b = read.nextInt();
	int c = a + b;
    	System.out.print(c);
    }
}



public class Main {
  public static void main(String[] args) {
    int x = 62, y = 62;
    if (x > y)
      System.out.println("x is greater");
    else if (y > x)
      System.out.println("y is greater");
    else
      System.out.println("both are equal");
  }
}



import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            
            if (num > 0) {
                System.out.println("Positive");
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
        
        scanner.close();
    }
}



import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();

    if (a == b || c != d) {      // or condition
        System.out.println("Good");
    } else {
        System.out.println("Bad");
    }
  }
}


public class Main {
  public static void main(String[] args) {
    boolean result = true && false;
    System.out.println(result);     // return only false
  }
}




if (!(x > 0)) {     //The "!" negates the condition, so instead of executing when "x > 0" the code is executed when "x <= 0" 
    
}




if (!(num == 5)) // number not equal to 5

public class Main {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = true;
    boolean c = false;
    
    System.out.println((a && b) || (c || a));
  }
}



import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if (a < b && b < c) {
		    System.out.print("Increasing");
		}else if (a > b && b > c) {
		    System.out.print("Decreasing");
		} else {
		    System.out.print("Neither");
		}

	}
}




public class Main {
    public static void main(String[] args) {
        int day = 3;
        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");          // Switch case
                break;
            default:
                System.out.println("Other day");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        int num = 6;
        switch(num) {
            case 3:
                System.out.println("Three");
                break;
            case 6:
                System.out.print("Six"); // As no break is given here, the output is : SixNine
            case 9:
                System.out.println("Nine"); 
                break; 
            default:
                System.out.println("Default");
        }
    }
}





import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		char vol = sc.next().charAt(0);
		
		switch(vol){
		    case 'a':
		        System.out.println("Vowel");
		        break;
		    case 'e':
		        System.out.println("Vowel");
		        break;
		    case 'i':
		        System.out.println("Vowel");
		        break;
		    case 'o':
		        System.out.println("Vowel");
		        break;
		    case 'u':
		        System.out.println("Vowel");
		        break;
		    default:
		         System.out.println("Consonant");
		}

	}
}



import java.util.*;      // Oneful Pair 
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		 if (a + b + (a * b) == 111) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}

*/

// What type of error is caused by using mismatched parentheses?  SYNTAX ERROR
// What type of error is caused by wrong variable in print? COMPLIATION ERROR
// If a/b, were b =0 causes ?? RUNTIME ERROR

//What is the correct way to declare an array?  int[] myArray;




/*
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);       //Prints 2
    }
}


public class Main {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C'};
        letters[2] = 'D';
        System.out.println(letters[2]);    //Prints 'D'
    }
}

public class Main {
    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10};
        System.out.println(data[0] + data[3]); // 10
    }
}


public class Main {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println(values.length);    //5
    }
}


public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        numbers[1] = numbers[1] * 2;
        System.out.println(numbers[1]); //prints 8
    }
}


*/


/*

int count = 0;
while (count < 5) {
    System.out.print(count + " ");  //Prints numbers 0 to 4 with spaces
    count++;
}

// How is the do-while loop different from the while loop?   The do-while loop executes the code block at least once, even if the condition is false initially.


public class Main {
    public static void main(String[] args) {
        int x = 0;
        do {
            System.out.print(x + " ");       // 0 2 4
            x += 2;
        } while (x < 5);
    }
}

// In a while loop, when does the condition get evaluated?   Before each iteration

// What happens if the initial condition of a while loop is false?   The loop is skipped, and the code inside is not executed




// Infinite Loop

public class Main {
    public static void main(String[] args) {
        int x = 1;
        while (x > 0) {
            System.out.print(x);
            x = x + 1;
        }
    }
}


// In a do-while loop, when does the condition get evaluated?  After each iteration


class Codechef
{
	public static void main (String[] args) 
	{
		int x =1;
		
		while ( x < 6) {
		    System.out.print(x*x + " "); // 1 4 9 16 25
		    x++;
		}

	}
}


// Factorial of the given number

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= a);

        System.out.println(factorial + " ");   // inp = 5 , out = 1xx2x3x4x5 = 120
    }

}


*/


/*
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * 2 + " ");   // The loop iterates from 1 to 10, and the statement System.out.print(i * 2 + " "); prints multiples of 2
        } 
    }
}



for (Statement1; Statement2; Statement3) {              // Statement 3 is executed after the loop body in each iteration and is typically used for incrementing or decrementing the loop variable, i.e defining the updation rules of the loop variable
    // code block                                          // Statement 1 is the initialization part of the for loop where the loop variable is typically initialized
}      



public class Main {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'E'; ++c)                // The loop iterates over characters from 'A' to 'E' inclusive and prints them     Prints characters from 'A' to 'E'
            System.out.print(c + " ");
    }
}

*/



/*


//The break statement is used to exit a loop prematurely. In this case, the loop will exit when the value of i is equal to 5
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}




// The continue statement skips the rest of the code inside the loop for the current iteration and continues with the next iteration
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");   // 1 3
        }
    }
}



// In a for-each loop, the variable (num in this case) represents the value of each element in the array during each iteration
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            System.out.print(num * 2 + " ");   
        }
    }
}

*/





/*

import java.lang.*;
import java.util.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		System.out.println(a+b + " ");
		}
		
	}
}


/*
input:
3
1 2
100 200
10 40

output:
3
300
50

*/


/*
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int a = sc.nextInt();
    		
    		if ( x <= a && a < y ) {
    		    System.out.println("YES");
    		} else {
    		    System.out.println("NO");
    		}
		}
		
	}
}



/*
input:
21 34 30
25 31 31
22 29 25
20 40 15
28 29 28

output:
YES
NO
YES
NO
YES

*/



/*
static void myFunction() {
    int a = 10;
    System.out.println(a);
}

public static void main(String[] args) {
    int a = 5;    
    myFunction();
    System.out.println(a);
}


10
5



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); // number of test cases
        
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String ans = isEven(b);
            System.out.println(ans);
        }
        
        sc.close();
    }
    
    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}


*/



class Placement {
    public static void main(String[] args) {

        // ReverseaString();
        Palindrome();
        // Fibbonacci();
        // Factorial();
        // PrimeNumberCheck();
        // CountVowelandConsonant();
        // SortaArray();
        // MergetwoArrays();
        // LargestelementinArray();
        // RemoveDuplicatefromArray();

    }



    public static void ReverseaString() {
        String Str= "Hello World";
        String Rstr = new StringBuilder(Str).reverse().toString();
        System.out.println(Str.equals(Rstr));
        System.out.println(Rstr);
    }

    public static void Palindrome() {
        


    }  
}









import java.io.*;
import java.util.Scanner;
class grade {  

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n;
	n=input.nextInt();
	if (n>=90){
		System.out.println("Grade A");
	}
	else if (n>75 && n<90){
		System.out.println("Grade B");
	}
	else if (n>55 && n<75){
		System.out.println("Grade C");
	}
	else{
		System.out.println("Fail");
	}
    }  
}
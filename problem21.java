import java.io.*;
import java.util.Scanner;
class problem21 {  

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a;
	a=input.nextInt();
	if (a%2==0){
		System.out.println("Even Number");
	}
	else{
		System.out.println("Odd Number");
	}
    }  
}
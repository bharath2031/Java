import java.io.*;
import java.util.Scanner;
class votervalid {  

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age;
	age = input.nextInt();
	if (age>=18){
		System.out.println("You are eligible to vote.");
	}
	else{
		System.out.println("You are not eligible to vote.");
	}
    }  
}
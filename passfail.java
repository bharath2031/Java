import java.io.*;
import java.util.Scanner;
class passfail {  

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int grade;
	grade = input.nextInt();
	if (grade>=50){
		System.out.println("Pass.");
	}
	else{
		System.out.println("Fail");
	}
    }  
}
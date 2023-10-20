package day2Assignment;

public class Palindrome {
public static void main(String[] args) {
	int input, output;
	input = 12321;
	output= 0;
	//for loop to reverse the digits of the input 
	for (int i = input ; i > 0; i/=10) {
		int rem = i % 10;
		output = output * 10 + rem;
	}
	//Comparing input and output values
	if(input == output) {
		System.out.println("The given number " + input + " is a Palindrome");
	}
	else System.out.println("The given number " + input + " is not a Palindrome");
	}
}





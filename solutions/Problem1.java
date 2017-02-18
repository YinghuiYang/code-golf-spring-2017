
import java.io.*;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File inputFile = new File("../inputs/1.txt");
		Scanner inputNum = new Scanner(inputFile);
		PrintStream answer = new PrintStream("../answers/question1.txt");
		while(inputNum.hasNext()){
			int number = inputNum.nextInt();
			int count = countPrime(number);
			answer.println(count);
		}
		inputNum.close();
		answer.close();
	}
	
	public static int countPrime(int num){
		int count=0;
		for(int i=1;i<=num;++i){
			if(isPrime(i)){
				++count;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int num){
		if(num==1){
			return false;
		}
		if(num==2)return true;
		for(int i=2; i*i<=num; ++i){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}

}

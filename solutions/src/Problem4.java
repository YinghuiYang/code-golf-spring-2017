import java.io.*;
import java.util.*;
public class Problem4 {
	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File("../inputs/3.txt");
		Scanner input = new Scanner(inputFile);
		double[] x = new int[50];
		double[] y = new int[50];
		while(input.hasNext()){
			int i =0;
			x[i]=input.nextDouble();
			y[i]=input.nextDouble();
			++i;
		}
		double m;
		double b;
		double x11=50;
		double x12=0;
		double y11=0;
		double x22 = 0, y21=0;
		for(int i=0; i<50;++i){
			x12=x12+x[i];
			y11=y11+y[i];
			x22 = x22 + x[i]*x[i];
			y21 = y21+x[i]*y[i];
		}
		double x21=x12;
		
		m = (x22*y11-y11*y21)/(x22*x11-x21*x12);
		
		//still trying the algebra here
		b = (x12*x21-x22*x11)/
		
	}
}

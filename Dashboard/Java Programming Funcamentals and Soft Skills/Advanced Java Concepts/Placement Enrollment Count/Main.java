import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	
	public static Stream<String> getRollNumbers(String rollNumber){
		String[] str=rollNumber.split(",");
		Stream<String> roll=Stream.of(str);
		return roll;
		
	}
	public static int getCount(Stream<String> rollNumberStream,String deptAcronym){
		long n=rollNumberStream.filter(e->e.substring(0,2).equalsIgnoreCase(deptAcronym)).count();
		int k=(int)n;
		return k;
	}
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter all roll numbers separated by comma");
		String s=kb.next();
		System.out.println("Enter the department name acronym");
		String b=kb.next();
		int n=getCount(getRollNumbers(s),b);
		if(n==0){
			System.out.println("No students from "+b);
		}
		else{
			System.out.println("Number of students in "+b+"is "+n);
		}
	}

}

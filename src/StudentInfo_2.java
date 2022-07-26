/* 
 * Author : JUNG, JIKANG
 * When : '22.07.26.TUE, 14:14
 * Objectives : 
 * Environment : Windows, JDK 11.0.16, Eclipse IDE(2022-06)
*/
import java.util.Scanner;

public class StudentInfo_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("귀하의 키는? : ");
	double height = sc.nextDouble();
	
	System.out.print("귀하의 몸무게는? : ");
	double weight = sc.nextDouble();
	
	System.out.print("키와 몸무게 : " + height + "," + weight);
	
	System.out.print("귀하의 키는? : ");
	height = sc.nextDouble();
	
	System.out.print("귀하의 몸무게는? : ");
	weight = sc.nextDouble();
}
}

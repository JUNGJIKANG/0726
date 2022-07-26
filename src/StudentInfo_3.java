/* class를 두개 사용해야 하는 경우
 * Author : JUNG, JIKANG
 * When : '22.07.26.TUE, 15:22
 * Objectives : 
 * Environment : Windows, JDK 11.0.16, Eclipse IDE(2022-06)
*/
public class StudentInfo_3 {
	public static void main(String[] args) {
		Student chulsu= new Student(); 
		chulsu.name="안철수";
		chulsu.hakbun="20-13915";
		chulsu.kor=80;
		chulsu.eng=100;
		chulsu.mat=85;
		int total=chulsu.kor+chulsu.eng+chulsu.mat;
		double avg=total/3.; //int는 정수이기 때문에 double로 계산을 하게 되면 한개는 실수로 표현이 되어야 계산이 가능함. 그래서 3으로 나눠야 하는 것을 3.으로 표현한 것임.
		System.out.printf("총점 : %d\n", total);
		System.out.println("평균 : "+avg);
	}
}


class Student{ //객체의 설계도
	String name; //멤버, field
	String hakbun; 
	int kor;
	int eng;
	int mat;
}
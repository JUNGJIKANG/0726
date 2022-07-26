import java.util.Scanner;
public class Practice_1 {
	public static void main(String[] args) {
		Student jikang = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("학번을 입력하세요 : ");
		jikang.hakbun=sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		jikang.name=sc.nextLine();
	    System.out.print("국어 점수를 입력하세요 : ");
		jikang.kor=sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		jikang.eng=sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		jikang.mat=sc.nextInt();
		int total=jikang.kor+jikang.eng+jikang.mat;
		double avg=total/3.;
		System.out.printf("학번 : %s\n",jikang.hakbun);
		System.out.printf("이름 : %s\n",jikang.name);
		System.out.printf("국어 : %d\n",jikang.kor);
		System.out.printf("영어 : %d\n",jikang.eng);
		System.out.printf("수학 : %d\n",jikang.mat);
		System.out.printf("총점 : %d\n",total);
		System.out.printf("총점 : %.2f\n",avg);
	}
}

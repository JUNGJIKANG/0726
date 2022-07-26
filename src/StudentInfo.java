import java.util.Scanner; //Scanner를 쓰려면 이 문장이 필요
public class StudentInfo {
  public static void main(String[] args) { //프로그램의 시작과 끝
	Scanner sc = new Scanner(System.in);
	System.out.print("오늘 날짜를 입력하세요 : "); //문자는 반드시""안에 작성할 것.
	String Today = sc.nextLine(); //스캐너를 통해서 키보드로 한 줄을 다 읽으라는 의미의 sc, =은 좌측의 의미를 우측에 대입한다는 의미
	
	System.out.print("학생의 이름을 입력하세요 : ");
	String Name = sc.nextLine();
	
	System.out.print("학생의 학번을 입력하세요 : ");
	String Hakbun = sc.nextLine();
	
	System.out.println("날짜 : " + Today);
	System.out.println("이름 : " + Name);
	System.out.println("학번 : " + Hakbun);
  }
}


public class CharDemo {
	public static void main(String[] args) {
		System.out.printf("%c",65); //char를 찍을 때는 %c 로 작성
		System.out.printf("%c",65+1);
		System.out.printf("%c",'\n');
		char ch='C';
		System.out.printf("%c",ch);
		System.out.printf("%c",ch+1);
		System.out.printf("%c",'\b');
		System.out.printf("%c",'E');		
		
//		char grade = 'B'; //''안에는 반드시 1개의 글자만 들어갈 수 있음. 
//		System.out.println("grade="+grade);
//		char ch='n'; //escape문자는 문자로 보지 않음. 따라서, \n은 글자로 치지 않음(capter3. char literals - escape sequence 참조)				
//		System.out.println("ch="+ch);
//		ch='C';
//		System.out.println("ch="+ch);
		char ch = '\uCAFE'; 
		system.out.println("ch="+ch);
	}

}

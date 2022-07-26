
public class FloatingDemo {
	public static void main(String[] args) {
		double avg=0.08955556789;
		
//		System.out.println("avg="+avg); //원래값
//		System.out.printf("avg=%.2f\n",avg); //실수형, f를 했을 경우에는 소수점 이하 6개 자리를 표현(%.0f로 작성하면 내가 원하는 소수점까지 작성 가능)
//		System.out.printf("avg=%e",avg);//10의 제곱을 곱하고 소수점 이하 5번째에서 반올림 후 출력, 이거 어렵다...
		
		float f =0.123456789123456789f;
		double d= 0.123456789123456789;
		System.out.println("f="+f);
		System.out.println("d="+d); //실수형의 기본은 double이다. float는 잘 사용하지 않음.
	}
}

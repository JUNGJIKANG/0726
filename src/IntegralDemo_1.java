/* 
 * Author : JUNG, JIKANG
 * When : '22.07.26.TUE, 14:14
 * Objectives : 
 * Environment : Windows, JDK 11.0.16, Eclipse IDE(2022-06)
*/
public class IntegralDemo_1 {
public static void main(String[] args) {
	System.out.println("10진수------------------------");
	System.out.printf("255의 10진수 : %d\n",255);
	System.out.println("255의 2진수 : " + Integer.toBinaryString(255));
	System.out.printf("255의 8진수 : %o\n",255);
	System.out.printf("255의 16진수 : %x\n",255);
	System.out.println("2진수(0b)-------------------------");
	System.out.printf("0b01110000의 10진수 : %d\n",0b01110000);
	System.out.println("0b01110000의 2진수 : " + Integer.toBinaryString(0b01110000));
	System.out.printf("0b01110000의 8진수 : %o\n",0b01110000);
	System.out.printf("0b01110000의 16진수 : %x\n",0b01110000);
	System.out.println("8진수------------------------");
	System.out.printf("056의 10진수 : %d\n",056);
	System.out.println("056의 2진수 : " + Integer.toBinaryString(056));
	System.out.printf("056의 8진수 : %o\n",056);
	System.out.printf("056의 16진수 : %x\n",056);
	System.out.println("16진수(0x)------------------------");
	System.out.printf("0xAB의 10진수 : %d\n",0xAB);
	System.out.println("0xAB의 2진수 : " + Integer.toBinaryString(0xAB));
	System.out.printf("0xAB의 8진수 : %o\n",0xAB);
	System.out.printf("0xAB의 16진수 : %x",0xAB);
}
}

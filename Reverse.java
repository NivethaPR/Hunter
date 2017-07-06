package Guvi;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		String str="";
		String s="NIVI";
		Scanner sc=new Scanner(System.in);
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		System.out.println(str);
		

	}

}

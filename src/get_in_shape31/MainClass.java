package get_in_shape31;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Training u = new Training(); 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<1.회원가입 / 2.로그인>");
		System.out.print(">> ");
		if(scan.nextInt() == 1) u.SignUp();
		else u.SignIn();
		
		////////////////////////////////////
		
		System.out.println("<1.운동하기 / 2.마이페이지>");
		System.out.print(">> ");
		if(scan.nextInt() == 1) u.TodayTraining();
		else u.Mypage();
		
	}
}

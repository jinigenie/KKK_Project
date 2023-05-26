package get_in_shape31;

import java.util.Scanner;

public class MainClass {
	
    public static final String black    = "\u001B[30m" ;
    public static final String red      = "\u001B[31m" ;
    public static final String green    = "\u001B[32m" ;
    public static final String yellow   = "\u001B[33m" ;
    public static final String blue     = "\u001B[34m" ;
    public static final String purple   = "\u001B[35m" ;
    public static final String cyan     = "\u001B[36m" ;
    public static final String white     = "\u001B[37m" ;
    public static final String exit     = "\u001B[0m" ;
    
	public static void main(String[] args) {
		

		Training u = new Training(); 
		
		System.out.println(blue + "< Get In Shape 31 >\n" + exit);
		
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

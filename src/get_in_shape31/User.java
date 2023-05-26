package get_in_shape31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// User 클래스
public class User {

	// userList 정의
	List<User> userList = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	// 회원가입 메소드
	public void SignUp() {
		/* 1. 이름, 아이디, pw, 생년월일 등을 입력받기
		 * 2. user 테이블에 추가 --> DB
		 * 3. userData 객체 생성하여 userList에 저장
		 * 3. 회원가입 완료 시, SignIn() 호출
		 * */
	}
	
	// 로그인 메소드
	public void SignIn() {
		/* 1. 아이디, pw 입력받기
		 * 2. 로그인 성공할 때까지 반복 ('q'입력하면 종료 -> SignOut()호출 )
		 * 3. userList에서 입력받은 id 있는지 확인
		 *    -> 없으면, "회원 정보가 없습니다."
		 *    -> 있으면, 해당 id의 pw와 입력한 pw 비교 
		 * 4. 로그인 성공 또는 실패에 따른 출력
		 */
	}
	
	// 로그아웃 메소드
	public void SignOut() {
		/* 프로그램 강제 종료 */
		System.out.println("프로그램을 종료합니다.");
	}
	
	// 마이페이지 확인 메소드
	public void Mypage() {
		System.out.println("<1.훈련일지 확인 / 2.목표달성률 확인 / 3.포인트 확인 / 4.정보 확인 및 수정 / 5.로그아웃>");
		/*
		 * 1. 메뉴 입력받기
		 * 2. 입력한 메뉴에 따라 각 메소드 호출(1~4번)
		 * 3. 입력한 메뉴가 5이면 강제 종료 -> SignOut()호출 
		 * 4. 그 외에는 "잘못 입력" 
		 */
		System.out.print(">> ");
		int mnum = scan.nextInt();
		switch (mnum) {
		case 1: {
			OpenTrainingLog();
			break;
		}
		case 2: {
			AchiveGoal();
			break;
		}
		case 3: {
			ViewPoint();
			break;
		}
		case 4: {
			EditInfo();
			break;
		}
		case 5: {
			SignOut();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + mnum);
		}
		
	}
	
	// 훈련일지 확인 메소드
	public void OpenTrainingLog() {
		/* 훈련일지 모든 컬럼에 대한 데이터 불러오기 --> DB */
	}
	
	// 목표달성 확인 메소드
	public void AchiveGoal() {
		/* 목표달성률 변수값 출력 */
	}
	
	// 포인트 확인 메소드
	public void ViewPoint() {
		/* 포인트 변수값 출력 */
	}
	
	// 정보확인 및 수정 메소드
	public void EditInfo() {
		System.out.println("<1.내 정보 확인 / 2.정보 수정>");
		/* 입력받은 메뉴에 따라 처리
		 * 1. 내 정보 확인 : id, 이름, pw, 생년월일 등의 기본 정보
		 * 2. 정보 수정 : pw 변경
		 */
	}

}

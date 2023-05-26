package get_in_shape31;

public class Training extends User {

	// 오늘의 운동을 확인하는 메소드
	public void TodayTraining() {
		/*
		 * 1. Training 테이블 count범위(가능하면)의 랜덤 수 생성
		 *    (우선, 미리 입력한 운동 종류 수에 맞춰 만들기)
		 * 2. 랜덤 번호에 해당하는 운동 종류와 개수 출력 //변수에도 저장 필요  --> DB
		 *    "오늘의 운동은 '스쿼트 30'회 입니다." 
		 *    "운동을 시작하겠습니까?(y/n)"
		 * 3. y 입력 시, "지금부터 운동을 시작하세요!"출력 후, StartTraining()호출
		 *    n 입력 시, "내일은 꼭 하세요! 그럼 안녕!"출력 후, 종료
		 */
	}

	
	// 운동 시작 메소드
	public void StartTraining() {
		/*
		 * 오늘 운동에 대한 정보 불러오기 --> DB
		 */
		
		System.out.println("운동이 끝나면 아무 키나 입력하세요.");
		/*
		 * 아무 키 입력받으면 WriteLog() 호출
		 */
	}
	
	
	// 훈련일지 작성 메소드
	public void WriteLog() {
		/*
		 * 1. 운동시간, 난이도 및 다짐 각각 입력받기
		 * 2. 오늘 날짜 불러오기
		 * 3. 오늘 날짜, 운동시간, 난이도, 다짐 등과 함께 운동 정보를 훈련일지 테이블에 추가 --> DB
		 * 4. Mypage() 함수 호출
		 */
	}
	
}

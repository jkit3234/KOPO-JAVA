package TaskComparator;

public class Student {

 //[1단계] 필드 선언 : 학생 정보를 담을 변수들(정보 저장 공간)
	String name;  // 이름
	int korean;   // 국어 점수
	int english;  // 영어 점수
	int math;     // 수학 점수
	
  //[2단계] 생성자 추가 : 학생 객체를 만들 때 이름이랑 점수를 한 번에 넣어주는 함수(객체 만들때 값 넣기)
  //예) new Student("홍길동", 90, 80, 70)
	public Student(String name, int k, int e, int m) {
	this.name = name; // 받아온 name을 내 name에 저장
    this.korean = k;
    this.math = m;
    this.english = e;
	}
	
	//[3단계] 메서드 추가(기능) - 총점 계산
	public int getTotal() {
		return korean + english + math; 
	}
	
	// 평균 계산
	public double getAvg() {
        return getTotal() / 3.0;
        
	}

	// 출력 형식(System.out.println 할 때 자동으로 이 형태로 나옴)
	@Override
	public String toString() {
		return name + " " + korean + " " + english + " " + math +" "+ "총점:" + getTotal();
	}
	
}

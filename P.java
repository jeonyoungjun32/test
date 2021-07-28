package a_project_interface_test;

public interface P {
	//public static final  int INPUT=1, SEARCH=2, EXIT=3;
	 int INPUT=1, SEARCH=2, EXIT=3;
	//1.이름, 주민등록번호, 전화번호를 저장
	void input();

	
	//2. 주민등록번호를 기반으로 고객의 이름과 전화번호를 검색
	void search();
	
	public static int add(int...arr) {//int...arr = 배열을 만들었따 
		int hap=0;
		
		for(int item : arr) {
			hap += item;
		}
		
		
		return hap;
		
	}
}

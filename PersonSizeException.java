package a_project_interface_test;

public class PersonSizeException extends Exception{
	//예외 메시지 : " 더 이상 고객 정보를 저장할 공간이 없습니다."
	//처리하는 곳에서 e.getMessage() 호출하려면 리턴되는 문자열
	
	public PersonSizeException() {
		super("더 이상 고객 정보를 저장할 공간이 없습니다.");
		//Exception() 생성자한테 전달되어 e.getMessage()메서드를 호출하면 리턴되는 문자열
	}
}

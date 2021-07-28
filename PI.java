package a_project_interface_test;

import java.util.Scanner;

class Person {//이름과 주민번호를 가진 클래스
	private String name; //고객의 정보 보안
	private String serialNumber;

	Person(String name, String number) {
		super();
		this.name = name;
		this.serialNumber = number;
		
	}

	String getName() {
		return name;
	}

	String getSerialNumber() {
		return serialNumber;
	}


	
}
class Person2 extends Person{
	//상속받은 멤버 + 전화번호
	private String phoneNumber;
	private String wnth;
	Person2(String name, String serialNumber, String phoneNumber, String wnth) {
		super(name, serialNumber);
		this.phoneNumber = phoneNumber;
		this.wnth=wnth;
	}
	//상속받은 메서드 + 추가

	String getPhoneNumber() {
		return phoneNumber;
	}

	String getWnth() {
		return wnth;
	}
	
}
/*
 * PI클래스는 P인터페이스를 구현함. 
 * 인터페이스는 여러 개 구현가능(예)implements List<E>,A,B,...
 */
//PI : 매니저클래스
public class PI implements P{//PI클래스는 P인터페이스를 구현함. 인터페이스는 여러 개 구현가능
	private Person[] p; //포함관계로 Person을 관리하는 배열객체 생성
	
	public PI(int size) {//size:고객수 10
		p = new Person[size];//배열 : length멤버변수(읽기전용)==size
		
	}
	
	Scanner sc = new Scanner(System.in);
	int i = 0;//0->1 입력받은 고객 수
	
	@Override
	public void input() {
		
		try {
			if(i==p.length) {//i==size 사용못함 (이유? size 지역변수이기 때문에 )
				throw new PersonSizeException();//수동으로 예외객체 생성
			}
		} catch (PersonSizeException e) {
			//이 메서드 안에 e.getMessage()가 포함되어 예외 메세지를 출력 + 예외클래스 종류와 예외발생경로 출력
			//e.printStackTrace();
			//System.out.println(e);//예외클래스 종류 + 예외 메세지 출력
			System.out.println(e.getMessage());
			return;//해당 메서드(input())를 종료 -> main()의 반복문으로 돌아가 계속 프로그램이 실행됨
		}
		
		System.out.print("이름을 입력하세요:"); //String name = MenuViewer.sc.next();
		String name=sc.next();//지역변수
		
		System.out.print("주민등록번호를 입력하세요:"); 
		String serialNumber=sc.next();
		
		System.out.print("전화번호를 입력하세요:"); 
		String phoneNumber=sc.next();
		
		System.out.println("주소를 입력하세요");
		String wnth=sc.next();
		//p[i++] = new Person2(name, serialNumber, phoneNumber);
		addPerson(name, serialNumber, phoneNumber, wnth);
	}
	
	private void addPerson(String name, String serialNumber, String phoneNumber, String wnth){
		p[i++] = new Person2(name, serialNumber, phoneNumber, wnth);//자식객체 -> 부모타입으로 자동형변환되어 대입
		//i++;
	}
	
	@Override
	public void search() {
		System.out.print("주민등록번호 입력하세요:");
		String serialNumber=sc.next();
		
		if(search(serialNumber) !=null) {
			show();//정보출력 -> 고객 정보 출력
			System.out.println(search(serialNumber));
		}
		else System.out.println("입력한 주민등록번호에 해당하는 고객은 없습니다.");
		
		System.out.println();//빈줄
	}
	
	private String search(String serialNumber) {//예 "990609-1*****"
		for(Person person:p) {
			String personInfo="";
			if(serialNumber.equals(person.getSerialNumber())) {
				personInfo +="고객의 이름은:"+ person.getName()+",";
				if(person instanceof Person2) {
					personInfo +="전화번호:"+((Person2)person).getPhoneNumber()+",";
					personInfo +="주소 :"+((Person2)person).getWnth();
				    }
				return personInfo;
			  }
		}//for 끝
		return null;
	}

	
	/***********************************************************************************/
	
	public void show() {
		//P.super.show();
		System.out.println("***고객 정보 출력***");
	}
	
	
	
	
	
	
	
}















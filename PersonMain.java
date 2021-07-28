package a_project_interface_test;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//홍대표는 기다리지 않고 매니저클래스(PI)만 듣고 바로 작업
		
		
		P p = new PI(5);
		p.toString();
		
		
		for(int i=0;i<10;i++) {
			MenuViewer.showMenu();
			int num = sc.nextInt();
			
			switch(num) {
			//case p2. : 
			case P.INPUT :
				p.input(); break;
				
				case P.SEARCH:
					p.search();break;
					
					case P.EXIT :
						System.out.println("프로그램 종료");
						default : System.out.println("1~3중 입력하세요");
				
			
			
			
			}
		}
		//저장할 고객 수 입력 받아 
		
		//그 고객수로 PI객체 생성(PI : 매니저 클래스)
		
		
		
		//그 고객수만큼 고객정보 입력
		//주민번호로 이름과 전화번호 검색
		//프로그램 종료
		
		
	}

}

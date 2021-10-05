package boj_10869;

import java.util.Scanner;

	/* ===================================================
	 * BOJ(백준) 1단계 : 입출력과 사칙연산
	 * 
	 * <<boj_10869>>
	 * 정숫값을 입력받아 사칙연산 결과 출력하기 (사칙연산)
	 * https://www.acmicpc.net/problem/10869
	 * 
	 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
	 * 
	 * 입력 : 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
	 * 출력 : 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
	 *       
	 * (예제 입력)
	 *  7 3
	 * (예제 출력)
	 *  10
	 *  4
	 *  21
	 *  2
	 *  1
	 * 
	 * ===================================================
	 * 
	 * [필요 지식]
	 * 
	 * 1. Scanner(System.in) 객체 생성
	 * 2. 메서드 nextInt()로 버퍼의 값 받아오기
	 * 3. 변수의 선언 및 값 저장하기
	 * 
	 * ===================================================
	 * 
	 * 1.Scanner 클래스
	 * 
	 *  1) Scanner(System.in) : 사용자의 입력으로부터 값을 버퍼에 저장
	 *  
	 *  2) Scanner(System.in) 사용시 주의할 점
	 * 	  - 사용자의 입력
	 *    - 사용자가 입력 한값을 버퍼에 저장. 이 때 공백, 탭문자, 개행자(\n) 등도 버퍼에 저장된다.
	 *    - next(), nextInt() 메서드는
	 *      버퍼에서 다음 공백, 탭문자, 개행자를 기점으로 앞부분까지만 가져와서(버퍼에서 해당부분은 지워짐) 반환한다.
	 *    - nextLine() 메서드는 다음 개행자(\n)까지 가져와서(버퍼에서 해당부분은 지워짐)
	 *      개행자 앞부분까지를 반환한다.
	 *    - 이런 점에서 next(), nextInt() 등에 이어서 nextLine() 등을 같이 쓸 때는 주의해야하는데,
	 *      버퍼를 nextLine()을 한번 사용해서 버퍼를 비우도록 해야함.
	 *    - 타입이 맞지 않는 입력값을 받았을 경우 inputMismatchException이 발생하므로 예외처리를 하는 것이 좋다.
	 * 
	 * ===================================================
	 * 
	 * 2. 변수의 선언, 값 저장하기
	 *  
	 *  1) 변수
	 *   단 하나의 데이터를 저장할 수 있는 메모리 공간
	 * 
	 *  2) 선언 및 저장
	 *  
	 *   - 변수타입 변수명; // 선언
	 *   - 변수명 = 값; // 저장
	 *   - 변수타입 변수명 = 값; //선언 + 저장
	 * 
	 *  3) 선언 위치에 따른 변수의 종류]
	 *   * 클래스 변수 : 클래스 영역(메서드 바깥)에 선언된 변수
	 *       - static 변수 (객체를 생성하지 않고 사용할 수 있음.) : 클래스가 메모리에 올라갈 때 자동으로 초기화
	 *       - 인스턴스 변수 (객체를 생성해야 사용할 수 있음.) : 객체가 생성될 때 자동 초기화
	 *       
	 *   * 지역 변수 : 메서드 영역(메서드 안)에 선언된 변수.
	 *              자동으로 초기화되지 않기 때문에 수동으로 초기화 코드를 작성해야 호출해서 사용할 수 있다.
	 *              
	 * ===================================================           
	 */

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Scanner(System.in) 생성
		int a = scanner.nextInt(); // int 타입의 변수 a에 공백문자 이전의 값 저장
		int b = scanner.nextInt(); // int 타입의 변수 b에 공백문자 이전의 값 저장

		scanner.close(); // Scanner가 더 객체가 더 이상 기능을 하지 않도록 함.
		
		System.out.println(Calculator.addition(a,b)); // 덧셈
		System.out.println(Calculator.subtraction(a,b)); // 곱셈
		System.out.println(Calculator.multiplication(a,b)); // 곱셈
		System.out.println(Calculator.quotient(a,b)); // a를 b로 나눈 몫
		System.out.println(Calculator.remainder(a,b)); // a를 b로 나눈 나머지
	}

}

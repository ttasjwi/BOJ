package boj_2741;

import java.util.Scanner;

	/* ===================================================
	 * BOJ(백준) 3단계 - for문
	 * 
	 * <<boj_2741>>
	 * 입력한 숫자까지 한줄씩 출력 (for문)
	 * https://www.acmicpc.net/problem/2741
	 * 
	 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	 *
	 * 입력>
	 *  첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
	 * 
	 * 출력>
	 *  첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
	 * 
	 * (예제 입력)
	 *  5
	 *  
	 * (예제 출력)
	 *  1
	 *  2
	 *  3
	 *  4
	 *  5
	 * 
	 * ===================================================
	 * 
	 * [필요 지식]
	 * 
	 * 1.for문
	 * 
	 * ===================================================
	 * 
	 * 1. for문
	 *  for(초기화; 조건식; 증감식) { 조건이 참일 때 수행될 문장 }
	 *   - 초기화 : 반복문에 사용될 변수를 초기화. 처음에 한 번만 수행
	 *   - 조건식 : 조건식이 참이면 반복을 계속, 거짓이면 반복을 중단하고 for문을 벗어남
	 *   - 증감식 : 반복문을 제어하는 변수의 값을 증가 또는 감소
	 *  
	 * ===================================================
	 */



public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		print_N_All(n); // 1부터 n까지 출력
	}

	private static void print_N_All(int n) {
		for (int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}

}

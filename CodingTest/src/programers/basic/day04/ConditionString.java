package programers.basic.day04;

//조건 문자열
//문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
//
//두 수가 n과 m이라면
//">", "=" : n >= m
//"<", "=" : n <= m
//">", "!" : n > m
//"<", "!" : n < m
//두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
//
public class ConditionString {

	public static int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		int cases = 0;

		if (ineq.equals(">") && eq.equals("=")) {
			cases = 1;
		} else if (ineq.equals("<") && eq.equals("=")) {
			cases = 2;
		} else if (ineq.equals(">") && eq.equals("!")) {
			cases = 3;
		} else if (ineq.equals("<") && eq.equals("!")) {
			cases = 4;
		}

		switch (cases) {
		case 1: {
			if (n >= m) {
				answer = 1;
			} else {
				answer = 0;
			}
			break;
		}
		case 2: {
			if (n <= m) {
				answer = 1;
			} else {
				answer = 0;
			}
			break;
		}

		case 3: {
			if (n > m) {
				answer = 1;
			} else {
				answer = 0;
			}
			break;
		}

		case 4: {
			if (n < m) {
				answer = 1;
			} else {
				answer = 0;
			}
			break;
		}

		}

		return answer;
	}

	public static void main(String[] args) {
		int answer = solution("<", "=", 20, 50);
		System.out.println(answer);
		
		answer = solution(">", "!", 41, 78);
		System.out.println(answer);
	}

}

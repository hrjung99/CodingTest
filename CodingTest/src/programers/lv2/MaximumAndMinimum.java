package programers.lv2;

//최댓값과 최솟값

//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
import java.util.Arrays;

public class MaximumAndMinimum {
	
    public static String solution(String s) {
        String answer = "";
        String [] arr1 = s.split(" ");
        int [] arr2 = Arrays.asList(arr1).stream().mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr2);
        
        String min = arr2[0]+"";
        String max = arr2[arr2.length -1]+"";
        answer = min +" "+max;
        
        
        return answer;
    }

	public static void main(String[] args) {
		String s1 = "1 2 3 4";
		String answer1 = solution(s1);
		System.out.println(answer1);
		
		String s2 = "-1 -2 -3 -4";
		String answer2 = solution(s2);
		System.out.println(answer2);
	}

}



//for문으로 돌려서 형변환 할 수도 있다.
//// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
//// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
//public class GetMinMaxString {
//    public String getMinMaxString(String str) {
//        String[] tmp = str.split(" ");
//        int min, max, n;
//        min = max = Integer.parseInt(tmp[0]);
//        for (int i = 1; i < tmp.length; i++) {
//                n = Integer.parseInt(tmp[i]);
//            if(min > n) min = n;
//            if(max < n) max = n;
//        }
//
//        return min + " " + max;
//
//    }
//
//    public static void main(String[] args) {
//        String str = "1 2 3 4";
//        GetMinMaxString minMax = new GetMinMaxString();
//        //아래는 테스트로 출력해 보기 위한 코드입니다.
//        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
//    }
//}

import java.util.Arrays;
import java.util.Scanner;

public class FlattenBoxTest1 {

	static int flatten(int[] boxes, int dump) {

	        int heighDiff = 0;
	    
	        // dump 수 만큼 평탄화 작업 실행
	        Arrays.sort(boxes);
	       
	        while (dump != 0) {
	            boxes[0]++;
	            boxes[boxes.length - 1]--;
	            Arrays.sort(boxes);
	            dump--;
	        }

	        // 평탄화 완료 후
	        heighDiff = boxes[boxes.length - 1] - boxes[0];
	        return heighDiff;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int tc = 10; // 테스트케이스
	        int boxLen = 100; // 박스길이

	        for (int tcn = 1; tcn <= tc; tcn++) {
	            int dump = sc.nextInt();
	            int[] boxes = new int[boxLen];

	            for (int i = 0; i < boxes.length; i++) { // 1~100까지 각 박스의 높이
	                boxes[i] = sc.nextInt();
	            }

	            int heighDiff = flatten(boxes, dump); // 구현해야 할 메소드 (boxex : 박스 모형, dump : 평탄화할 횟수)
	            System.out.printf("#%d %d%n", tcn, heighDiff);
	        }

	    }

	}

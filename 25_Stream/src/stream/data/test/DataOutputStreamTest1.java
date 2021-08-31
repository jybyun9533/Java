package stream.data.test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * 간단한 성적들을 파일로 출력하는 코드 작성
 * 만약에 scroe.dat 파일 형식이 지원되지 않아서 출력되는 에러메세지는 무시
 * 바이트 계열 스트림은 출력되는 데이터 형식이 문자기반이 아닌, Binary Data.
 * 따라서 문서편집기로 보아도 알수 없는 형식으로 열림 
 * 그래서 결국 이를 확인하기 위해서는
 * score.dat파일에 출력된 Binary Data를 다시 DataInputStream을 통해서 자바 기본형으로 자동변환 시켜서 읽어들여야한다.
 */

import java.io.IOException;

public class DataOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		int[] scores = { 100, 90, 70, 75, 66 };
		String outFile = "src\\scores.dat";

		DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
		System.out.println("score.dat파일이 생성되었습니다..");

		for (int score : scores) {
			dos.writeInt(score);
		}
	}

}
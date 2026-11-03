package ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	//java는 예외처리를 필수로 하는 상황 2가지
	//1.IO			: 파일 입출력
	//2.Conversion	: 값바꿀때

	public static void main(String[] args) throws IOException {
		String path = "D:\\hyeok\\java\\PrjIO\\src\\ex01\\";
		String filename = "bts.txt";
		FileReader fr = new FileReader(path + filename);
		BufferedReader br = new BufferedReader(fr);
		// 반복 갯수를 모르는 반복 : While() EOF : End of File
		String line = "";
		while((line = br.readLine()) != null) {
		System.out.println(line);
		}
		br.close();
		fr.close();
		System.out.println("End.......");
	}

}

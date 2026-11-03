package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		String [] names = {"RM" , "진" , "슈가" , "제이홉" , "지민" , "뷔" , "정국"};
		//자바에서는 ""안에 \ 하나 넣으면 오류
		//			 ""안에 \ -> \\로 입력
		//""내부 특수기능 \t : tab, \n : 엔터 , \r : 엔터 , \f 프린터 form feed 종이 밀어올리기
		/*
		String path = "c:\test\num01\read01\file";
		System.out.println(path);
		//특수문자가 아니라 경로로 표시하려면 "\" -> "\\"를 사용해야함
		String path2 = "c:\\test\\num01\\read01\\file";
		System.out.println(path2);
		*/
		//아래 두문장은 같은 역할을 함 폴더 주소
		String filename = "D:\\hyeok\\java\\PrjIO\\src\\ex01\\bts.txt";
		//String filename = "D:/hyeok/java/PrjIO/src/ex01";
		//System.out.println(filename);
		//파일 생성  : open -> close 하면 새로운 파일이 생성
		//java는 open 명령을 new 할 때 자동 실행
		FileWriter fw = new FileWriter(filename);
		for (int i = 0; i < names.length; i++) {
			fw.write((i + 1) + ". " + names[i] + "\n");
			
		}
		
		fw.close();
		System.out.println(filename + "이 저장 되었습니다.");
	}

}

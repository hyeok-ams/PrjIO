package ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Student{
	private int 	num;
	private String 	name;
	private int		kor;
	private int		eng;
	private int		mat;
	private int		tot;
	private double	avg;
	
	public Student(String line) {
		String [] li = line.trim().split(",");
		this.num = Integer.parseInt(li[0].trim());
		this.name = li[1].trim();
		this.kor = Integer.parseInt(li[2].trim());
		this.eng = Integer.parseInt(li[3].trim());
		this.mat = Integer.parseInt(li[4].trim());
	}
	//toString
	@Override
	public String toString() {
		this.tot = kor + eng + mat;
		this.avg = this.tot / 3.0;
		String fmt = "%d\t%s\t%d\t%d\t%d\t%d\t%.2f";
		String msg = String.format(fmt, num, name, kor, eng, mat, tot, avg);
		return msg;
	}
	
}

public class TestFileScore {
	public static void main(String[] args) throws IOException {
		//입력 파일
		String			path	=	"D:\\hyeok\\java\\PrjIO\\src\\ex03\\";
		String			infile	=	"score.txt";
		FileReader		fr		=	new FileReader(path + infile);
		BufferedReader	br		=	new BufferedReader(fr);
		//출력 파일
		String			outfile	=	"result.txt";
		FileWriter		fw		=	new FileWriter(path + outfile);
		BufferedWriter	bw		=	new BufferedWriter(fw);
		
		String			line	=	"";
		//제목줄 첫줄을 skip
		br.readLine(); //header 줄 읽기 첫줄 데이터가 아니기때문에 없애기 위해 만듦
		String title = "번호\t이름\t국어\t영어\t수학\t총점\t평균";
		
		System.out.println(title);
		bw.write(title + "\n");
		
		while((line = br.readLine()) != null) {
			Student stud = new Student(line);
			System.out.println(stud);
			bw.write(stud.toString() + "\n");
		}
		
		br.close();
		fr.close();
		bw.close();
		fw.close();
		
		System.out.println("End...........");
	}
}

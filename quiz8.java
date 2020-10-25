package quiz8;

import java.util.*;
import java.io.*;

public class quiz8 {
	public static void main(String[] args) {
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.next();
		FileReader fin = null;
		while(true) {
			System.out.print("검색할 단어나 문장>> ");
			String search = scanner.next();
			if(search.equals("그만"))		break;
			try {
				fin = new FileReader(filename);
				BufferedReader buf = new BufferedReader(fin);
				String line;
				while((line = buf.readLine()) != null) {
					if(line.contains(search))
						System.out.println(line);
				}
				buf.close();
			}
			catch(IOException e) {
				e.printStackTrace();
				System.out.println("입출력 오류");
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}

}

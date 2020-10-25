package quiz8;

import java.util.*;
import java.io.*;

public class quiz8 {
	public static void main(String[] args) {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.next();
		FileReader fin = null;
		while(true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String search = scanner.next();
			if(search.equals("�׸�"))		break;
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
				System.out.println("����� ����");
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}

}

package Vector;
import java.util.*;

class Nation{
	public String country;
	public String capital;
	
	public Nation(String A, String B) {
		this.country = A;
		this.capital = B;
	}
}

public class Game {
	public static void main(String[] args) {
		Vector<Nation> list = new Vector<Nation>();
		Scanner scanner = new Scanner(System.in);
		list.add(new Nation("�ѱ�", "����"));
		list.add(new Nation("�׸���", "���׳�"));
		list.add(new Nation("����", "������"));
		list.add(new Nation("�״�����", "�Ͻ��׸���"));
		list.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		list.add(new Nation("�߱�", "����¡"));
		list.add(new Nation("����", "����"));
		list.add(new Nation("����Ʈ", "ī�̷�"));
		list.add(new Nation("�Ϻ�", "����"));
		System.out.println("**** ���� ���߱� ������ �����մϴ�.(V) ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int menu = scanner.nextInt();
			if(menu == 1) {
				System.out.println("���� "+list.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while(true) {
					System.out.print("����� ���� �Է�"+(list.size()+1)+">> ");
					String cou = scanner.next();
					if(cou.equals("�׸�"))	break;
					String cap = scanner.next();
					for(int i=0;i<list.size();i++) {
						Nation c = list.get(i);
						if(c.country.equals(cou)) {
							System.out.println(cou+"�� �̹� �ֽ��ϴ�!");
							break;
						}
						if(i == (list.size()-1)){
							list.add(new Nation(cou, cap));
							break;
						}
					}
				}
			}
			else if(menu == 2) {
				String answer;
				double random;
				int index;
				Nation corr;
				scanner.nextLine();
				while(true) {
					random = Math.random();
					index = (int)(random*list.size());
					corr = list.get(index);
					System.out.print(corr.country+"�� ������? ");
					answer = scanner.nextLine();
					if(answer.equals("�׸�"))
						break;
					if(corr.capital.equals(answer))
						System.out.println("����!!");
					else
						System.out.println("�ƴմϴ�!!");
				}
			}
			else if(menu == 3) {
				System.out.print("������ �����մϴ�.");
				break;
			}
		}
		scanner.close();
	}

}

import java.util.Scanner;

public class TestRectangle{

	public static void main(String s[]){
		Scanner keyboard=new Scanner(System.in);

		Rectangle rec1=new Rectangle();
		System.out.println("ù��° ���簢���� ���� ");
		rec1.setColor(keyboard.next());

		System.out.println("ù��° ���簢���� ���� ");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� ���� ");
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2=new Rectangle();
		System.out.println("�ι�° ���簢���� ���� ");
		rec2.setColor(keyboard.next());

		System.out.println("�ι�° ���簢���� ���� ");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("�ι�° ���簢���� ���� ");
		rec2.setLength(keyboard.nextInt());

		System.out.println(rec1.getColor()+" ���簢���� ���̴�"+rec1.area()+"�̰� �ѷ��� "+rec1.perimeter()+"�Դϴ�.");
		System.out.println(rec2.getColor()+" ���簢���� ���̴�"+rec2.area()+"�̰� �ѷ��� "+rec2.perimeter()+"�Դϴ�.");

		if(rec1.area()>rec2.area()){
			System.out.println("���̴� "+rec1.getColor()+" ���簢���� �� Ů�ϴ�.");
		}else if(rec1.area()<rec2.area()){
			System.out.println("���̴� "+rec2.getColor()+" ���簢���� �� Ů�ϴ�.");
		}

		if(rec1.perimeter()!=rec2.perimeter()){
			System.out.println("�ѷ��� �ٸ��ϴ�.");
		}else if(rec1.perimeter()==rec2.perimeter()){
			System.out.println("�ѷ��� �����ϴ�.");
		}


	


	}
}
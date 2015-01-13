
public class Test {

	public static void main(String[] args) {
		LinkedList linkList = new LinkedList();
		for (int i=0; i<5; i++)
		{
			linkList.add(i+1);
		}
		System.out.println("Linked list: ");
		System.out.println(linkList.toString());
		linkList.removeAt(2);
		System.out.println(linkList.toString());

	}

}

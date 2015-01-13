
public class LinkedList {
	
	private Node head;
	private int size;
	
	public LinkedList()
	{
		this.head = null;
		this.size = 0;
	}
	
	public void add(int value)
	{
		Node newNode = new Node(value);
		if (head == null)
		{
			head = newNode;
			size++;
		}
		else
		{
			Node current = head;
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = newNode;
			size++;
		}
	}
	
	public String toString()
	{
		String str = "";
		Node current = head;
		while (current != null)
		{
			str +=  current.value + " ";
			current = current.next;
		}
		return str;
	}
	
	public int get(int index)
	{
		if (index<0 || index >= size)
		{
			throw new IndexOutOfBoundsException("Index not valid");
		}
		if (index == 0)
		{
			return head.value;
		}
		int counter = 1;
		Node current = head.next;
		Node previous = head;
		while (counter < index-1)
		{
			current = current.next;
			previous = previous.next;
			counter++;
		}
		return current.value;
	}
	
	public void removeAt(int index)
	{
		if (index<0 || index >= size)
		{
			throw new IndexOutOfBoundsException("Index not valid");
		}
		if (index == 0)
		{
			head = head.next;
			size--;
			return;
		}
		int counter = 1;
		Node current = head.next;
		Node previous = head;
		while (counter < index-1)
		{
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;
		size--;
			
	}
	
	public int[] toArray()
	{
		Node current = head;
		int[] array = new int[size];
		int i=0;
		while (current.next != null)
		{
			array[i] = current.value;
			current = current.next;
			i++;
		}
		return array;
	}
	
	
	public int getSize()
	{
		return size;
	}
	public class Node{
		
		public int value;
		public Node next;
		
		public Node(int value)
		{
			this.value = value;
			this.next = null;
		}
		
		public Node(int value, Node next)
		{
			this.value = value;
			this.next = next;
		}
		
	}

}

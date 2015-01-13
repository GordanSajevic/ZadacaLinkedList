
public class LinkedList {
	
	private Node head;
	private int size;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public LinkedList()
	{
		this.head = null;
		this.size = 0;
	}
	
	/**
	 * Metoda koja dodaje element listi
	 * @param value
	 */
	
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
	
	/**
	 * Metoda koja vraæa string sa svim elementima liste
	 */
	
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
	
	/**
	 * Metoda koja ispisuje jedan element edreðen indeksom
	 * @param index
	 * @return value
	 */
	
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
	
	/**
	 * Metoda koja uklanja iz liste jedan element odreðen indeksom
	 * @param index
	 */
	
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
	
	/**
	 * Metoda koja vraæa niz sa svim elementima liste
	 * @return array
	 */
	
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
	
	/**
	 * Metoda koja vraæa dužinu liste
	 * @return
	 */
	
	public int getSize()
	{
		return size;
	}
	
	/**
	 * Node klasa
	 * @author Gogo
	 *
	 */
	
	public class Node{
		
		public int value;
		public Node next;
		
		/**
		 * Konstruktor sa jednim parametrom
		 * @param value
		 */
		
		public Node(int value)
		{
			this.value = value;
			this.next = null;
		}
		
		/**
		 * Konstruktor sa dva parametra
		 * @param value
		 * @param next
		 */
		
		public Node(int value, Node next)
		{
			this.value = value;
			this.next = next;
		}
		
	}

}

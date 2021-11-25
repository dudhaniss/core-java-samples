
public class DLinkList {

	Node head;
	Node tail;

	public DLinkList() {
		head = null;
		tail = null;
	}

	public void insert(int value)  // O(1)
	{
		Node tmp = new Node(value);

		if(head == null)
		{
			head = tmp;
			tail = tmp;
		}
		else
		{
			//We have 1 or more than 1 node in DLL
			tmp.setNext(head);
			head.setPrev(tmp);
			head = tmp;
		}		
	}

	public void insertByPos(int value, int pos) 
	{

	}

	public void append(int value)  // O(1)
	{
		Node tmp = new Node(value);

		if(tail == null)
		{
			tail = tmp;
			head = tmp;			
		}
		else
		{
			//We have 1 or more than 1 node in DLL
			tail.setNext(tmp);
			tmp.setPrev(tail);
			tail = tmp;			
		}		
	}

	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("DLL is empty!");
		}
		else
		{
			if(head == tail)
			{
				Node tmp = head;
				head = null;
				tail = null;
			}
			else
			{
				Node tmp = head;
				head = head.getNext();
				head.setPrev(null);
				tmp.setNext(null);
			}
		}
	}

	public void deleteLast()
	{
		if(tail == null)
		{
			System.out.println("DLL is empty!");
		}
		else
		{
			if(head == tail)
			{
				Node tmp = head;
				head = null;
				tail = null;
			}
			else
			{
				Node tmp = tail;
				tail = tail.getPrev();
				tail.setNext(null);
				tmp.setPrev(null);
			}
		}
	}

	public void deleteByPos(int pos)
	{
		int nodeCount = getNodeCount();

		if(pos == 1)
		{
			deleteFirst();
		}
		else if(pos == nodeCount)
		{
			deleteLast();
		}
		else if(pos > 1 && pos < nodeCount)
		{
			int x = 1;
			Node it = head;

			while( x != pos)
			{
				it = it.getNext();
				x++;
			}

			Node itn = it.getNext();
			Node itp = it.getPrev();

			itp.setNext(itn);
			itn.setPrev(itp);
			it.setNext(null);
			it.setPrev(null);

			//
			/*it.getPrev().setNext(  it.getNext() );
			it.getNext().setPrev(  it.getPrev() );
			it.setNext(null);
			it.setPrev(null);*/
		}
		else
		{
			System.out.println("Invalid pos!");
		}
	}

	private int getNodeCount() {

		int nodeCount = 0;
		Node it = head;

		while(it != null)
		{
			nodeCount++;
			it = it.getNext();
		}

		return nodeCount;
	}

	public void reverse()
	{
		Node it = head;

		while(it != null)
		{
			//Swap(it.getNext(), it.getPrev())
			Node tmp = it.getNext();
			it.setNext(it.getPrev());
			it.setPrev(tmp);

			//most imp line of this function..
			it = it.getPrev();
		}
		//Swap(head, tail)
		Node tmp = head;
		head = tail;
		tail = tmp;		
	}

	public void empty()
	{
		
		setNextPrevNull(head);
		head = tail = null;
		
		/*Node it = head;
		
		while(it != null)
		{
			Node itn = it.getNext();
			
			it.setNext(null);
			it.setPrev(null);
			
			it = itn;			
		}
		
		head = tail = null;*/
	}
	
	private void setNextPrevNull(Node it) 
	{
		
		
		System.out.println("hi...");
		
		
		if(it.getNext() != null)
			setNextPrevNull(it.getNext());
		
		it.setNext(null);
		it.setPrev(null);
	}

	public String toString() {
		String str = "";

		if(head == null)
		{
			str = "LL is empty!";
		}
		else
		{
			Node it = head;

			//System.out.println("LL::toString START");
			while(it != null)
			{
				//str += "" + it.getData() 
				str += "" + it + "-->";
				it = it.getNext();
			}
		}
		//System.out.println("LL::toString END");
		return str;
	}

}

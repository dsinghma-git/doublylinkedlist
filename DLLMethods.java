public class DLLMethods {
	
	public DLLNode first;
	public DLLNode last;
	public DLLMethods()
	{
		first = null;
		last = null;
	}
	public void insertBeg(int item)
	{
		DLLNode newnode = new DLLNode();
		newnode.info = item;
		if(first == null)
		{
			first = newnode;
			last = newnode;
		}
		else
		{
			newnode.next = first;
			first.prev = newnode;
			first = newnode;
		}
	} // end of the insertBeg method
	
	public void insertEnd(int item)
	{
		DLLNode newnode = new DLLNode();
		newnode.info = item;
		
		if(first == null)
		{
			newnode.next = null;
			first = newnode;
			last = newnode;
		}
		else
		{
			newnode.prev = last;
			last.next = newnode;
			last = newnode;
		}
	} // end of the insertEnd method
	
	
	public void deleteFirst()
	{
		if(first == null)
		{
			System.out.println("List is empty.");
		}
		else if(first == last)
		{
			first = null;
			last = null;
		}
		else
		{
			first = first.next;
			first.prev = null;
		}
	}// End of deleteFirst 
	
	public void deleteLast()
	{
		if(first == null)
		{
			System.out.println("List is empty.");
		}
		else if(first == last)
		{
			first = null;
			last = null;
		}
		else
		{
			last = last.prev;
			last.next = null;
		}
	}// End of deleteLast
	
	public void display()
	{
		if(first ==null)
			System.out.println("List is empty.");
		else
		{
			System.out.println("List elements are: \n");
			DLLNode temp = first;
			while(temp!=null)
			{
				System.out.print("\t" + temp.info);
				 temp = temp.next;
			}
		}
	}// end of display
}// end of class

package practice;

public class LinkedListImplementation {
	
	static int length;
	static LinkedList head;
	public static void main(String[] args) 
	{
		
		
			insertAt(0,0);
			insertAt(1,1); 
			insertAt(2,0); 
			insertAt(3,3); 
			insertAt(4,4); 
			insertAt(5,5); 
//	        LinkedList beginode=new LinkedList();
//	        beginode.setData(4);
//	        insertAtBegining(beginode);
//	        
//	        LinkedList endnode=new LinkedList();
//	        endnode.setData(5);
//	        insertAtEnd(endnode); 
//	        
	        //calling methods here
	        insertAt(6,4); 
			removeBegin();
			removeEnd();
			deleteAtIndex(2);
			System.out.println("Index :"+getindex(7));
			System.out.println(size());
			LinkedList currentnode=head;
	        while(currentnode!=null)
	        {
	        	System.out.println(currentnode.getData());
	        	currentnode=currentnode.getNext();
	        }
	}

	public static void insertAtBegining(LinkedList temp) 
	{
		temp.setNext(head);
		head=temp;
		length++;
	}
	public static void insertAtEnd(LinkedList node) 
	{
		if(head==null) 
		{
			head=node;
		}
		else 
		{
			LinkedList p=head;
			while(p.getNext()!=null) 
			{
				p=p.getNext();
			}
			p.setNext(node);
		}
		length++;
	}
	
	public static void insertAt(int data,int position) 
	{
		
		LinkedList temp=new LinkedList();
		temp.setData(data);
		
		if(position<0) 
		{
			position=0;
		}
		
		if(position>length) 
		{
			position=length;
		}
		
		if(position==0) 
		{
			insertAtBegining(temp);
		}
		else
		{
			LinkedList current=head;
			for(int i=0;i<position-1;i++) 
			{
				current=current.getNext();
			}
			temp.setNext(current.getNext());
			current.setNext(temp);
			length++;
		}
		
	}
	public static LinkedList removeBegin() 
	{
		LinkedList node=head;
		if(head==null) 
		{
			return null;
		}
		else 
		{
			head=node.getNext();
			node.setNext(null);
		}
		length--;
		return node;
	}
	public static LinkedList removeEnd() 
	{
		LinkedList node=head;
		LinkedList node2=null;
		
		if(head==null) 
		{
			return null;
		}
		if(node.getNext()==null) 
		{
			return node;
		}
		while(node.getNext()!=null)
		{
			node2=node;
			node=node.getNext();
		}
		node2.setNext(null);
		length--;
		return node;
	}
	
		public static void deleteAtIndex(int index) 
		{
			if(head==null) 
			{
				return;
			}
			if(index<0) 
			{
				index=0;
			}
			if(index==0) 
			{
				removeBegin();
				return;
			}
			if(index>=length) 
			{
				removeEnd();
				return;
			}
			
			LinkedList node=head;
			LinkedList node2=null;
			if(node.getNext()==null) 
			{
				return;
			}
			else 
			{
				for(int i=0;i<index-1;i++) 
				{
					node2=node;
					node=node.getNext();
				}
				node2.setNext(node.getNext());
				length--;
			}

		}
		public static int size() 
		{
			return length;
		}
		public static int getindex(int data) 
		{
			LinkedList node=head;
			int count=0;
			while(node.getNext()!=null) 
			{
				
				if(node.getData()==data) 
				{
					return count;
				}
				else 
				{
					count++;
				}
				node=node.getNext();
			}
			return -1;
		}
}

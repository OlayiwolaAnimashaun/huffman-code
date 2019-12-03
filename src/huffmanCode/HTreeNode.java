package huffmanCode;

public class HTreeNode extends BinaryTreeBasis {
	
	protected Object item;
	protected HTreeNode leftChild;
	protected HTreeNode rightChild;
	
	public HTreeNode(Object newItem) {
		
		item = newItem;
		leftChild = null;
		rightChild = null;
		
	}
	
	public HTreeNode(Object newItem, HTreeNode left, HTreeNode right)
	{
		super(left.frequency + right.frequency);
		
		item = newItem;
		leftChild = left;
		rightChild = right;
	}
	
	public Object getItem() 
	{
		return item;
	}
	
	public void setItem(Object newItem)
	{
		item = newItem;
	}

	public HTreeNode getLeft() 
	{
		return leftChild;
	}
	
	public void setLeft(HTreeNode left)
	  {
	  // Sets the left child reference to left.
	    leftChild  = left;
	  }  // end setLeft

	
	public HTreeNode getRight()
	  {
	  
	    return rightChild;
	  }  
	
	public void setRight(HTreeNode right)
	  {
	 
	    rightChild  = right;
	  }  
	}  


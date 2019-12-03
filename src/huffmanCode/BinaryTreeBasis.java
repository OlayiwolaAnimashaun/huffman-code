package huffmanCode;

public abstract class BinaryTreeBasis
{
  protected HTreeNode root;
  protected int frequency;

  public BinaryTreeBasis()
  {
    root = null;
  }  // end default constructor

  public BinaryTreeBasis(Object rootItem)
  {
    root = new HTreeNode(rootItem, null, null);
  }  // end constructor
  
  public BinaryTreeBasis(int freq)
  {
	 frequency = freq;  
  }// end constructor

  public boolean isEmpty()
  {
// Returns true if the tree is empty, else returns false.
    return root == null;
  }  // end isEmpty

  public void makeEmpty()
  {
// Removes all nodes from the tree.
    root = null;
  }  // end makeEmpty

  public Object getRootItem() throws TreeException
  {
// Returns the item in the tree’s root.
    if (root == null)
    {
      throw new TreeException("TreeException: Empty tree");
    }
    else
    {
      return root.getItem();
    }  // end if
  }  // end getRootItem
  
  //Compares frequency
  public int compareFreq(BinaryTreeBasis btree) 
  {
	  return frequency - btree.frequency;
  }

}  // end BinaryTreeBasis

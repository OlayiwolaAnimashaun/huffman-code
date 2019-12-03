package huffmanCode;

public class HLeaf extends BinaryTreeBasis {
	
	public char letter;

	public HLeaf(int freq, char ltr)
	{
		super(freq);
		
		letter = ltr;

	}

}

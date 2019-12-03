package huffmanCode;

import java.util.*;



public class HuffmanTreeTest {
	
	public static void HTree(HTreeNode node, String x) 
	{
		if(node.leftChild == null && node.rightChild == null && Character.isLetter(node.c)) 
		{
			System.out.print(node.c + ":" + a);
			
			return;
		}
		HTree(node.leftChild, a + "0");
		HTree(node.rightChild, a + "1");
	}

	/*public static BinaryTreeBasis hTree(int[] ltrFreq) 
	{
		//This function will be used to build the Huffman tree
		
		PriorityQueue<BinaryTreeBasis> leaves = new PriorityQueue<BinaryTreeBasis>();
		
		for(int i = 0; i < ltrFreq.length; i++) 
		{
			//for loop to run through non-empty characters
			
			if(ltrFreq[i] > 0) 
			{
				leaves.offer(new HLeaf(ltrFreq[i], (char)i));
				
			}
			
			//while loop that loops until there is one leaf left
			while(leaves.size() > 1) 
			{
				
				//Leaves with least frequency
				BinaryTreeBasis a = leaves.poll();
				BinaryTreeBasis z = leaves.poll();
				BinaryTreeBasis j = leaves.poll();
				
				//put leaves into new node and re-insert into queue
				leaves.offer(new HTreeNode(a));
			}
			
		}
		return leaves.poll();	
	}*/
	
	public static void printHTree(BinaryTreeBasis htree, StringBuffer prefix) 
	{
		assert htree != null;
		
		if(htree instanceof HLeaf)
		{
			HLeaf leaf = (HLeaf)htree;
			
			//each character, its frequency and code is printed
			System.out.println(leaf.letter + "\t" + leaf.frequency + "\t" + prefix);
		
		}else if(htree instanceof HTreeNode) 
		{
			HTreeNode node = (HTreeNode)htree;
			
			//left traversal
			prefix.append('0');
			printHTree(node.leftChild, prefix);
			prefix.deleteCharAt(prefix.length()-1);
			
			//right traversal
			prefix.append('1');
			printHTree(node.rightChild, prefix);
			prefix.deleteCharAt(prefix.length()-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int alph = 26;
		
		char[] character = {'Z', 'J', 'Q', 'X', 'K', 'V', 'B', 'P', 'G', 'W', 'Y', 'F','M', 'C', 'U', 'L', 'D', 'H', 'R', 'S', 'N', 'I', 'O', 'A', 'T', 'E'};
		int[] characterFreq = {128, 188, 205, 315, 1257, 2019, 2715, 3316, 3693, 3819, 3853, 4200, 4761, 4943, 5246, 7253, 7874, 10795, 10977, 11450, 12666, 13318, 14003, 14810, 16587, 21912};
		String test = "a fast runner need never be afraind of the dark";
		
		//int[] ltrFreq = new int[256];
		
		PriorityQueue<BinaryTreeBasis> leaves = new PriorityQueue<BinaryTreeBasis>(alph, new MyComparator());
		
		for(int i = 0; i < alph; i++) 
		{
			HTreeNode huffman = new HTreeNode();
			
			huffman.c = character[i];
			huffman.data = characterFreq[i];
			
			huffman.leftChild = null;
			huffman.rightChild = null;
			
			leaves.add(huffman);
		}
		
		HTreeNode root = null;
		
		//while loop that loops until there is one leaf left
		while(leaves.size() > 1) 
		{
			HTreeNode a = leaves.peek();
			leaves.poll();
			
			HTreeNode b = leaves.peek();
			leaves.poll();
			
			HTreeNode freq = new HTreeNode();
			freq.data = x.data + y.data;
			freq.c = '-';
			freq.leftChild = a;
			freq.rightChild = b;
			root = freq;
			leaves.add(freq);
			
		}
		
		HTree(root, "");
		//Each character read and the frequencies are recorded
		/*for(char c : test.toCharArray()) 
		{
			ltrFreq[c]++;
			
			BinaryTreeBasis bTree = hTree(ltrFreq);
			
			System.out.println("CHAR\tFREQUENCY\tCODE");
			
			printHTree(bTree, new StringBuffer());
		}*/
	}

}

import java.util.*;
public class StringTreeAVL<Key extends Comparable<? super Key>, Value> {
	
	
	public class Node
	{
		public String value;
		public Key key;
		public Node left;
		public Node right;
		public Node parent;
		public int Treeheight;

		
		public Node(Key key, String value)
			{
				this.value = value;
				this.key = key;
				this.Treeheight = 1;
			}
		
		public void TreeHeight()
		{
			Treeheight = 1;
			if (left != null)
			{
				Treeheight =  Treeheight + left.Treeheight;
			}
			else if (right != null)
			{
				Treeheight = Treeheight + right.Treeheight;
			}
		}
		private int balanceFacter()
		{
			int balanced = 0;
			if (left != null)
			{
				balanced = balanced + left.Treeheight;
			}
			else if (right != null)
			{
				balanced = balanced - right.Treeheight;
			}
			
			return balanced;
		}		
		public Node rightNodeRotation()
		{
			Node adjust = this.left;
			this.left = adjust.right;
			this.TreeHeight();
			
			adjust.right = this;
			adjust.TreeHeight();
			
			adjust.parent = this.parent;
			return adjust;
			
		}
		public Node leftNodeRotation ()
		{
			Node adjust = this.right;
			this.right = adjust.left;
			this.TreeHeight();
			
			adjust.left = this;
			adjust.TreeHeight();
			
			adjust.parent = this.left;
			return adjust;
		}
		private Node balancing()
		{
			TreeHeight();
			int balancing = balanceFacter();
			
			if (balancing > 1)
			{
				if (left.balanceFacter() < 0)
				{
					left = left.leftNodeRotation();
				}
				return rightNodeRotation();
			}
			else if (balancing < -1)
				{
					if (right.balanceFacter() > 0)
					{
						right = right.rightNodeRotation();
					}
					return leftNodeRotation();
				}
			return this;
		}
	
	}
	public Node root;
	private Node nodeInsertion(Node where, Node node)
	{
		if (where == null)
			{
			return node;
			}
		int compare = where.key.compareTo(node.key);
		if (compare == 0)
		{
			where.value = node.value;
		}
		else if (compare < 0)
		{
			where.left = nodeInsertion(where.left, node);
		}
		else 
		{
			where.right = nodeInsertion(where.right, node);
		}
		
		return where.balancing();
	}
	
	private Node nodeDeletion(Node node, Key key)
	{	
		if (node == null)
		{
			throw new IllegalArgumentException();
		}
		int compare = node.key.compareTo(key);
				
		if (compare == 0)
		{
			if (node.left == null && node.right == null)
			{
				return null;
			}
			else if (node.left == null)
			{
				return node.right;
			}
			else if (node.right == null)
			{
				return node.left;
			}
			else {
				 Node left = node.right;
				 while (left.left != null)
				 {
					 left = left.left;
				 }
				 left.right = deleteLeft(node.right);
				 left.left = node.left;
				}
		}
		else if (compare < 0)
		{
			node.left = nodeDeletion(node.left, key);
			
		}
		else 
			{
				node.right = nodeDeletion(node.right, key);
			}
		return node.balancing();
	}
	
	private Node deleteLeft(Node node)
	{
		if (node.left == null)
			{
			return node.right;
			}
		else
		{
			node.left = deleteLeft(node.left);
			return node.balancing();
		}
	}	
	public void nodeInsertion(Key key, String value)
	{
		root = nodeInsertion(root, new Node(key, value));
	}
	public void nodeDeletion(Key key)
	{
		root = nodeDeletion(root, key);
	}
	
	public void printingTree(Node node, int level)
		{		
		if (node == null)
			{
				return; 
			}
		
			
		printingTree(node.left, level + 1);
		System.out.println(node.key + " " + node.value);
		printingTree(node.right, level +1);
	}
	
	}

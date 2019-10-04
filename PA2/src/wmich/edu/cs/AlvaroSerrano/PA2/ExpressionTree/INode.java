package wmich.edu.cs.AlvaroSerrano.PA2.ExpressionTree;

public interface INode {
	
	//Getter
	public Object getContent();
	
	//Setter
	//Store operators as char
	//Store operands as integer
	public void setContent (Object o);
	
	public INode getLeft();
	
	public void setLeft(INode left);
	
	public INode getRight();

	public void setRight(INode right);
	
	
}

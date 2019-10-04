package wmich.edu.cs.AlvaroSerrano.PA2.ExpressionTree;

public class Node implements INode {

	private Object content;
	private INode left;
	private INode right;
	
	//Constructor
	public Node (Object content, INode left, INode right) {
		this.content = content;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public Object getContent() {
		return this.content;
	}

	@Override
	public void setContent(Object content) {
		this.content = content;
	}

	@Override
	public INode getLeft() {
		return this.left;
	}

	@Override
	public void setLeft(INode left) {
		this.left= left;
	}

	@Override
	public INode getRight() {
		return this.right;
	}

	@Override
	public void setRight(INode right) {
		this.right = right;
	}

}

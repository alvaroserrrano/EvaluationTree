package wmich.edu.cs.AlvaroSerrano.PA2.ExpressionTree;

public interface ITree {

	public void setRoot(INode root);
	
	public INode getRoot();
	
	//print an expression in prefix order
	public void prefixVisit();
	
	//print an expression in postfix order
	public void postfixVisit();
	
	//print an expression in infix order
	public void infixVisit();
	
	//Evaluate expression and return a value
	public double evaluate();

}

package wmich.edu.cs.AlvaroSerrano.PA2.ExpressionTree;

public class Tree implements ITree {

	private INode root;
	
	//Constructor
	public Tree (INode root) {
		this.root = root;
	}
	
	public Tree() {
		this.root = null;
	}

	@Override
	public void setRoot(INode root) {
		this.root = root;
	}

	@Override
	public INode getRoot() {
		return this.root;
	}
	
	//Since postfix and prefix notations are in a machine-readable format,
	//they already consider the order of execution
	//and only evaluate the expression from left to right
	//in the sequence in which operands and operators are encountered
	
	
	//Prefix and Postfix notation are conversions of the original standard operation
	//and the brackets have already been taken into consideration
	
	public void prefixVisit(INode node) {
		if(node == null) return;

		if(node.getContent().equals('+') ||
		   node.getContent().equals('-') || 
		   node.getContent().equals('*') || 
		   node.getContent().equals('/')) {
			System.out.print("(");
		}
		
		//Print data of the node
		System.out.print(" " + node.getContent() + " ");
		
		//Recursive call on left subtree
		prefixVisit(node.getLeft());
		
		//Recursive call on right subtree
		prefixVisit(node.getRight());	
		
		if(node.getContent().equals('+') || 
		   node.getContent().equals('-') || 
		   node.getContent().equals('*') || 
		   node.getContent().equals('/')) {
			System.out.print(")");
		}
	}
	
	public void infixVisit (INode node) {
		
		
		if(node == null) return;
		
		if(node.getContent().equals('+') ||
		   node.getContent().equals('-') || 
		   node.getContent().equals('*') || 
		   node.getContent().equals('/')) {
			System.out.print("(");
		}
		
		//System.out.print(" (");
		
		//Recursive call on left subtree
		infixVisit(node.getLeft());
		
		//Print data of the node
		System.out.print(" " + node.getContent() + " ");
		
		//Recursive call on right subtree
		infixVisit(node.getRight());
		
		//System.out.print(")");
		if(node.getContent().equals('+') || 
		   node.getContent().equals('-') || 
		   node.getContent().equals('*') || 
		   node.getContent().equals('/')) {
			System.out.print(")");
		}
		
	}
	
	public void postfixVisit (INode node) {
		
		if(node == null) return;
		
		if(node.getContent().equals('+') || node.getContent().equals('-') || node.getContent().equals('*') || node.getContent().equals('/')) {
			System.out.print("(");
		}
		
		//Recursive call on left subtree
		postfixVisit(node.getLeft());
		
		//Recursive call on left subtree
		postfixVisit(node.getRight());
		
		//Print data of the node
		System.out.print(" "+ node.getContent() + " ");
		
		if(node.getContent().equals('+') || 
				   node.getContent().equals('-') || 
				   node.getContent().equals('*') || 
				   node.getContent().equals('/')) {
					System.out.print(")");
				}
	}
	
	public double evaluate(INode node) {
		
		if(node == null) return 0;
		
		if(node.getLeft() == null && node.getRight() == null)
			return (int)node.getContent();
		
		//Evaluate left subtree
		double leftValue = evaluate(node.getLeft());
		
		//Evaluate right subtree
		double rightValue = evaluate(node.getRight());
		
		if(node.getContent().equals('+'))
			return leftValue + rightValue;
		
		if(node.getContent().equals('-'))
			return leftValue - rightValue;
		
		if(node.getContent().equals('*'))
			return leftValue * rightValue;
		
		if(node.getContent().equals('/')) {
			if (rightValue == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return leftValue / rightValue;
		}
					
		return (double) node.getContent();
	}

	@Override
	public void prefixVisit() {
		prefixVisit(root);
	}

	@Override
	public void postfixVisit() {
		postfixVisit(root);
	}

	@Override
	public void infixVisit() {
		infixVisit(root);
	}

	@Override
	public double evaluate() {
		
		if(this.root == null) return 0;
		
		if(root.getLeft() == null && root.getRight() == null)
			return 0;
		
		//Evaluate left subtree
		double leftValue = evaluate(root.getLeft());
		
		//Evaluate right subtree
		double rightValue = evaluate(root.getRight());
		
		if(this.root.getContent().equals('+'))
			return leftValue + rightValue;
		
		if(this.root.getContent().equals('-'))
			return leftValue - rightValue;
		
		if(this.root.getContent().equals('*'))
			return leftValue * rightValue;
		
		if(this.root.getContent().equals('/')) {
			if (rightValue == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return leftValue / rightValue;
		}	
					
		return (double) this.root.getContent();
		
	}

}

package wmich.edu.cs.AlvaroSerrano.PA2.ExpressionTree;

import java.io.IOException;

public class Main {
	
	//FEATURES:
	//1. Hard-code expressions
	//2. Print the expression tree in preorder, postorder, and infix notation
	//3. Evaluate the expression tree and return result of the expression

	public static void main(String[] args) throws IOException{
		
		//BUILD A TREE FOR THE FOLLOWING EXPRESSIONS
		// 1. ==> 5 + 3 - 4; 
		// 2. ==> 5 * 4 + 3; 
		// 3. ==>  5 + 4 * 3; 
		// 4. ==> 5 * 6 / 10; 
		// 5. ==> 3 * 2 – 4 * 5 / 3 ;
		// 6. ==> 10 + 30 / 5 * 6 – 19 * 2 / 4;
		
		
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		
		//EXPRESSION 1
		// 1. ==> 5 + 3 - 4;	
		//((5+3)-4)
		
		printExpressionPresentation("1. ==> 5 + 3 - 4;", "1");
		
		//HardCode expression1
		INode root1 = new Node ('+', new Node( 5, null, null), new Node('-', new Node(3, null, null), new Node(4, null, null)));
//		root1.setLeft(new Node( 5, null, null));
//		root1.setRight(new Node('-', new Node(3, null, null), new Node(4, null, null)));
		ITree t1 = new Tree(root1);
		
		//Print expression t1
		postOrderPresentation();
		t1.postfixVisit();
		System.out.println();
		System.out.println();
		preOrderPresentation();
		t1.prefixVisit();
		System.out.println();
		System.out.println();
		inOrderPresentation();
		t1.infixVisit();
		System.out.println();
		System.out.println();
		
		//Evaluate expression t1
		printResult();
		System.out.println(t1.evaluate());
		
		System.out.println();
		System.out.println("========================================================");
		
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		
		//EXPRESSION2
		// 2. ==> 5 * 4 + 3;
		//((5*4)+3)
		
		printExpressionPresentation("2. ==> 5 * 4 + 3;", "2");
		
		//HardCode expression2
		INode root2 = new Node ('+', new Node('*', new Node(5, null, null), new Node(4, null, null)), new Node(3, null, null));
//		root2.setLeft(new Node('*', new Node(5, null, null), new Node(4, null, null)));
//		root2.setRight(new Node(3, null, null));
		ITree t2 = new Tree(root2);
		
		//Print expression t2
		postOrderPresentation();
		t2.postfixVisit();
		System.out.println();
		System.out.println();
		preOrderPresentation();
		t2.prefixVisit();
		System.out.println();
		System.out.println();
		inOrderPresentation();
		t2.infixVisit();
		System.out.println();
		System.out.println();
		
		//Evaluate expression t2
		printResult();
		System.out.println(t2.evaluate());
		
		System.out.println();
		System.out.println("========================================================");
		
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		
		//EXPRESSION3
		//// 3. ==>  5 + 4 * 3; 
		//(5+(4*3))
		
		printExpressionPresentation("3. ==> 5 + 4 * 3;", "3");
		
		//HardCode expression 3
		INode root3 = new Node('+', new Node(5, null, null), new Node('*', new Node(4, null, null), new Node(3, null, null)));
//		INode leftNode1 = new Node(5, null, null);
//		root3.setLeft(leftNode1);
//		INode rightNode1 = new Node('*', new Node(4, null, null), new Node(3, null, null));
//		root3.setRight(rightNode1);
		
		ITree t3 = new Tree(root3);
		
		//Print expression t3
		postOrderPresentation();
		t3.postfixVisit();
		System.out.println();
		System.out.println();
		preOrderPresentation();
		t3.prefixVisit();
		System.out.println();
		System.out.println();
		inOrderPresentation();
		t3.infixVisit();
		System.out.println();
		System.out.println();
		
		//Evaluate expression t3
		printResult();
		System.out.println(t3.evaluate());
		
		System.out.println();
		System.out.println("========================================================");
		
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		
		//EXPRESSION4
		// 4. ==> 5 * 6 / 10;
		//((5*6)/10)
		
		printExpressionPresentation("4. ==> 5 * 6 / 10;", "4");
		
		//HardCode expression4
		INode root4 = new Node('/', new Node('*', new Node(5, null, null), new Node(6, null, null)), new Node(10, null, null));
		
		ITree t4 = new Tree(root4);
		
		//Print expression t4
		postOrderPresentation();
		t4.postfixVisit();
		System.out.println();
		System.out.println();
		preOrderPresentation();
		t4.prefixVisit();
		System.out.println();
		System.out.println();
		inOrderPresentation();
		t4.infixVisit();
		System.out.println();
		System.out.println();
		
		//Evaluate expression t4
		printResult();
		System.out.println(t4.evaluate());
		
		System.out.println();
		System.out.println("========================================================");
		
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		
		//EXPRESSION5
		// 5. ==> 3 * 2 – 4 * 5 / 3 ;
		//((3*2)-((4*5)/3))
		
		printExpressionPresentation("2. ==> 3 * 2 - 4 * 5 / 3;", "5");
		
		INode root5 = new Node('-', 
				new Node('*',  new Node(3, null, null), new Node(2, null, null)), 
				new Node('*', new Node(4, null, null), 
				new Node('/', new Node(5, null, null), new Node(3, null, null))));
		
		ITree t5 = new Tree(root5);
		
		//Print expression t5
		postOrderPresentation();
		t5.postfixVisit();
		System.out.println();
		System.out.println();
		preOrderPresentation();
		t5.prefixVisit();
		System.out.println();
		System.out.println();
		inOrderPresentation();
		t5.infixVisit();
		System.out.println();
		System.out.println();
		
		
		//Evaluate expression t5
		printResult();
		System.out.println(t5.evaluate());
		
		System.out.println();
		System.out.println("========================================================");
		
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------
		
		//EXPRESSION 6
		// 6. ==> 10 + 30 / 5 * 6 – 19 * 2 / 4;
		//10+((30/5)*6)-((19*2)/4))
		
		printExpressionPresentation("6. ==> 10 + 30 / 5 * 6 - 19  * 2 / 4;", "6");
		
		INode leftNodeC = new Node(2, null, null);
		INode rightNodeC = new Node(4, null, null);
		INode leftNodeB = new Node(19, null, null);
		INode rightNodeB = new Node('/', leftNodeC, rightNodeC);
		INode leftNode4 = new Node(30, null, null);
		INode rightNode4 = new Node(5, null, null);
//		INode leftNode4 = new Node(5, null, null);
//		INode rightNode4 = new Node(6, null, null);
		//INode leftNode3 = new Node(30, null, null);
		INode leftNode3 = new Node('/',leftNode4, rightNode4);
		//INode rightNode3 = new Node('*', leftNode4, rightNode4);
		INode rightNode3 = new Node(6, null, null);
		INode leftNode2 = new Node(10, null, null);
		//INode rightNode2 = new Node('/', leftNode3, rightNode3);
		INode rightNode2 = new Node('*', leftNode3, rightNode3);
		INode leftNode1 = new Node('+', leftNode2, rightNode2);
		INode rightNodeA = new Node('*', leftNodeB, rightNodeB);
		INode root6 = new Node('-', leftNode1, rightNodeA);
		
		ITree t6 = new Tree(root6);
		
		
		//Print expression t6
		postOrderPresentation();
		t6.postfixVisit();
		System.out.println();
		System.out.println();
		preOrderPresentation();
		t6.prefixVisit();
		System.out.println();
		System.out.println();
		inOrderPresentation();
		t6.infixVisit();
		System.out.println();
		System.out.println();
		
		//Evaluate expression t6
		printResult();
		System.out.println(t6.evaluate());
		
		System.out.println();
		System.out.println("========================================================");
				
		
	}

	public static void printExpressionPresentation (String expr, String expressionNumber) {
		System.out.printf("Printing output for expression %s\n\n", expressionNumber);
		System.out.printf("Here is the expression: %s\n\n", expr);
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
	}
	
	public static void postOrderPresentation() {
		System.out.println("-----------------------");
		System.out.println("Postorder expression||");
		System.out.println("-----------------------");
	}
	
	public static void preOrderPresentation() {
		System.out.println("---------------------");
		System.out.println("Preorder expression||");
		System.out.println("---------------------");
	}
	
	public static void inOrderPresentation() {
		System.out.println("------------------");
		System.out.println("Infix expression||");
		System.out.println("------------------");
	}
	
	public static void printResult() {
		System.out.println("----------------------");
		System.out.print("Evaluation: ");
	}
}

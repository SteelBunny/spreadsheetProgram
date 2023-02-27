package model;

public class ExpressionTreeNode {
	public ExpressionTreeNode left;
	
	public ExpressionTreeNode right;
	
	private Token myToken;
	
	public Token getToken() {
		return myToken;
	}
	
	public void setToken(final Token theToken) {
		myToken = theToken;
	}
}

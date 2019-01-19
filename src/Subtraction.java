
public class Subtraction implements Expression {

	private Expression right;
	private Expression left;
	
	public Subtraction(Expression right, Expression left) {
		this.right = right;
		this.left = left;
	}

	public int evaluate() {
		return right.evaluate() - left.evaluate();
	}

}

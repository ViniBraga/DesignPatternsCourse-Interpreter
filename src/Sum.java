
public class Sum implements Expression {

	private Expression right;
	private Expression left;
	
	public Sum(Expression right, Expression left) {
		super();
		this.right = right;
		this.left = left;
	}

	public int evaluate() {
		return right.evaluate() + left.evaluate();
	}
	
}

public class LambdaBasicExample {
	public static void main(String[] args) {
		MathOperations operations = (a, b) -> a + b;
		int result = operations.add(10, 10);
		System.out.println(result);
	}

}

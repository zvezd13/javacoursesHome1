public class CalculateHome{
	public static void main(String[] args){
		System.out.println("CalculateHome");
		int first = Integer.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		double pl = first + second;
		double mn = first - second;
		double mul = first * second;
		double div = first / second;
		//System.out.println("sum: " + sum);
		System.out.println("plus: " + pl);
		System.out.println("minus: " + mn);
		System.out.println("multiply: " + mul);
		System.out.println("divided: " + div);
	}
}
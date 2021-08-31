
public class Exp2{
	public static void main(String[] args) {
		int x,y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		if (args[2].equals("+"))
			System.out.println("O/P is : "+(x+y));
		if (args[2].equals("-"))
			System.out.println("O/P is : "+(x-y));
		if (args[2].equals("*"))
			System.out.println("O/P is : "+(x*y));
		if (args[2].equals("/"))
			System.out.println("O/P is : "+(x/y));
		
	}
			

}

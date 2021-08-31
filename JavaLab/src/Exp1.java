
 public class Exp1 {

	public static void main(String[] args) {
		int x,y,z;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		z = Integer.parseInt(args[2]);
		if(x>y && x>z)
		{
			System.out.print("Largest number is :"+x);
		}
		else if(y>x && y>z)
		{
			System.out.print("Largest number is :"+y);
		}
		else if(z>x && z>y)
		{
			System.out.print("Largest number is :"+z);
		}

	}

}
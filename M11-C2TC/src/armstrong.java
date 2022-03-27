
public class armstrong {

	public static void main(String[] arg)
			{
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			int temp=number;
			int rem=0;
			int sum=0;
			while(number>0)
			{
				rem=number%10;
				sum=sum+(rem*rem*rem);
				number=number/10;
			}
				if(temp==sum)
				{
					System.out.println("Armstrong ");
				}
				else
				{
					System.out.println("Not Armstrong");


	}

}

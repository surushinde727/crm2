import java.util.Scanner;

class blackwhitegame
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.b 2.w ");

		System.out.println("user1");
		char x=sc.next().charAt(0);

		System.out.println(" user2");
		char y=sc.next().charAt(0);
                
                System.out.println(" user3");
		char z=sc.next().charAt(0);

		if(x==1)
		{
			if(y==1 && z==1)
			{
				System.out.println("match drop");
			}
			else if(y==2 && z==2)
			{
				System.out.println("user1 won match");
			}
			else if(y==2 && z==1)
			{
				System.out.println("user2 won match");
			}
                        else if(y==1 && z==2)
			{
				System.out.println("user3 won match");
			}
			else
			{
				System.out.println("open your eyes");
			}
		}
		
		  if(y==1)
		{
			if(x==1 && z==1)
			{
				System.out.println("match drop");
			}
			else if(x==2 && z==2)
			{
				System.out.println("user1 won match");
			}
			else if(x==2 && z==1)
			{
				System.out.println("user1 won match");
			}
                        else if(x==1 && z==2)
			{
				System.out.println("user3 won match");
			}
			else
			{
				System.out.println("open your eyes");
			}
		}

                if(z==1)
		{
			if(x==1 && y==1)
			{
				System.out.println("match drop");
			}
			else if(x==2 && y==2)
			{
				System.out.println("user3 won match");
			}
			else if(x==2 && y==1)
			{
				System.out.println("user3 won match");
			}
                        else if(x==1 && y==2)
			{
				System.out.println("user2 won match");
			}
			else
			{
				System.out.println("open your eyes");
			}
		}
                
               
}
}

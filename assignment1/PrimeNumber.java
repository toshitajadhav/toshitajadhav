package assignment1;


		import java.io.*;
		import java.lang.*;
		public class PrimeNumber
		{
			public static void main(String args[]) throws IOException
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the value: ");
				int n=Integer.parseInt(br.readLine());
				System.out.println("Prime numbers are: ");
				for(int i=1;i<=n;i++)
		        {
		            int p=0;
		            for(int j=2;j<i;j++)
		            {
		                if(i%j==0)
		                    p++;
		            }
		            if(p==0 && i>1)
		                    System.out.print(" "+i);

		        }
				isprime(20);
			}

			private static void isprime(int i) {
				// TODO Auto-generated method stub
				
			}
		
		 
	}



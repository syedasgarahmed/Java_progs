import java.util.*;
class AccenturePractice 
{
	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		int r=sc.nextInt();
		int unit=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		int tot=r*unit;
		int sum=0;
		for(int f=0;f<arr.length;f++)
		{
			if ((sum+=arr[f])>=tot)
			{
						System.out.println(f+1);
						break;
			}
		}

	}
}

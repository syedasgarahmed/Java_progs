import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
class  advi
{
	public static void main(String[] args) 
	{
		int nar[]=new int[8];
		Scanner sc=new Scanner(System.in);
		int [][] ar=new int[5][5];
		int flag[][]=new int[5][5];
		int Min = 0, Max = 1000;
		String ind[]=new String[100];
		int in=0,maxele,maxin1,maxin2;
		//System.out.println("Hello World!");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				ar[i][j]=getRandomValue(Min, Max);
				flag[i][j]=0;
			}
		}
		System.out.println("Printing Array..!");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.print(ar[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
				System.out.println("Enter source by space (x1 x2)");
				int s1=sc.nextInt();
				int s2=sc.nextInt();
				flag[s1][s2]=1;
				
				//System.out.println(s2);
				System.out.println("Enter Desination by space (y1 y2)");
				int d1=sc.nextInt();
				int d2=sc.nextInt();
				System.out.println("Source element is:"+ar[s1][s2]);
				//System.out.println(d1);
				//System.out.println(d2);
				int f=0;
				maxele=0;maxin1=0;maxin2=0;
				if(! (s1-1<0) || ! (s2-1<0))
		        {
				if(!(s1-1<0)){ nar[f++]=ar[s1-1][s2];ind[in++]=(Integer.toString(nar[--f]))+" ----> " +(Integer.toString(s1-1))+","+(Integer.toString(s2));if(nar[f]>maxele){maxele=nar[f];maxin1=s1-1;maxin2=s2;}f++;}//System.out.println("neighbour 1 is "+ar[s1-1][s2]);
				if(!(s1-1<0) && !( s2-1<0)) {nar[f++]=ar[s1-1][s2-1];ind[in++]=(Integer.toString(nar[--f]))+" ----> "+(Integer.toString(s1-1))+","+(Integer.toString(s2-1));if(nar[f]>maxele){maxele=nar[f];maxin1=s1-1;maxin2=s2-1;}f++;}//System.out.println("neighbour 2 is "+ar[s1-1][s2-1]);
				if(!(s2-1<0)){ nar[f++]=ar[s1][s2-1];ind[in++]=(Integer.toString(nar[--f]))+" ----> "+(Integer.toString(s1))+","+(Integer.toString(s2-1));if(nar[f]>maxele){maxele=nar[f];maxin1=s1;maxin2=s2-1;}f++;}//System.out.println("neighbour 3 is "+ar[s1][s2-1]);
				if(!(s1-1<0) && s2+1<5) {nar[f++]=ar[s1-1][s2+1];ind[in++]=(Integer.toString(nar[--f]))+" ----> "+(Integer.toString(s1-1))+","+(Integer.toString(s2+1));if(nar[f]>maxele){maxele=nar[f];maxin1=s1-1;maxin2=s2+1;}f++;}//System.out.println("neighbour 4 is "+ar[s1-1][s2+1]);
				if(s1+1<5  && ! (s2-1<0)){ nar[f++]=ar[s1+1][s2-1];ind[in++]=(Integer.toString(nar[--f]))+" ----> "+(Integer.toString(s1+1))+","+(Integer.toString(s2-1));if(nar[f]>maxele){maxele=nar[f];maxin1=s1+1;maxin2=s2-1;}f++;}//System.out.println("neighbour 4 is "+ar[s1+1][s2-1]);
		}
		if(s1+1<5 || s2+1<5)
		{
			if(s1+1<5) {nar[f++]=ar[s1+1][s2];ind[in++]=(Integer.toString(nar[--f]))+" ----> "+(Integer.toString(s1+1))+","+(Integer.toString(s2));if(nar[f]>maxele){maxele=nar[f];maxin1=s1+1;maxin2=s2;}f++;}//System.out.println("neighbour 6 is "+ar[s1+1][s2]);
			if(s1+1<5&&s2+1<5){ nar[f++]=ar[s1+1][s2+1];ind[in++]=(Integer.toString(nar[--f]))+" ----> "+(Integer.toString(s1+1))+","+(Integer.toString(s2+1));if(nar[f]>maxele){maxele=nar[f];maxin1=s1+1;maxin2=s2+1;}f++;}//System.out.println("neighbour 7 is "+ar[s1+1][s2+1]);
			if(s2+1<5){nar[f++]=ar[s1][s2+1];ind[in]=(Integer.toString(nar[--f]))+" ----> "+(Integer.toString(s1))+","+(Integer.toString(s2+1));if(nar[f]>maxele){maxele=nar[f];maxin1=s1;maxin2=s2+1;}f++;}//System.out.println("neighbour 8 is "+ar[s1][s2+1]);
		}
		System.out.println("Nieghbour elemets are ");
		for(String z:ind)
		{
		if(z!= null)
		System.out.println(z);
		}
		Arrays.sort(nar); 
		// Arrays.sort(nar, Collections.reverseOrder());
		int[] b = new int[nar.length];
        int s = nar.length;
        for (int i = 0; i < nar.length; i++) {
            b[s-1] = nar[i];
            s = s - 1;
        }
		int max=b[0];
		System.out.println("Maximum Neighbour is:"+maxele+" ("+maxin1+","+maxin2+")");
		for(int t2=0;t2<ind.length;t2++)
		{
			if(ind[t2]!=null){
		ind[t2]=ind[t2].replaceAll("[^0-9]", " ");
		ind[t2] =ind[t2].replaceAll(" +", " ");
			}
			int s3[]=new int[10];
			int len;
			for (int i = 0; i < ind.length; i++) {
				if(ind[i]!=null){
				len=ind[i].length();
				s3[i]=Integer.valueOf(ind[i].substring(0,3).trim());
				}
            //s3[i] = Integer.valueOf(ind[i]);
        }
		//for(int x3:s3)
		//	System.out.println(x3);
		//System.out.println(x);
		}
		
		//str = str.replaceAll("[^0-9]", " ");

	}
	
	public static int getRandomValue(int Min, int Max)
	{

		// Get and return the random integer
		// within Min and Max
		return ThreadLocalRandom.current().nextInt(Min, Max + 1);
	}
}

// Java program to generate a random integer
// within this specific range



//class GFG {

	

	// Driver code
	

		

		
	

package xyz;

public class Main
{
	
	static public void subSum(int a[])
	{
		int n=a.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		boolean[][] dp=new boolean [n+1][sum+1];
		/*for(int i=0;i<=n;i++)
		{
			dp[i][0]=true;
		}*/
		/*for(int i=1;i<=n;i++)
		{
			dp[i][a[i-1]]=true;
		}*/
		for(int i=1;i<=n;i++)
		{
			dp[i][a[i-1]]=true;
			for(int j=1;j<=sum;j++)
			{
				if(dp[i-1][j]==true)
				{
					dp[i][j]=true;
					dp[i][j+a[i-1]]=true;
				}
			}
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=sum;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String args[])
	{
	int a[]={1,2,3};
	subSum(a);
	}

}

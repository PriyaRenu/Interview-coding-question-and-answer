//created my priyars
//Consider the series: 1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187...
//Write a program that takes of N and compute the Nth team of this series
//Sample input:16
//Sample Output:2187
import java.*;
import java.io.*;
public class TcsMain
{
	public static void main(String[] args)throws Exception {
int i,n;
int j=0;
int z=0;
int value[]=new int[100];
//System.out.println("Enter the n value");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
if(i%2==0)
{
    
//System.out.println("Even");
value[i]=(int)Math.pow(2,j);
j++;
}
else
{
value[i]=(int)Math.pow(3,z);
z++;
}
//System.out.print(value[i]+"  ");
}
System.out.println("");
System.out.println(value[n-1]);
	}
}
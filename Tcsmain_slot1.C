//created my priyars in C
//Consider the series: 1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187...
//Write a program that takes of N and compute the Nth team of this series
//Sample input:16
//Sample Output:2187
#include<stdio.h>
#include<conio.h>
#include<Math.h>
int main()
{
int i,n;
int j=0,z=0;
int value[50];
printf("enter the n value");
scanf("%d",&n);
for(i=0;i<n;i++)
{
if(i%2==0)
{
value[i]=pow(2,j);
j++;
}
else
{
value[i]=pow(3,z);
z++;
}
printf("%d   ",value[i]);
}
printf("\nThe value of %d is %d",n,value[n-1]);
return 0;
}

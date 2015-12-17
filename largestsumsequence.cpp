
int solve(int a[],int n)//Carefull with all negitive no;
{ int dp[n];
int max=0;
int temp=0;
int i;
for( i=0;i<n;i++)
{max=max+a[i];
if(max<0)
    max=0;
    if((max)>temp)
      temp=max;
}
return temp;
}
int solvedp(int arr[],int n)
{ int max1=arr[0];
int temp=arr[0];
int i;
for(i=0;i<n;i++)
    {max1=max(max1+a[i],max)
    temp=max(temp,max1)
}
return temp;
}




}
int main()
{

    int n;
    scanf("%d",&n);
    int a[n];
int i;
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);

    printf("%d\n",solve(a,n));

}

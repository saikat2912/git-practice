package com.example;

public class ClassTwo {
    int saikat=10;
    int skp=20;
    public static void main(String arg[])
    {
        int arr[] = {2,1,3,5};
        int res = solve(arr);
        System.out.println(res);
    }
    public static int solve(int arr[])
    {
        int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                    for(int k=i;k<=j;k++)
                    {
                        sum=sum+arr[k];
                    }
                }
            }
            return sum;
    }
}

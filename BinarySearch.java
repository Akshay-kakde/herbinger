package com;
import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String args[])
{
    int n, i, key, first, last, middle;
    int arr[] = new int[50];
    Scanner scan = new Scanner(System.in);
	   
    System.out.print("Enter Total Number of Elements : ");
    n = scan.nextInt();
	   
    System.out.print("Enter " +n+ " Elements : ");
    for(i=0; i<n; i++)
    {
        arr[i] = scan.nextInt();
    }
	   
    System.out.print("Enter a Number to Search..");
    key = scan.nextInt();
	   
    first = 0;
    last = n-1;
    middle = (first+last)/2;
	   
    while(first <= last)
    {
        if(arr[middle] < key)
        {
            first = middle+1;
        }
        else if(arr[middle] == key)
        {
            System.out.print(key+ " Found at Location " +middle);
            break;
        }
        else
        {
            last = middle - 1;
        }
        middle = (first+last)/2;
    }
    if(first > last)
    {
        System.out.print("Not Found..!! " +key+ " is not Present in the List.");
    }
}
}
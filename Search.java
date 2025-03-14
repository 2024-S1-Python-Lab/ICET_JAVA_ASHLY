import java.util.Scanner;
public class Search
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the size of the array:");
int size=sc.nextInt();
int array[]=new int[size];
System.out.println("enter the elements of the array:");
for(int i=0;i<size;i++)
{
System.out.print("enter element "+(i+1)+":");
array[i]=sc.nextInt();
}
System.out.print("Enter the element to search:");
int searchElement=sc.nextInt();
Boolean foundfalse;
for(int i=0;i<size;i++)
{
if(array[i]==searchElement)
{
found=true;
System.out.println("element found at index"+i);
break;
}
}
if (!found)
System.out.println("Element not found in the array");
}
}
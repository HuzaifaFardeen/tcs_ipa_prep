import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int count = 0;
		String[] arr2 = new String[arr.length];
		int track = 0;
		for (int i=0;i<arr.length;i++)
		{
		    if(arr[i].length()==1){arr2[count]=arr[i];count++;}
		    track=0;
		    //System.out.println(arr[i]);
		    for(int j = 0; j<arr[i].length()/2;j++)
		    {
		       // System.out.println(arr[i].charAt(j));
		        
		        //if(arr[i].length()==1){arr2[count]=arr[i];count++;System.out.println(arr[i].length());}
		        //else
		        //{
		            
		            char ch = arr[i].charAt(j);
		            char ch2 = arr[i].charAt(arr[i].length()-1-j);
		            //System.out.println(ch);
		            //System.out.println(ch2);
		            if((ch+"").equalsIgnoreCase(ch2+"")){track++;}
		            if(track==arr[i].length()/2){arr2[count]=arr[i];count++;}
		            //track=0;
		            //System.out.println(arr[i].length());
		        //}
		    }
		}
		String[] arr3 = new String[count];
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		    System.out.println(arr2[i]);
		}
	}
}
//input; i am nitin from malayalam
//output: 3 i nitin malayalam

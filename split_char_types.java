/* Input: "Hello@123World456"

Process:
Array: ["Hello", "@", "123", "World", "456"]
Now you should concatenate all the strings in the array and multiply it with the sum of the position of that array where 
numbers are stored.
Sum of positions of numbers in the array = 2 + 4 = 6
Concatenated string = "Hello@123World456"
Result = 8 * "Hello@123World456" = "Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456Hello@123World456Hello@123World456"

Output:
"Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456"

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String[] nums= str.split("\\D+");
        //System.out.println(nums[0]);
        int count =0;
        String ctype = "";
        int sum =0;
        String[] st = new String[str.length()];
        for(int i=0; i<str.length()-1;i++)
        {
            char ch = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if(Character.isLetter(ch)&& !Character.isLetter(ch2)){count++;}
            else if( (!Character.isLetter(ch)&&!Character.isDigit(ch) ) && ( Character.isLetter(ch2) || ( Character.isDigit(ch2) )) )
            {count++;}
            else if(Character.isDigit(ch)&& ( !Character.isDigit(ch2)|| i+2==str.length() ) ){sum=sum+count;count++;}
            
        }
        if(Character.isDigit(str.charAt(str.length()-1))&&!Character.isDigit( str.charAt(str.length()-2) ) ){sum=sum+count;}
        System.out.println(sum);
        
	}
}

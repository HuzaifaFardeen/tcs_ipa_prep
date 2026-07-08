public class Main
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Employee[] arr = new Employee[4];
		for(int i=0;i<4;i++)
		{
		    int id= sc.nextInt(); sc.nextLine();
		    String name = sc.nextLine();
		    String branch = sc.nextLine();
		    double rating = sc.nextDouble();
		    boolean transport = sc.nextBoolean();
		    arr[i] = new Employee(id, name, branch, rating, transport);
		    
		}
		sc.nextLine();
		String branch = sc.nextLine();
		int count = findCountOfEmployeesusingCompTransport(arr, branch);
		Employee e2h = findEmployeeWithSecondHighestRating(arr);
		if(count==0){System.out.println("no such employee");}
		else{System.out.println(count);}
		if(e2h==null){System.out.println("All Employees using company transport");}
		else{System.out.println(e2h.getid() ); System.out.println(e2h.getname() );}
	}
	public static int findCountOfEmployeesusingCompTransport(Employee[] arr, String branch)
	{
	    //return 0;
	    int count =0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i].getbranch().equalsIgnoreCase(branch) && arr[i].gettransport()){count++;}
	    }
	    return count;
	    
	}
	public static Employee findEmployeeWithSecondHighestRating(Employee[] arr)
	{
	    Employee[] arr2 = new Employee[4];
	    int count =0;
	    for(int i=0; i<arr.length;i++)
	    {
	        if(!arr[i].gettransport()){arr2[count] = arr[i];count++;}
	        
	    }
	    if(count==0 || count==1){return null;}
	    Employee[] arr3 = new Employee[count];
	    for(int i=0;i<count;i++)
	    {
	        arr3[i]=arr2[i];
	    }
	    java.util.Arrays.sort(arr3, (a,b) -> Double.compare( a.getrating(), b.getrating() ) );
	    return arr3[arr3.length-2];
	    
	}
}
class Employee
{
    private int id ; public int getid(){return id;}
    private String name; public String getname(){return name;}
    private String branch; public String getbranch(){return branch;}
    private double rating; public double getrating(){return rating;}
    private boolean transport; public boolean gettransport(){return transport;}
    public Employee(int id, String name, String branch, double rating, boolean transport)
    {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.rating= rating;
        this.transport = transport;
    }
}

/*
input:
1001
Ashwa
IT
5
true
1002
Preeti
IT
4
true
1003
Uma
Admin
3
false
1004
Akash
Hardware
4.5
false
IT
output:
2
1003
Uma
*/

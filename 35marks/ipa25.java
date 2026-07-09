import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cinema[] arr = new Cinema[4];
        for(int i=0;i<4;i++)
        {
            int movieId = sc.nextInt();sc.nextLine();
            String director = sc.nextLine();
            int rating = sc.nextInt();
            int budget = sc.nextInt();
            arr[i] = new Cinema(movieId,director,rating,budget);
        }
        sc.nextLine();
        String direct = sc.nextLine();
        int rat = sc.nextInt();
        int bud = sc.nextInt();
        int avg = findAvgBudgetByDirector(arr, direct);
        Cinema movie = getMovieByRatingBudget(arr, rat,bud);
        if(avg==0){System.out.println("no film found");}
        else{System.out.println(avg);}
        if(movie ==null){System.out.println("no such movie");}
        else{System.out.println(movie.getid());
            
        }
    }
    public static int findAvgBudgetByDirector(Cinema[] arr,  String director)
    {
        //avg of films by Director
        int count=0;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getdirector().equalsIgnoreCase(director)){sum=sum+arr[i].getbudget();count++;}
        }
        int avg = sum/count;
        return avg;
        
        
        
    }
    public static Cinema getMovieByRatingBudget(Cinema[] arr, int rating, int budget)
    {
        //rating is factore of budget? movie that matches rating and budget
        if(budget%rating!=0){return null;}
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getrating()==rating && arr[i].getbudget()==budget){return arr[i];}
        }
        return null;
    }
    
}
class Cinema
{
    private int movieId; public int getid(){return movieId;}
    private String director; public String getdirector(){return director;}
    private int rating; public int getrating(){return rating;}
    private int budget; public int getbudget(){return budget;}
    public Cinema(int movieId, String director, int rating, int budget)
    {
        this.movieId = movieId;
        this.director= director;
        this.rating = rating;
        this.budget = budget;
    }
}
/*
input:
1101
GVM
4
100
1201
Shankar
5
500
1301
Shankar
3
50
1401
GVM
5
300
GVM
5
300
output:
200
1401
*/

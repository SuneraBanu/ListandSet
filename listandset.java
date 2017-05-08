package listandset;
import java.util.*;
 
public class ListandSet {
	public static void main(String args[]) {
		System.out.println("This is Sara's Friends List");
		//creating a new, empty set
	    SortedSet<String> mySet1 = new TreeSet<String>();//adding type arguments
		//adding a few elements
		        mySet1.add("Hanif");
		        mySet1.add("Mothi");
		        mySet1.add("Nazia");
		        mySet1.add("Shenaz");
		        mySet1.add("Sunera");
		// Printing the elements of the Set
		        System.out.println( mySet1);
		        
	    // Create a list and add some elements
		        System.out.println("Now its your turn to enter your Friend List");
		        Scanner sc = new Scanner(System.in);
		        String f1=sc.nextLine();
		        String f2=sc.nextLine();
		        String f3=sc.nextLine();
		        String f4=sc.nextLine();
		        String f5=sc.nextLine();
		       
		        List<String> list = new ArrayList<String>();//adding type arguments
		        list.add(f1);
		        list.add(f2);
		        list.add(f3);
		        list.add(f4);
		        list.add(f5);
		        
		        
		        
		        
		 // Now create the set using the appropriate constructor
		 //converting list into set in order to compare 2 sets and removes duplicate values
		        SortedSet<String> mySet2 = new TreeSet<String>(list);
		        
		       
	     // Printing the elements of the list and the set
		        System.out.println("Your Friend List(list) : " + list);
		        System.out.println("Your Friend List(Converting list to set) : " + mySet2);
		 // Comparing the two sets
		        System.out.println("Lets check wether you and sara have mutual friends");
		        if(mySet1.equals(mySet2))
		        {
		        	System.out.println("**Woah! You have mutual Friends**");
		        }
		        else
		        {
		        	System.out.println("**Oops! There are no mutual friends**");
		        }
		      
		     
		 //removing one element from mySet2 and comparing again
		        System.out.println("Lets remove one of your friend");
		        Scanner sc1 = new Scanner(System.in);
		        String r1=sc1.nextLine();
		        mySet2.remove(r1);
		        System.out.println("Your new Friend list: " + mySet2);
		        System.out.println("**Is your friend list and sara's friend list still matching ?**"+ mySet1.equals(mySet2));;
		        
		  //Searching whether the element exits
		        System.out.println("Lets check whether you entered your friends name");
		        Scanner sc2 = new Scanner(System.in);
		        String r2=sc1.nextLine();
		        if(mySet2.contains(r2))
		        {
		        	System.out.println("**Your friend is found**");
		        }
		        else
		        {
		        	System.out.println("**Your friend is not found**");
		        }
		     // Clearing all the elements
		        System.out.println("Clearing Sara's Friend List");
		        mySet1.clear();
		        System.out.println("Sara's friend list is now Empty: " + mySet1.isEmpty());

		        // Checking the number of elements
		        System.out.println("Sara's Friend List: " + mySet1.size() + " Elements");
		        System.out.println("Your Friend List: " + mySet2.size() + " Elements");


}
}

Output:
This is Sara's Friends List
[Hanif, Mothi, Nazia, Shenaz, Sunera]
Now its your turn to enter your Friend List
Shenaz
Sunera
Hanif
Nazia
Mothi
Your Friend List(list) : [Shenaz, Sunera, Hanif, Nazia, Mothi]
Your Friend List(Converting list to set) : [Hanif, Mothi, Nazia, Shenaz, Sunera]
Lets check wether you and sara have mutual friends
**Woah! You have mutual Friends**
Lets remove one of your friend
Mothi
Your new Friend list: [Hanif, Nazia, Shenaz, Sunera]
**Is your friend list and sara's friend list still matching ?**false
Lets check whether you entered your friends name
Shenaz
**Your friend is found**
Clearing Sara's Friend List
Sara's friend list is now Empty: true
Sara's Friend List: 0 Elements
Your Friend List: 4 Elements
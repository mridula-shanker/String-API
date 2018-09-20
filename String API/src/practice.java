
public class practice 
{

	public static void main(String[] args) 
	{
		String river = "Mississippi";
		int length = river.length();
		System.out.println("The length of Mississippi is "+length);
		
		String lowerCase = "hello world";
		String upperCase = lowerCase.toUpperCase();
		System.out.println("The upppercase version of "+ lowerCase +" is " +upperCase);
		
		System.out.println ("It is illegal to call river.println since .println isnt a method in the river class");
		
		System.out.println("There are two arguements for method replace. First the original string, then the replacement charecters.");
		
		String edit = river.replace("p", "s");
		System.out.println("Replacing p with s in Mississippi:"+edit);
		
		String lower = "mississppi";
		String upper = lower.toUpperCase();
		System.out.println ("The uppercase version of "  +lower +" is " +upper);
		

	}

}

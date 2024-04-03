// Java program to remove non-alphanumeric
// characters from a string
class StringRemove {

	
	public static String
	removeNonAlphanumeric(String str)
	{
		
		str = str.replaceAll(
		"[^a-zA-Z0-9]", "");

		
		return str;
	}

	
	public static void main(String args[])
	{

		
		String str1 
		= "@!Hello'World, 123";
		System.out.println(
		removeNonAlphanumeric(str1));

	
		String str2 
		= "Hello$ World?{}[]";
		System.out.println(
		removeNonAlphanumeric(str2));

		
		String str3 
		= "Helloworld123";
		System.out.println(
		removeNonAlphanumeric(str3));
	}
}

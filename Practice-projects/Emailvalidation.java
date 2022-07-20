	import java.util.ArrayList;
	import java.util.List;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class Emailvalidation {
		public static void main(String args[]) {
		    List<String> emails = new ArrayList<String>();
	      emails.add("rahul12#234@gmail1.com");
	      emails.add("kittuprasad700@gmail.com");
	      emails.add("mayuribenal1111@gmail.com");
	      emails.add("mayur@gmail.com");
	      emails.add("@pindom.com");
	      emails.add("sairamkrishna_mammahe%google-india.com");
	      String regex = "^(.+)@(.+)$";
	      Pattern pattern = Pattern.compile(regex);
	      
	      for (Object email : emails) {
	         Matcher matcher = pattern.matcher((CharSequence) email);
	         System.out.println(email + " : " + matcher.matches());
	      } 
	   }
	}




public class accessmodifiers {
	class defAccessSpecifier
	{ 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 
	public class accessSpecifiers1 {

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			accessmodifiers obj = new accessmodifiers(); 		  
	        obj.display(); 

		}
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}

}

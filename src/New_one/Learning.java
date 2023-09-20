package New_one;

public class Learning {

	int x = 3;
	String text = "i'm just a text"; 
	
	static  void Sign_IN() {
		 System.out.println("Enter Name");
	 }

	private void Log_Out_private_one() {
		 System.out.println("Yes I'm Private Method");
	 }
	
	public void Log_Out() {
		 System.out.println("Click to Logout");
	 }
	
	 public void Email() {
		 System.out.println("Enter Email Address");
	 }

	 public void Password() {
		 System.out.println("Enter Password");
	 }
	 static void Date_Of_Birth() {
		 System.out.println("Day-Month-Year");
	 }

	 public static void main(String[] args) {
		 	 
		 Learning nasir = new Learning();
		 Sign_IN();
		 nasir.Log_Out();
		 nasir.Email();
		 nasir.Password();
		 Date_Of_Birth();
		 System.out.println(nasir.x);
		 nasir.Log_Out_private_one();		 
	 }


}

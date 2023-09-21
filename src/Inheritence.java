import New_one.Learning;

public class Inheritence extends Learning {

	public	String s = "Hii ALI  Bhai";
	public	String b = " I'm line two";
	public 	String connect = s + b;
	public  String  new_line_for_git = "For New change";
	
	private void SigIn_Private() {
		System.out.println("i'm Private Method from Inheritence Class");
	}
	
	public void SigIn() {
		System.out.println("i'm SIGIN HEyyyy");
	}
	public void LogOut() {
		System.out.println("i'm LOGOUT HEyyyy");
	}
	
	 public static void main(String[] args) {
		 
		 Inheritence nasirObject = new Inheritence();
		 System.out.println(nasirObject.connect);
		 nasirObject.SigIn();
		 nasirObject.LogOut();
		 nasirObject.Email();
		 nasirObject.Log_Out();
		 nasirObject.Password();
	//	 nasirObject.Log_Out_private_one();
		 nasirObject.SigIn_Private();
	 }
}


public class Lamp {

	  boolean isOn;

	  
	  void turnOn(){
	    isOn = true;
	    System.out.println("Light on? " + isOn);
}

	  public static void main(String[] args) {
	    
	
	    Lamp obj = new Lamp();

	    obj.turnOn();
	  }
	
}


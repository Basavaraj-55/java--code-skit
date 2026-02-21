package interfacedemo;
class GreetingsImp implements InterfaceDemo3
{

	public void sayHello(String Name) {
		System.out.println("Hello" + "   "+ Name + " !");
		
	}
	
}
public class FunctionalInterface {
	

	public static void main(String[] args) { 
			InterfaceDemo3 obj=new GreetingsImp();
			((GreetingsImp) obj).sayHello("Vishu");
		// TODO Auto-generated method stub

	}

}

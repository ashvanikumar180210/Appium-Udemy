package Resources;

public class childClass extends CoreJavaB2 {
	
	public void Engine()
	{
		System.out.println("Engine calling");
	}
	
	public void colour()
	{
		System.out.println(color);
	}
	
	public void Audio()
	{
		System.out.println("Audio calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass cd= new childClass();
		cd.colour();
		cd.Gears();
		cd.breaks();
		cd.Engine();
		cd.Audio();

		
		
	}

}

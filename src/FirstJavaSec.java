
public class FirstJavaSec
{
	char Digito;

	public FirstJavaSec(char dig){
		setDigito(dig);
	}

	public void setDigito(char dig){
		Digito = dig;
	}
	
	public char getDigito(){
		return (Digito);
	}

	public void run() 
	{
		System.out.println("Child Thread ThreadId: " + Thread.currentThread().getId());
		for(int i=0; i<200; i++) 
		{
			System.out.print(getDigito());
		}
	}

	static public void main(String[] args) 
	{
		System.out.println("Main ThreadId: " + Thread.currentThread().getId());
	
		new FirstJavaSec('1').run();
		new FirstJavaSec('2').run();

		System.out.println("Main ThreadId: " + Thread.currentThread().getId() + "-> End Main Thread");
	}

}

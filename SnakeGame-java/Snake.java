public class Snake
{

	private static GameGUI currentGame; 

	public static void main(String[] args)
	{
		currentGame = new GameGUI(Integer.parseInt(args[0]));
	}
}
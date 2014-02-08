import java.awt.Image;

public class Cell
{

	private int inDirection;
	private int outDirection;
	private Image cellImage;
	public enum cellType
	{
		CLEAR, SNAKE_HEAD, SNAKE_BODY, SNAKE_TAIL, TREE, FOOD, OTHER
	}

	public Cell()
	{

	} 

	public void update()
	{

	}
}
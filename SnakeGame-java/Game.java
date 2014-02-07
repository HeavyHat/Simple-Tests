public class Game
{

	private Cell [] [] cellGrid;

	public Game(int sizeOfGrid)
	{
		cellGrid = new Cell [sizeOfGrid] [sizeOfGrid];
	}

	public String getAuthor()
	{
		return "Josh Langley";
	}

	public Cell getCell(int xPosition, int yPosition)
	{
		return new Cell();
	}

	public void setInitialGameState(int initialSnakeDirection, int tailXPosition, int tailYPosition, int lengthOfSnake)
	{
		
	}

	private void placeSnake()
	{

	}

	public void move()
	{

	}

	private void moveHead()
	{

	}

	private void moveTail()
	{

	}

	private void eatFood()
	{

	}
}
public class Direction
{
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;

	public static int xDelta(int givenDirection)
	{
		switch(givenDirection)
		{
			case 0: return 0;
			case 1: return 1;
			case 2: return 0;
			case 3: return -1;
			default: throw new DirectionOutOfBoundsException();
		}
	}

	public static int yDelta(int givenDirection)
	{
		switch(givenDirection)
		{
			case 0: return 1;
			case 1: return 0;
			case 2: return -1;
			case 3: return 0;
			default: throw new DirectionOutOfBoundsException();
		}
	}

	public static int getRandomStart(int xPos, int yPos)
	{
		if(yPos == 0)
			yPos = NORTH;
		else
			yPos = SOUTH;
		if(xPos == 0)
			xPos = EAST;
		else
			xPos = WEST;
		return (Math.random() >= 0.5) ? xPos : yPos;
	}

	public static int oppositeDirection(int currentDirection)
	{
		switch(currentDirection)
		{
			case 0: return 2;
			case 1: return 3;
			case 2: return 0;
			case 3: return 1;
			default: throw new DirectionOutOfBoundsException();
		}
	}

	public static String toString(int direction)
	{
		switch(direction)
		{
			case 0: return "North 0";
			case 1: return "East 1";
			case 2: return "South 2";
			case 3: return "West 4";
			default: throw new DirectionOutOfBoundsException();
		}
	}
}
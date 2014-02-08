import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import java.awt.Image;

public class GameGUI extends JFrame implements KeyListener
{
	private final Game currentGame;
	private final Container scoreBar = new Container();
	private final Container mainGrid = new Container();
	private final JLabel scoreMessage = new JLabel();
	private final JLabel scoreCounter = new JLabel();
	private int score = 0;
	private final int initGridSize;

	public GameGUI(int initialGridSize)
	{
		currentGame = new Game(initialGridSize);
		initGridSize = initialGridSize;
		setTitle("Complex Snake game by " + /*currentGame.getAuthor()*/ currentGame.getAuthor()  + ".");
		setSize(500, 600);
		Container contents = getContentPane();
		setFocusable(true);
		requestFocusInWindow();
		addKeyListener(this);
		mainGrid.setLayout(new GridLayout(initialGridSize, initialGridSize,0,0));
		scoreBar.setLayout(new BorderLayout());
		setScore(0);
		setScoreMessage("Press R to start new game.");
		scoreBar.add(scoreMessage, BorderLayout.WEST);
		scoreBar.add(scoreCounter, BorderLayout.EAST);
		contents.setLayout(new BorderLayout());
		contents.add(scoreBar, BorderLayout.NORTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void keyPressed(KeyEvent e)
	{
		char pressedChar = e.getKeyChar();
		if(pressedChar == 'a')
		{
			int initialTailX, initialTailY;
			initialTailX = getStartPosition();
			initialTailY = getStartPosition();
			currentGame.setInitialGameState(Direction.getRandomStart(initialTailX,initialTailY),initialTailX,initialTailY,initGridSize);
		}

	}

	private int getStartPosition()
	{
		return (Math.random() >= 0.5) ? (initGridSize - 1): 0 ;
	}

	public void keyReleased(KeyEvent e)
	{

	}

	public void keyTyped(KeyEvent e)
	{

	}
	public void setScore(int currentScore)
	{
		scoreCounter.setText(String.format("Score: %09d", currentScore));
		score = currentScore;
	}

	public int getScore()
	{
		return score;
	}

	public String getScoreMessage()
	{
		return scoreMessage.getText();
	}

	public void setScoreMessage(String message)
	{
		scoreMessage.setText(message);
	}
}
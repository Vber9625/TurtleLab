package turtle.controller;

import media.model.Turtle;
import media.model.World;

public class Controller
{
	public Controller()
	{
		
	}
	
	public void start()
	{
		int distance;
		World window;
		Turtle turtle1;
		window = new World();
		turtle1 = new Turtle(window);
		turtle1.forward(100);
		turtle1.turnLeft();
	}
}

package com.epam.Behavioural_designPattern;

public class EndState implements State{

	public void action(StateManager manage) {
	      System.out.print("End state to be Destroyed");
	      manage.setState(this);	
	   }

	   public String toString(){
	      return " in the End State";
	   }
}

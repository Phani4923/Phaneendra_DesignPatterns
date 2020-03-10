package com.epam.Behavioural_designPattern;

public class IntermediateState implements State{

	public void action(StateManager manage) {
	      System.out.print("Intermediate state is Confirmed");
	      manage.setState(this);	
	   }

	   public String toString(){
	      return " in the Intermediate state";
	   }
}

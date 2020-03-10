package com.epam.Behavioural_designPattern;

public class StateManager {
	private State state;

	StateManager()
	{
		state=null;
	}
	public void setState(State state){
	    this.state = state;		
	 }

	 public State getState(){
	    return state;
	 }
}

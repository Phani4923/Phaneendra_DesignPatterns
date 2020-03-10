package com.epam.Behavioural_designPattern;

public class State_DP {
	public static void main(String [] args)
	{
		StateManager manager=new StateManager();	
		
		InitialState initialState = new InitialState();
		initialState.action(manager);
		System.out.println(manager.getState().toString());
		
		IntermediateState middleState = new IntermediateState();
		middleState.action(manager);
		System.out.println(manager.getState().toString());
		
		EndState finalState = new EndState();
		finalState.action(manager);
		System.out.println(manager.getState().toString());
	}
	
}

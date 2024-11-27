package com.pphyo.memento;

public class MementoApplication {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		originator.setState("State One");
		caretaker.addMemento(originator.saveToMemento());
		
		originator.setState("State Two");
		caretaker.addMemento(originator.saveToMemento());
		
		originator.setState("State Three");
		caretaker.addMemento(originator.saveToMemento());
		
		originator.setState("State Four");
		caretaker.addMemento(originator.saveToMemento());
		
		originator.setState("State Five");
		caretaker.addMemento(originator.saveToMemento());
		
		originator.restoreFromMemento(caretaker.getMemento(1));

	}

}

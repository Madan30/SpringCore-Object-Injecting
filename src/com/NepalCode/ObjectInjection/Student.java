package com.NepalCode.ObjectInjection;

public class Student {

	int id; // depenceny in the form of literals

	// MathCheat mathCheat = new MathCheat(); // type coupling not good practice
	private MathCheat mathCheat; // injecting dependency in the form of object types literals

	public void cheating() {
		mathCheat.mathCheat();
		System.out.println("hey my id is:" + id + " do whatever you want to do..");
	}

	// to inject object and literals dependency we have to use setter and
	// constructor injection

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void setId(int id) {
		this.id = id;
	}

}

package com.app.ioc;

public class medico {

	Utensilios utensilio;
	public void setUtensilio(Utensilios untensilio) {
		this.utensilio = untensilio;
	}
	public void operar() {
		System.out.println("Operando!!!");
		utensilio.usar();
	}
}

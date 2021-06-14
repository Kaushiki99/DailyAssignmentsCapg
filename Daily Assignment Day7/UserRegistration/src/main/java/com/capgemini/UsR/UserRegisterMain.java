package com.capgemini.UsR;
import com.capgemini.UsR.model.UserRegister;

public class UserRegisterMain {
	public static void main(String[] args) {
		UserRegister ru = new UserRegister();
		 ru.readDetails();
		System.out.println(ru.displayDetails());

}

	
}

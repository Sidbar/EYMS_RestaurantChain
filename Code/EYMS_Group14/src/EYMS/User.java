/**
 * @author babbar
 * This class is the abstract class that handles all the users of the system including
 * the manager and the clients
 */
package EYMS;

import java.util.ArrayList;
import javax.swing.*;

public abstract class User {
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	//private JPasswordField password;
	
	public String getUserName() {
		return userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	
	public User(String userName, String firstName, String lastName, String password) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	public abstract Meal accessMeal();
	public ArrayList<Meal> getMeals(){
		
	}
}

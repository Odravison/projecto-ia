/**
 * 
 */
package br.ufpb.projetoia.managers;

import java.util.LinkedList;
import java.util.List;

import br.ufpb.projetoia.models.User;

/**
 * @author odravison
 *
 */
public class UserManager {
	
	List<User> users;
	
	/**
	 * 
	 */
	public UserManager() {
		users = new LinkedList<User>();
	}
	
	public boolean isLoginValid(String email, String passwd){
		for (User user : users){
			if (user.getEmail().equals(email) && user.getPasswd().equals(passwd)){
				return true;
			}
		}
		return false;
	}
	
	public void addUser(String email, String passwd, String name){
		User user = new User(name, passwd, email);
		users.add(user);
	}

}

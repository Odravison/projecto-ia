/**
 * 
 */
package br.ufpb.projetoia.models;

/**
 * @author odravison
 *
 */
public class User {
	
	private String name;
	private String passwd;
	private String email;	
	
	public User(String name, String passwd, String email) {
		super();
		this.name = name;
		this.passwd = passwd;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

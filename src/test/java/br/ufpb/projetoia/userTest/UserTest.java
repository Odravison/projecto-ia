/**
 * 
 */
package br.ufpb.projetoia.userTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.projetoia.managers.UserManager;

/**
 * @author odravison
 *
 */


public class UserTest {
	
	private UserManager usermng = new UserManager();
	
	
	@Before
	public void setUpTest(){
		usermng.addUser("odravison@odravison.com", "123456", "Odravison");
		usermng.addUser("mariazinha@odravison.com", "123456", "Mariazinha");
		usermng.addUser("joaozinho@odravison.com", "123456", "Joaozinho");
		
	}
	
	@Test
	public void isValidTest(String email, String senha){
		
		assertEquals(usermng.isLoginValid("odravison@odravison.com", "123456"), true);
		assertEquals(usermng.isLoginValid("mariazinha@odravison.com", "123456"), true);
		assertEquals(usermng.isLoginValid("joaozinho@odravison.com", "123456"), true);
		
	}

}

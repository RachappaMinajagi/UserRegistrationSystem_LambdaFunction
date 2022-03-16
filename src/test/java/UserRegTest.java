import org.junit.Assert;
import org.junit.Test;

import lambdaFunction.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

/*
 * 
/**
 * UC3- As a User need to enter a valid email 
 * -E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl& co)
 *
 */
public class UserRegTest {

	@Test
	/*
	 * created method testingFirstName() to check firstname is valid or not
	 */
	public void testingFirstName() {
		/*
		 * Creating Object for UserRegistration class
		 */
		UserRegistration userRegistration = new UserRegistration();
		/*
		 * calling checkFName method to see firstname is valid
		 */
		boolean isFNameValid = userRegistration.checkFName("Rachoti");
		Assert.assertTrue(isFNameValid);
	}

	@Test
	/*
	 * created method testFirstNameInvalidMustReturnFalse for false condition
	 */
	public void testFirstNameInvalidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFnameValid = userRegistration.checkFName("rachoti");
		Assert.assertFalse(isFnameValid);
	}

	/*
	 * created method testingLastName() to check lastname is valid or not
	 */
	@Test
	public void testLastNameValidMustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		/*
		 * calling Lname method to see LastName is valid
		 */
		boolean isLnameValid = userRegistration.Lname("Minajagi");
		Assert.assertTrue(isLnameValid);
	}

	/*
	 * created method testLastNameInvalidMustReturnFalse for false condition
	 */
	@Test
	public void testLastNameValidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isLnameINValid = userRegistration.Lname("minajagi");
		Assert.assertFalse(isLnameINValid);
	}

	/*
	 * Created method for Email and its boolean type whether Email valid or not
	 */

	public boolean checkEmail(String emailID) {
		return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
	}
}
package com.github.ljtfreitas.restify.http.client.authentication;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicCredentialsTest {

	@Test
	public void shouldGenerateBasicAuthenticationForUserAndPassword() {
		// user = myUser
		// password = myPassword
		// encodedBase64(myUser:myPassword) = bXlVc2VyOm15UGFzc3dvcmQ=

		BasicCredentials basicCredentials = new BasicCredentials("myUser", "myPassword");

		String authenticationContent = basicCredentials.toString();

		assertEquals(authenticationContent, "Basic bXlVc2VyOm15UGFzc3dvcmQ=");
	}
}

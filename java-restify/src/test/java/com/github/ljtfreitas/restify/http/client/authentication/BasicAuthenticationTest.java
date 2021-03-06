package com.github.ljtfreitas.restify.http.client.authentication;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.ljtfreitas.restify.http.client.authentication.BasicAuthentication;

public class BasicAuthenticationTest {

	@Test
	public void shouldGenerateBasicAuthenticationForUserAndPassword() {
		// user = myUser
		// password = myPassword
		// encodedBase64(myUser:myPassword) = bXlVc2VyOm15UGFzc3dvcmQ=

		BasicAuthentication basicAuthentication = new BasicAuthentication("myUser", "myPassword");

		String authenticationContent = basicAuthentication.content();

		assertEquals(authenticationContent, "Basic bXlVc2VyOm15UGFzc3dvcmQ=");
	}
}

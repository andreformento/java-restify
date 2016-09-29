package com.restify.http.client.request.interceptor.authentication;

import com.restify.http.client.authentication.Authentication;
import com.restify.http.client.request.EndpointRequest;
import com.restify.http.client.request.interceptor.EndpointRequestInterceptor;

public class AuthenticationEndpoinRequestInterceptor implements EndpointRequestInterceptor {

	private final Authentication authentication;

	public AuthenticationEndpoinRequestInterceptor(Authentication authentication) {
		this.authentication = authentication;
	}

	@Override
	public EndpointRequest intercepts(EndpointRequest endpointRequest) {
		endpointRequest.headers().put("Authorization", authentication.content());
		return endpointRequest;
	}

}
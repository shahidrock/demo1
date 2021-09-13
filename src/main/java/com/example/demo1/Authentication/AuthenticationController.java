package com.example.demo1.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.MyUserDetailsService;
import com.example.demo1.Authentication.Models.AuthenticationRequest;
import com.example.demo1.Authentication.Models.AuthenticationResponse;
import com.example.demo1.Student.Student;
import com.example.demo1.Util.JwtUtil;

@RequestMapping(path = "api/v1/auth")
@RestController
public class AuthenticationController {
	
	@Autowired 
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping
	public AuthenticationResponse createJwt(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(), authenticationRequest.getPassword()));
		} catch(BadCredentialsException ex) {
			throw new Exception("Incorrect Credentials");
		} 
		
		final UserDetails userDetails = myUserDetailsService.loadUserByUsername(authenticationRequest.getUserName());
		
		final String jwt = jwtUtil.generateToken(userDetails);
		
		return new AuthenticationResponse(jwt);
	}
}

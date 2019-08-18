/**
 * 
 */
package com.olixstudios;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ashwin
 *
 */
@RestController
public class HelloController { //public class
	@RequestMapping("/hello")
	public String hello() { //hello function with return string return type
		return "Hello to my duniyas!";  // return a string
	}
	
}

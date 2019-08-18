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
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello to my duniyas!";
	}
	
}

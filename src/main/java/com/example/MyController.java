/**
 * 
 */
package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pankaj.kedia
 *
 */
@RestController
public class MyController {

	@RequestMapping("/")
	public String index() {
		return "Hello World!";	
	}

	@RequestMapping("/pankaj")
	public String indexP() {
		return "Hello World!";
	}

	@RequestMapping("/kedia")
	public String indexK() {
		return "Greetings from Spring!";
	}
}

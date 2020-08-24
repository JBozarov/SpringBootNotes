
PROPERTY INJECTED CONTROLLER: 

package com.jahongir.demo.controllers;

import com.jahongir.demo.services.TruckService;

public class PropertyInjectedController {

	TruckService truckService; 
	
	public String getTruckService() {
		return truckService.truckService(); 
	}
}


SETTERS INJECTED CONTROLLER: 
package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController  {

	private GreetingService greetingService; 
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService; 
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting(); 
	}
}


CONSTRUCTOR INJECTED CONTROLLER: 

package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService; 
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService; 
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting(); 
	}
}

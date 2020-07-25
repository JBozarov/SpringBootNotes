

	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "Hello World"; 
	}
  
  it can be replaced by:
  @GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello Worldd"; 
	}
  
  so when we use GetMapping we don't need to specify method 
	  
	  
  // Return helloWorld Path variable
@GetMapping(path="/hello-world/path-variable/{name}")
public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
	return new HelloWorldBean(String.format("Hello World, %s", name)); 
}


	  
	  
dispatcherServlet is handling all / requests ( endpoints ) 
	  

  Spring MVC is the primary web framework built on the Servlet API. It is build on the popular MVC design pattern. 
  MVC (Model-View-Controller) is a software architecture pattern, which separates application into three areas: model, view, 
  and controller. The model represents a Java object carrying data. The view represents the visualization of the data that the model contains. 
  The controller controls the data flow into model object and updates the view when the data changes. It separates the view and model.
	
  springboot standalone 2

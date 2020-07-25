

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



@SpringBootApplication 
1. Indicates this is a spring context 
2. Enables auto configuration 
3. Enables component scan ( scan all classes in the same package ) 
4

// if I run this I can see auto configurations prints: 
@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(RestfulWebServicesApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) {
		System.out.println(name);
		}
	}
}
if I add this code in application.properties then I can see all auto configurations 
logging.level.org.springframework = debug

// this code show auto configuration is not happening:
   UserDetailsServiceAutoConfiguration:
      Did not match:
         - @ConditionalOnClass did not find required



SpringApplication.run -> runs Spring context which is a Application.class 
run method returns Application context


package com.springbootlearning.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//if you are not give the id explicitly , then it will take default id : tennisCoach
@Component
/*
 * @Scope("prototype") //check prototype annotation
 */public class TennisCoach implements Coach {
	
	//field injection annotation : backend use java technology called reflection
	/*
	 * @Autowired //qualifier when service has more than one implmentation
	 * 
	 * @Qualifier("randomFortuneService") private FortuneService fortuneService;
	 */
	
	//autowired and Qualifier with the constructor injection
    private FortuneService fortuneService;

	 @Autowired
	    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

	        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
	        
	        fortuneService = theFortuneService;
	    }
	
	public TennisCoach() {
		System.out.println(">> TennisCoach :: inside default constructor");
	}
	
	//autowired the constructor injection 
	/*
	 * @Autowired public TennisCoach(FortuneService thefortuneService) {
	 * fortuneService=thefortuneService; }
	 */
	
	//define a setter method :: autowired the setter injection
	/*
	 * @Autowired public void setFortuneService(FortuneService thefortuneService) {
	 * System.out.println("in TennisCoach :: inside the setter method");
	 * fortuneService = thefortuneService; }
	 */
	
	//custom method injection
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService service) {
	 * System.out.println("inside the crazy method"); fortuneService = service; }
	 */
	
	
	@Override
	public String getDailyWorkOut() {
		return "Play 2 set everyDay";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	/*
	 * @PostConstruct public void getInitialization() {
	 * System.out.println("initialization using the annotation"); }
	 * 
	 * @PreDestroy public void getCleanupAll() {
	 * System.out.println("Destroy Everythinggg"); }
	 */
}

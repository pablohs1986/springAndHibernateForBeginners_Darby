package springdemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;

	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "practiceeeeee";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

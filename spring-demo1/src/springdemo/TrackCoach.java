package springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("Inside method doMyStartupStuff");
	}

	public void doMyCleanUpStuff() {
		System.out.println("Inside method doMyCleanUpStuff");
	}
}

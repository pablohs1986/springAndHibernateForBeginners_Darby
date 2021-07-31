package springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	private String[] data = { "Fortune 1", "Fortune 2", "Fortune 3" };

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}

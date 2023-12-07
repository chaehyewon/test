package homework2;

/**
 * 자동차 추상클래스
 */
public abstract class Car {

	private String carNumber;
	private String owner;
	private int parkingTime = 0;

	public Car(String carNumber, String owner) {
		this.carNumber = carNumber;
		this.owner = owner;
	}

	public String getOwner() {
		return this.owner;
	}

	public String getCarNumber() {
		return this.carNumber;
	}

	abstract public void run();

}


/**
 * Class representing a  duck.
 */
public abstract class Duck {
	// References to behaviors
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	/**
	 * Constructor.
	 */
	public Duck() {
		// empty constructor
	}

	/**
	 * Perform fly.
	 */
	public void performFly() {
		flyBehavior.fly();
	}
	
	/**
	 * Perform quack.
	 */
	public void performQuack() {
		quackBehavior.quack();
	}
	
	/**
	 * Swim.
	 */
	public void swim() {
		System.out.println("All ducks float, even decoys.");
	}
	
	/**
	 * Display an output.
	 */
	public abstract void display();
}
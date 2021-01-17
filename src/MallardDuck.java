
/**
 * A mallard duck.
 */
public class MallardDuck extends Duck {

	/**
	 * Constructor.
	 */
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeek();
	}

	@Override
	public void display() {
		System.out.println("I'm a really mallard duck.");
	}
}

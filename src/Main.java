import facade.Facade;
import singleton.EagerSingleton;
import singleton.LazyHolderSingleton;
import singleton.LazySingleton;
import strategy.*;

public class Main {
	public static void main(String[] args) {
		Main.testSingleton();
		Main.testStrategy();
		Main.testFacade();
	}

	public static void testSingleton() {
		LazySingleton lazySingleton = LazySingleton.getInstance();
		System.out.println(lazySingleton);
		lazySingleton = LazySingleton.getInstance();
		System.out.println(lazySingleton);

		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		System.out.println(eagerSingleton);
		eagerSingleton = EagerSingleton.getInstance();
		System.out.println(eagerSingleton);

		LazyHolderSingleton lazyHolderSingleton = LazyHolderSingleton.getInstance();
		System.out.println(lazyHolderSingleton);
		lazyHolderSingleton = LazyHolderSingleton.getInstance();
		System.out.println(lazyHolderSingleton);
	}

	public static void testStrategy() {
		Behavior defensiveBehavior = new DefensiveBehavior();
		Behavior normalBehavior = new NormalBehavior();
		Behavior aggresiveBehavior = new AggressiveBehavior();

		Robot robot = new Robot();

		robot.setBehavior(defensiveBehavior);
		robot.move();

		robot.setBehavior(normalBehavior);
		robot.move();

		robot.setBehavior(aggresiveBehavior);
		robot.move();
	}

	private static void testFacade() {
		Facade facade = new Facade();
		facade.migrateClient("Some Name", "Some Zip");
	}
}

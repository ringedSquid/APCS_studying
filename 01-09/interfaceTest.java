public class interfaceTest {
	public interface InterfaceA {
		void methodA();
	}
	public interface InterfaceB extends InterfaceA {
		void methodB();
	}
	public class ClassA implements InterfaceA {
		public void methodA() { System.out.println("e"); }
		public void methodB() { System.out.println("e"); }
	}
	public class ClassB extends ClassA implements InterfaceB {

	}
	InterfaceB obj = new ClassA();
}

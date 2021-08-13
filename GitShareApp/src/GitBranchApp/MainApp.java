package GitBranchApp;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("1st version");
		
		Math cMath = new Math();
		System.out.println(cMath.add(10, 5));
	}

}

class Math{
	int add(int a,int b) {
		return a+b;
	}
}
package pracitce02;

public class Pracitce02 {

	public static void main(String[] args) {
		WhileTest whileTest= new WhileTest();


		boolean ret1 = false;
		boolean ret2 = false;
		do {
			System.out.println("メインdoから出力");
			ret1 = whileTest.test();
			ret2 = whileTest.test2();
		}while(!ret1 && !ret2) ;

	}
}

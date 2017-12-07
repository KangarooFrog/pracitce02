package pracitce02;

public class Pracitce02 {

	public static void main(String[] args) {
		WhileTest whileTest= new WhileTest();


		do {
			System.out.println("メインdoから出力");
		}while(!(whileTest.test() == true)&&!(whileTest.test2() == true)) ;

	}
}

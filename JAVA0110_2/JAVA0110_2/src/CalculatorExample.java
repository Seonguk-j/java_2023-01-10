
public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myClac = new Calculator();
		
		//리턴 없는 메소드는 저장할 변수가 필요 없음
		myClac.powerOn();
		
		//리턴되는 값이 메소드는 리턴되는 값을 저장할 변수(리턴되는 타입과 동일한 타입)가 필요
		int result1 = myClac.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		int x = 10;
		int y = 4;
		double result2 = myClac.devide(10, 4);
		System.out.println("result2 : " + result2);
		
		myClac.powerOff();
	}

}

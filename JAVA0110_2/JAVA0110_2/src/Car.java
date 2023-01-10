
public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		this("자가용", "은색", 250);
	}
	
	Car(String model){
		this(model, "은색", 250);
		this.model = model;
	}
	
	Car(String model, String color){
		this(model, color, 250);
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

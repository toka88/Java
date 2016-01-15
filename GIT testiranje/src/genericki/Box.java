package genericki;

public class Box<T> {

	private T t;          //Privatna promenjiva tipa kao i generickka klasa

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    
    //Kada se poziva ova metoda parametar mora biti neki tip koji je broj
    public <U extends Number> void inspect(U u){	//metoda vraca tip koji je izveden od Number
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<String> integerBox = new Box<String>();	//Kod box-a se moze bilo koji tip staviti
        integerBox.set("Tokovic Goran");
        integerBox.inspect(20d);	//Kada 
        //integerBox.inspect("some text"); // error: this is still String!
    }

}

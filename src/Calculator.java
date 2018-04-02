//for selenium
public class Calculator {
	
	//make a constructor
	
	public Calculator(){
		//whenever we run the program, the constructor would be called first
		System.out.println("Calling constructors");
	}
	
	public void add(){
        //int result =num1+num2;
        
        //return result;
		System.out.println("Adding here");
        
    }
	
	public void sub(){
        //int result =num1+num2;
        
        //return result;
		System.out.println("Subtracting here");
        
    }
	public void div(){
        //int result =num1+num2;
        
        //return result;
		System.out.println("Dividing here");
        
    }
	public void mul(){
        //int result =num1+num2;
        
        //return result;
		System.out.println("Multiplying here");
        
    }
	/*
    //parameters
    public int getSubs(int num1, int num2){
        int result =num1-num2;
        
        return result;
        
    }
    public int getMul(int num1, int num2){
        int result =num1*num2;
        
        return result;
        
    }
    public int getDiv(int num1, int num2){
        int result =num1/num2;
        
        return result;
        
    }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Calculator(); is the object
		//run only that here and the constructor would be called 
		//when program runs
		//make an object of this class to use the methods to perform task
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.div();
		calc.mul();
		
		/*new Calculator().add();
		 * new Calculator().sub();
		 * two objects created in the memory. 
		 * both with its own memory No need for this. Just 
		 * one object reference above is best practice
		 * The String class is a class with methods
		 * When file ready export as jar to organisation
		 */
	}

}

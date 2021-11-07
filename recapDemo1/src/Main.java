public class Main {

    public static void main(String[] args) {
	    int number1 = 44;
        int number2 = 56;
        int number3 = 24;
        int maxNumber = number1;
        if(maxNumber<number2){
            maxNumber = number2;
        }
        if(maxNumber<number3){
            maxNumber = number3;
        }
            System.out.println("max number is = "+maxNumber);
    }
}

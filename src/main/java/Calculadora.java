public class Calculadora {

    private long num1;

    private long num2;

    public Calculadora(long num1, long num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    public long Somar(){

        return num1 + num2;
    }


    public long Dividir (){
        if (num2 == 0)
            throw new ArithmeticException();

        return num1/num2;

    }

}

abstract class  Calculator {
    public abstract double getResult();
    public abstract void clear();
    public abstract void add(double input);
    public abstract void subtract(double input);
    public abstract void divide(double input);
    public abstract void multiply(double input);
}

class BasicCaculator extends Calculator{
    private double result;

    public BasicCaculator(){

    }

    public double getResult(){
        return result;
    }

    public void clear(){
        result = 0;
    }
    
    public void add(double input){
        result += input;
    }

    public void subtract(double input){
        result -= input;
    }

    public void divide(double input){
        result /= input;
    }

    public void multiply(double input){
        result *= input;
    }

}

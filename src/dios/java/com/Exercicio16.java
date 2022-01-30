package dios.java.com;

public class Exercicio16 {
    public static void main(String[] agrs){
    double num1=0, num2=1, num3, i=1;
    while(i <500 ){
        i++;
        num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
        if(num3 > 500){
        System.out.println(num3);}
    }
    }
}

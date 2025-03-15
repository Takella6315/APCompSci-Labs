import java.util.ArrayList;

public class test {
    public static void methodA(int value){

        if(value > 2){

            value = methodB(value);
            methodA(value/10);
            System.out.print(value);

        }
    }
    public static int methodB(int value){

        return value - 1;
    }
    

    public static void main(String args[])
    {
      Two two = new Two("C");
      System.out.println(two);
            


       }
    }
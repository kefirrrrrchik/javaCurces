package credit4;

public class Main {
    public static void main(String[] args) {
        int k=0;
        for(int number = 1; number<100000; number++)
        {
if(contain4(number) || contain13(number)) k++;
        }
        System.out.println("Номеров исключено: "+k);
    }
    public static boolean contain4(int number)
    {
        while(number>0)
        {
            int lastDigit = number%10;
            if(lastDigit==4) return true;
            number = number / 10;
        }
        return false;
    }

    public static boolean contain13(int number){
        while (number>10){
            int last = number%100;
            if(last == 13) return true;
            number/=10;
        }
        return false;
    }


    }


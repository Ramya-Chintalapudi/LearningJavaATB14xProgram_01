package Ex_004_JavaPrograms;

public class Lab003_ReverseNumber {
    public static void main (String[] args){

        int number1 = 12345; //number1.length()
        int temp = number1;
        int reverse = 0;
        int rem = 0;
        int length = 5;

        /*for (int i = 1; i<=length; i++){ // i = 2
            rem = temp%10; //12345%10 = 5
            reverse = reverse*10+rem;
            temp = temp/10;
        }*/
        while (temp>0){
            rem = temp%10; //12345%10 = 5
            reverse = reverse*10+rem;
            temp = temp/10;
        }
        System.out.println(reverse);
    }
}

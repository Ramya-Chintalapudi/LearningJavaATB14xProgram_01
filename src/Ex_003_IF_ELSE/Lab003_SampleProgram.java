package Ex_003_IF_ELSE;

public class Lab003_SampleProgram {
    public static void main(String[] args) {

        // above 18, Yes he can Vote
        // below 18, No he can't vote
        String age = args[0];
        int number = Integer.parseInt(age);

        if (number>18){
            System.out.println("Yes, he can vote");
        }
        else {
            System.out.println("No he can't vote");
        }
    }

}

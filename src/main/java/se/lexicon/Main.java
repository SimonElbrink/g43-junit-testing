package se.lexicon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 18;

        boolean isAdult = isAdult(age);

        System.out.println("Im an adult: " + isAdult);
    }

    /**
     * Checking whether adult or not.
     * The method considers you as an adult if your age is 18 and above.
     * @param age
     * @return true if age is 18 or above. otherwise returns false.
     */
    public static boolean isAdult(int age){
        if(age >= 18) {
            return true;
        }else {
            return false;
        }
    }




}


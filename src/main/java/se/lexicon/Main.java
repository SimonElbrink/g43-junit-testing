package se.lexicon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 18;

        boolean isAdult = isAdult(age);

        System.out.println("Im an adult: " + isAdult);
    }

    public static boolean isAdult(int age){
        if(age >= 18) {
            return true;
        }else {
            return false;
        }
    }




}


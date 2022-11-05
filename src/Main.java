import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Dog dog1=new Dog(6,Color.BROWN,"Rex");
        System.out.println(dog1.getInfo());
        System.out.println( dog1.eat());
        System.out.println(dog1.makeVoice());

        System.out.println("______________________");

        FightingDog karatai=new FightingDog(5,Color.BLACK,"Karatai");
        System.out.println(karatai.getInfo());
        System.out.println(karatai.makeVoice());
        System.out.println("______________________");

        FightingDog akmoinok=new FightingDog(2,Color.WHITE,"Akmoinok",4);
        System.out.println(akmoinok.getInfo());
        System.out.println(akmoinok.makeVoice());

    }
}
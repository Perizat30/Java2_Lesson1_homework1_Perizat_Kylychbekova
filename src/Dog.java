public class Dog extends Animal{

    private String name;


    public Dog(int age, Color color, String name) {
        super(age, color);
        this.name = name;

    }

    public Dog(int age, Color color) {
        super(age, color);
    }

    public String getName() {
        return name;
    }





    public  String makeVoice(){

        return "Gav gav";
    }

    public final String eat(){
        return "Dog  eats meat";
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nName: "+name;
    }
}

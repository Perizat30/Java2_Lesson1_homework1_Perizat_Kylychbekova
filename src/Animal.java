public class Animal {
    private int age;
    private Color color;



    public Animal(int age, Color color) {
        this.age = age;
        this.color = color;

    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

public String getInfo(){
      return "Age: "+ age+  "\nColor:  "+ color;
    }
}

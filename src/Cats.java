public class Cats {

    private String name;
    private String color;
    private int age;
    private static int catCount;

    public Cats(String name){
        this.name = name;
        this.color = "серый";
        this.age = 0;
        catCount++;
    }
    public Cats(String name, String color) {
        this.name = name;
        this.color = color;
        this.age = 0;
        catCount++;
    }
    public Cats(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        catCount++;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
    public static int getAllCatsCount() { return catCount; }
}
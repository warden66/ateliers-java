public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal( String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public Animal(){}
    void displayAnimal()
    {
        System.out.println("My animal name is:"+ name + " age is:"+ age +" family is:"+ family + "is it a mammal:"+ isMammal);
    }
    public String getName() {
        return name;
    }
}

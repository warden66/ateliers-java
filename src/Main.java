// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i;
        int n=0;
        int s=0;
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       /*Animal lion = new Animal () ;
       lion.age = 5;
       lion.name = "darko" ;
       lion.isMammal = true;
       lion.family = "felines";
       System.out.println(lion);
       Zoo Z = new Zoo () ;
       Z.name = "downtown";
       Z.city = "quebec" ;
       Z.nbrcages = 1;
       Z.animals = new Animal [Z.nbrcages];
       System.out.println(Z);*/
       Animal lion= new Animal("felines", "darko",5,true);
       Animal duck= new Animal("felines", "darko",5,true);
       Animal hippo= new Animal("hippo","obese",40,true);
       Animal cub= new Animal("felines","dagon",9,true);
       System.out.println(lion);
       lion.displayAnimal();
       Zoo Z = new Zoo("downtown","quebec",25);
       //System.out.println(Z.displayZoo());

        System.out.println("-------------------------------");
        System.out.println(Z);
        System.out.println(Z.toString());
        /*for (i=0;i<23;i++) {
            Z.addAnimal(lion);
            n++;
        }*/
        Z.addAnimal(lion);
        Z.addAnimal(hippo);
        Z.addAnimal(cub);
        Z.addAnimal(duck);
        Z.displayZoo();
        Z.DisplayAnimals(n);
        //s= Z.searchanimal(duck);
        //System.out.println(s);

    }
}
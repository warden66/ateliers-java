public class Zoo {
    String name;
    String city;
    int nbrcages;
    Animal [] animals;
    int nbranimals=0;
    public Zoo () {}
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrcages = nbrCages;
    }
    void displayZoo()
    {
        System.out.println("My Zoo name is:"+ name + " City is:"+ city +" nombre de cages:"+ nbrcages);
    }
boolean addAnimal(Animal animal) {
        int j;
        j=searchanimal(animal);
    if ( nbranimals > nbrcages) {
        System.out.println("tout les cages sont occupes");
        return false;
    }
    else if (j!=-1) {
        System.out.println("l animal existe deja");
        return false;
    }
    else {
        animals[nbranimals] = animal;
        nbranimals++;
        System.out.println("succes");
        return true;
    }
}
void  DisplayAnimals(int n)
{int i;
    for (i=0;i<n;i++)
    {
        //animals[i].getName();
        animals[i].displayAnimal();
    }
}
int searchanimal(Animal animal) {
    int j = 0;
    boolean test = false;
    while (test == false && j < 25) {
        if (animals[j].name == animal.name) {
            test = true;
        } else
            j++;
    }
    if (test == false) {
        System.out.println("l animal existe deja");
        return -1;
    }
    else
        return j;
}
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }
}

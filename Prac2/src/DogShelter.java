import java.util.ArrayList;

public class DogShelter {

    private ArrayList<Dog> dogs = new ArrayList<>();


    public void addDogs(Dog[] dogs){
        for (int i = 0; i < dogs.length; i++){
            this.dogs.add(dogs[i]);
        }
    }
}

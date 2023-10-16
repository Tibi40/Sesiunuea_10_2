import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class petShopRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String>dogList = new ArrayList<>();
        dogList.add("Bobita");
        dogList.add("Azorel");
        dogList.add("Amerei");

        Animal dog = new Animal();


        /*mai sus am definit obiectele
        apoi, am definit valorea din paranteza pentru fiecare carecteristica
        de exemplu: breed, Price, Age
        valori pe care le aratam datorita get-urilor si set-urilot definite inainte
        (geturi si seturi pentru fiecare caracteristica
         */
        dog.setPrice(100);
        dog.setBreed("Alsacian");
        dog.setAge(2);
        /* prin dog.setAge() => pentru obiectul dog (folosind set-rui ca sa setam si get-uri ca
        sa afisam) atribuim valoarea 2 pentru Age
         */
        dog.setAnimalType("Dog");
        dog.setStock(9);
        dog.setDogList(dogList);

        List<String>catList = new ArrayList<>();
        catList.add("Felix");
        catList.add("Duta");
        catList.add("Kali");
        Animal cat = new Animal();
        cat.setPrice(200);
        cat.setAge(4);
        cat.setBreed("Persana");
        cat.setStock(5);
        cat.setAnimalType("Cat");
        cat.setCatList(catList);

        petShopService service = new petShopService();
        service.getAnimalType(dog);
        service.getAnimalType(cat);
    }
}

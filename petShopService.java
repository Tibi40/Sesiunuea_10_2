public class petShopService {

    public String getAnimalType(Animal animal) { //Din clasa Animal -> se selecteaza

        //In switch (care tine loc de if), se foloseste
        //case "Dog" -> (in loc de if (animalType == Dog)
        switch(animal.getAnimalType()) {
            case "Dog" -> System.out.println("Dog stock: " + animal.getDogList().size());
            case "Cat" -> System.out.println("Cat stock: " + animal.getCatList().size());
            default -> System.out.println("We don't have the requested animal!");

        }

        return null;
    }
}

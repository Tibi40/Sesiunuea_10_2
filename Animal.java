import java.util.List;

//Cream un petshop
public class Animal {


        /* De regula variabilele incep cu litera mica, deoarece, daca incepi cu litera mre
        s-ar putea sa introduci o clasa sau altceva
         */

        /* setez o variabile de tip private, pentru a o putea accesa doar din programul meu

         */

         private String breed;

         private String animalType;

         private int age;
         private int stock;
         private double price;

         List<String> dogList;
         List<String> catList;

         /*public List<String> getStockList() {
            return stockList;
        }

         public void getStockList(List<String> stocklist) {
             this.stockList = stockList;
        }*/

        /*get-urile si set-urile ne ajuta sa definim valori pentru variabilele de mai sus */

        public List<String> getDogList() {
            return dogList;
        }
        public void setDogList(List<String> dogList) {
            this.dogList = dogList;
        }
        public List<String> getCatList() {
            return catList;
        }
        public void setCatList(List<String> catList) {
            this.catList = catList;
        }
        public String getAnimalType() {
            return animalType;
        }

        public void setAnimalType(String animalType) {
            this.animalType = animalType;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public int age() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int stock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        /* daca nu folosesc "void" trebuie sa folosesc
        get
         */

        public double price() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }


}

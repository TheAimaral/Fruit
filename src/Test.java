public class Test {
    public static void main(String[] args) {
        Box<String, Banana> bananaBox = new Box<>(new Banana(), "banana");
        bananaBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>(new Apple(), "apple");
        appleBox.getObj().printClass();

        Box<String, Fruit> fruitBox = new Box<>(new Fruit(), "fruit");
        fruitBox.getObj().printClass();

        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>(new Cabbage(), "cabbage");
        cabbageBox.getObj().printClass();
    }
}
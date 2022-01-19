public class VegetableBox<K, T extends Vegetable> {
    private T obj;
    private K obj2;

    public VegetableBox(T obj, K obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public T getObj() {
        return obj;
    }

    public K getObj2() {
        return obj2;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void setObj2(K obj2) {
        this.obj2 = obj2;
    }
}
package lessons.lesson16.generic;

public class Box<T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public int sum(){
        return item.intValue() * 42 + 10;
    }
}

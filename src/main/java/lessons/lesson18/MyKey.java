package lessons.lesson18;

import java.util.Objects;

public class MyKey {
    private String name;
    private int id;

    public MyKey(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Calling equals() for key: " + o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return id == myKey.id &&
                Objects.equals(name, myKey.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode method invoked");
        return id;
    }
}

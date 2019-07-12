package ua.org.oa.evlashdv.lecture7;

public class Shirt extends Clothing {
    private int size;

    public Shirt(String name, int price, int size) {
        super(name, price);
        setSize(size);
    }

    @Override
    public void clean() {
        super.clean();
        size--;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Shirt shirt = (Shirt) o;

        return size == shirt.size;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", size=" + size +
                '}';
    }
}

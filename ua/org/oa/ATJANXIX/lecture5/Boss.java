package ua.org.oa.evlashdv.lecture5;

public class Boss {
    private static Boss instance;
    private String name;

    public static Boss newInstance(String name) {
        if (instance == null) {
            instance = new Boss(name);
        } else {
            instance.setName(name);
        }
        return instance;
    }

    private Boss(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                '}';
    }
}

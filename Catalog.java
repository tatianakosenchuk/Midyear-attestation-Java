public class Catalog {
    private int id;
    private String name;
    private int frequency;

    public Catalog(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public String output() {
        return String.format("%d, %s, %d", getId(), getName(), getFrequency());
    }
    
}

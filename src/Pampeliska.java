import java.util.Objects;

public class Pampeliska extends Flower{
    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    @Override
    public String toString() {
        return "Pampeliska";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower flower)) return false;
        return Double.compare(flower.price, price) == 0 && Double.compare(flower.neededArea, neededArea) == 0 && Double.compare(flower.chanceOfGrowth, chanceOfGrowth) == 0 && Objects.equals(name, flower.name);
    }


}

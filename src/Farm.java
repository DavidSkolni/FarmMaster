import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> flowers;
    private ArrayList<Animal> animals;
    private int limit;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Farm(int limit, int size){
        flowers = new ArrayList<>();
        animals = new ArrayList<>();
        this.limit = limit;
        this.size = size;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addFlower(Flower flower){
        int count = 0;
        int area = 0;
        for(Flower flower1: flowers){
            if(flower1.toString().equals(flower.toString())){
                count++;
            }
            area += flower1.neededArea;
        }
        if(count==limit || area + flower.neededArea > size){
            throw new IllegalArgumentException();
        }
        flowers.add(flower);
    }

    public void addAnimal(Animal animal){
        if(animal.size == Size.SMALL){

        }
        animals.add(animal);
    }
    public void water(Flower flower){
        flowers.get(flowers.indexOf(flower)).chanceOfGrowth+=5;
    }




}

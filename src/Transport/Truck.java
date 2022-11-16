package Transport;

public class Truck extends Transport implements Competing {

    private Weight weight;

    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение");

    }

    @Override
    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " заканчивает движение");

    }

    @Override
    public boolean diagnostic() {
        return Math.random() > 0.75;
    }

    //@Override
    public void printType() {
        if(weight==null) {
            System.out.println("Недостаточно информации");
        } else {
            String from = weight.getFrom() == null ? " " : "от " + weight.getFrom() + " ";
            String to = weight.getTo() == null ? " " : "от " + weight.getTo();
            System.out.println("Грузоподъемность: " + from + to);
        }

    }

    @Override
    public void pitStop() {
        System.out.println(this.getBrand() + " " + this.getModel() + " уходит на пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - лучшее время круга");
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        System.out.println(this.getBrand() + " " + this.getModel() + " достигает максимальной скорости");
        return 0;
    }



    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                '}';
    }
}
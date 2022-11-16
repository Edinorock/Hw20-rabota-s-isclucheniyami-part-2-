package Transport;

public class Bus extends Transport implements  Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        setCapacity(capacity);
    }

    public void setCapacity(Capacity capacity) {

        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    @Override
    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение");

    }

    @Override
    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " начинает движение");

    }

    @Override
    public boolean diagnostic() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требует");
        return true;
    }

    public void printType() {
        if(capacity==null) {
            System.out.println("Недостаточно информации");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom()+" до " + capacity.getTo() + " человек");
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



}
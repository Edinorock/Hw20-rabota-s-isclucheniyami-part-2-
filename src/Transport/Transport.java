package Transport;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;

    public String getBrand() {
        return brand;
    }

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "Недостаточно информации";
        } else {
            this.brand = brand;
        }
        if (model == null && model.isEmpty()) {
            this.model = "Недостаточно информации";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 00;
        } else {
            this.engineVolume = engineVolume;
        }
    }


    public void setBrand(String brand) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "Недостаточно информации";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null && model.isEmpty()) {
            this.model = "Недостаточно информации";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 00;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract boolean diagnostic();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
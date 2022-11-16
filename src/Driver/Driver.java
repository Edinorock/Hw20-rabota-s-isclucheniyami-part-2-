package Driver;
import Transport.Transport;


abstract class Driver<T extends Transport>{

    private String fullNameDriver;
    private String license;
    private int driverExperience;


    public Driver(String fullNameDriver, boolean license, int driverExperience) {
        setFullNameDriver(fullNameDriver);
        setLicense(String.valueOf(license));
        setDriverExperience(driverExperience);

    }

    public abstract void start(T transport);


    public abstract void stop(T transport);


    public abstract void refill(T transport);


    public String getFullNameDriver() {

        return fullNameDriver;
    }

    public void setFullNameDriver(String fullNameDriver) {

        if (fullNameDriver == null || fullNameDriver.isEmpty()) {
            this.fullNameDriver = "Нет информации";
        } else {
            this.fullNameDriver = fullNameDriver;
        }
    }


    public String isLicense() {

        return license;
    }

    public void setLicense(String license) {
        if(license == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.license = license;
    }

    public int getDriverExperience() {

        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        if (driverExperience <= 0) {
            this.driverExperience = 0;
        } else {
            this.driverExperience = driverExperience;
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullNameDriver='" + fullNameDriver + '\'' +
                ", license=" + license +
                ", driverExperience=" + driverExperience +
                '}';
    }

}
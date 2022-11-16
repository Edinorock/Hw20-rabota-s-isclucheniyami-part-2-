package Driver;

import Transport.Bus;

public class DriverD extends Driver <Bus>{

    public DriverD(String fullNameDriver, boolean license, int driverExperience) {
        super(fullNameDriver, license, driverExperience);
    }

    @Override
    public void start(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.startMoving();
    }

    @Override
    public void stop(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.finishMoving();
    }

    @Override
    public void refill(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.pitStop();
    }

    public void getCar(Bus buses) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет транспортным средством " + buses.getBrand() + " "
                + buses.getModel() + " и будет участвовать в заезде");
    }
}
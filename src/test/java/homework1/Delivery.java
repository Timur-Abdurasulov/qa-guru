package homework1;

import org.junit.jupiter.api.Test;

public class Delivery {
    @Test
    public void usingObjects() {

        Truck volvo = new Truck();
        volvo.setBrandName("Volvo");
        volvo.setWheelbaseConfiguration("4x4");
        volvo.setHorsePower(480);
        volvo.setTransmission("13 speed gearbox");
        volvo.setMaxSpeed(150);
        volvo.setFuelCapacity(900);
        volvo.setFuelConsumption("43 L per 100 km");
        volvo.setMaxLoad(60);

        Truck scania = new Truck();
        scania.setBrandName("Scania");
        scania.setWheelbaseConfiguration("6x4");
        scania.setHorsePower(540);
        scania.setTransmission("16 speed gearbox");
        scania.setMaxSpeed(190);
        scania.setFuelCapacity(1200);
        scania.setFuelConsumption("52 L per 100 km");
        scania.setMaxLoad(80);

        Truck man = new Truck();
        man.setBrandName("Man");
        man.setWheelbaseConfiguration("4x2");
        man.setHorsePower(450);
        man.setTransmission("12 speed gearbox");
        man.setMaxSpeed(125);
        man.setFuelCapacity(700);
        man.setFuelConsumption("34 L per 100 km");
        man.setMaxLoad(40);

        Train wdm7 = new Train();
        wdm7.setModel("WDM 7");
        wdm7.setCountryOfOrigin("India");
        wdm7.setHorsePower(2000);
        wdm7.setMaxSpeed(105);
        wdm7.setFuelCapacity(5000);
        wdm7.setFuelConsumption("700 L per 100 km");
        wdm7.setMaxLoad(2500);

        Train wdg3a = new Train();
        wdg3a.setModel("WDG-3A");
        wdg3a.setCountryOfOrigin("India");
        wdg3a.setHorsePower(3100);
        wdg3a.setMaxSpeed(110);
        wdg3a.setFuelCapacity(6000);
        wdg3a.setFuelConsumption("900 L per 100 km");
        wdg3a.setMaxLoad(4400);

        System.out.println("Trucks: ");
        System.out.println();
        System.out.println("Truck #1");
        System.out.println("Brand: " + volvo.getBrandName());
        System.out.println("Wheelbase configuration: " + volvo.getWheelbaseConfiguration());
        System.out.println("Horsepower: " + volvo.getHorsePower());
        System.out.println("Transmission: " + volvo.getTransmission());
        System.out.println("Max speed (km/h): " + volvo.getMaxSpeed());
        System.out.println("Fuel capacity (liters): " + volvo.getFuelCapacity());
        System.out.println("Fuel consumption: " + volvo.getFuelConsumption());
        System.out.println("Max load (tons): " + volvo.getMaxLoad());
        System.out.println();
        System.out.println("Truck #2");
        System.out.println("Brand: " + scania.getBrandName());
        System.out.println("Wheelbase configuration: " + scania.getWheelbaseConfiguration());
        System.out.println("Horsepower: " + scania.getHorsePower());
        System.out.println("Transmission: " + scania.getTransmission());
        System.out.println("Max speed (km/h): " + scania.getMaxSpeed());
        System.out.println("Fuel capacity (liters): " + scania.getFuelCapacity());
        System.out.println("Fuel consumption: " + scania.getFuelConsumption());
        System.out.println("Max load (tons): " + scania.getMaxLoad());
        System.out.println();
        System.out.println("Truck #3");
        System.out.println("Brand: " + man.getBrandName());
        System.out.println("Wheelbase configuration: " + man.getWheelbaseConfiguration());
        System.out.println("Horsepower: " + man.getHorsePower());
        System.out.println("Transmission: " + man.getTransmission());
        System.out.println("Max speed (km/h): " + man.getMaxSpeed());
        System.out.println("Fuel capacity (liters): " + man.getFuelCapacity());
        System.out.println("Fuel consumption: " + man.getFuelConsumption());
        System.out.println("Max load (tons): " + man.getMaxLoad());
        System.out.println();
        System.out.println("Trains: ");
        System.out.println();
        System.out.println("Train #1");
        System.out.println("Model: " + wdm7.getModel());
        System.out.println("Country of origin: " + wdm7.getCountryOfOrigin());
        System.out.println("Horsepower: " + wdm7.getHorsePower());
        System.out.println("Max speed (km/h): " + wdm7.getMaxSpeed());
        System.out.println("Fuel capacity (liters): " + wdm7.getFuelCapacity());
        System.out.println("Fuel consumption: " + wdm7.getFuelConsumption());
        System.out.println("Max load (tons): " + wdm7.getMaxLoad());
        System.out.println();
        System.out.println("Train #2");
        System.out.println("Model: " + wdg3a.getModel());
        System.out.println("Country of origin: " + wdg3a.getCountryOfOrigin());
        System.out.println("Horsepower: " + wdg3a.getHorsePower());
        System.out.println("Max speed (km/h): " + wdg3a.getMaxSpeed());
        System.out.println("Fuel capacity (liters): " + wdg3a.getFuelCapacity());
        System.out.println("Fuel consumption: " + wdg3a.getFuelConsumption());
        System.out.println("Max load (tons): " + wdg3a.getMaxLoad());
    }

    @Test
    public void truckFuelConsumption() {
        String route = "Riga (LV) - Milan (IT)";
        int distance = 2127;
        String volvoTruck = "Volvo";
        int volvoFuelCapacity = 900;
        int volvoFuelConsumption = 43;
        String scaniaTruck = "Scania";
        int scaniaFuelCapacity = 1200;
        int scaniaFuelConsumption = 52;
        String manTruck = "Man";
        int manFuelCapacity = 700;
        int manFuelConsumption = 34;

        System.out.println();
        System.out.println("Truck fuel consumption calculations");
        System.out.println();
        System.out.println("Route: " + route);
        System.out.println("Distance (km): " + distance);
        System.out.println();
        System.out.println("Truck: " + volvoTruck);
        System.out.println("Fuel capacity (liters): " + volvoFuelCapacity);
        System.out.println("Required fuel (liters): " + (distance / 100) * volvoFuelConsumption);
        System.out.println("Refueling stops: " + ((distance / 100) * volvoFuelConsumption) / volvoFuelCapacity);
        System.out.println();
        System.out.println("Truck: " + scaniaTruck);
        System.out.println("Fuel capacity (liters): " + scaniaFuelCapacity);
        System.out.println("Required fuel (liters): " + (distance / 100) * scaniaFuelConsumption);
        System.out.println("Refueling stops: " + ((distance / 100) * scaniaFuelConsumption) / scaniaFuelCapacity);
        System.out.println();
        System.out.println("Truck: " + manTruck);
        System.out.println("Fuel capacity (liters): " + manFuelCapacity);
        System.out.println("Required fuel (liters): " + (distance / 100) * manFuelConsumption);
        System.out.println("Refueling stops: " + ((distance / 100) * manFuelConsumption) / manFuelCapacity);
    }

    @Test
    public void trainFuelConsumption() {
        String route = "Riga (LV) - Milan (IT)";
        int distance = 1638;
        String wdm7Train = "WDM 7";
        int wdm7FuelCapacity = 5000;
        int wdm7FuelConsumption = 700;
        String wdg3aTrain = "WDG-3A";
        int wdg3aFuelCapacity = 6000;
        int wdg3aFuelConsumption = 900;

        System.out.println();
        System.out.println("Train fuel consumption calculations");
        System.out.println();
        System.out.println("Route: " + route);
        System.out.println("Distance (km): " + distance);
        System.out.println();
        System.out.println("Train: " + wdm7Train);
        System.out.println("Fuel capacity (liters): " + wdm7FuelCapacity);
        System.out.println("Required fuel (liters): " + (distance / 100) * wdm7FuelConsumption);
        System.out.println("Refueling stops: " + ((distance / 100) * wdm7FuelConsumption) / wdm7FuelCapacity);
        System.out.println();
        System.out.println("Train: " + wdg3aTrain);
        System.out.println("Fuel capacity (liters): " + wdg3aFuelCapacity);
        System.out.println("Required fuel (liters): " + (distance / 100) * wdg3aFuelConsumption);
        System.out.println("Refueling stops: " + ((distance / 100) * wdg3aFuelConsumption) / wdg3aFuelCapacity);
    }

    @Test
    public void oneTonDeliveryCost() {
        double fuelCost = 1.9;
        int truckDistance = 2127;
        int trainDistance = 1638;

        int volvoFuelConsumption = 43;
        double volvoPricePerOneKm = (volvoFuelConsumption * fuelCost / 100);
        double volvoPricePerTrip = (volvoPricePerOneKm * truckDistance);
        double volvoPricePerOneKg = (volvoPricePerOneKm * 4);
        double volvoPricePerOneTon = (volvoPricePerOneKg * 1000);
        double volvoTotalPricePerOneTon = (volvoPricePerTrip + volvoPricePerOneTon);

        int scaniaFuelConsumption = 52;
        double scaniaPricePerOneKm = (scaniaFuelConsumption * fuelCost / 100);
        double scaniaPricePerTrip = (scaniaPricePerOneKm * truckDistance);
        double scaniaPricePerOneKg = (scaniaPricePerOneKm * 4);
        double scaniaPricePerOneTon = (scaniaPricePerOneKg * 1000);
        double scaniaTotalPricePerOneTon = (scaniaPricePerTrip + scaniaPricePerOneTon);

        int manFuelConsumption = 34;
        double manPricePerOneKm = (manFuelConsumption * fuelCost / 100);
        double manPricePerTrip = (manPricePerOneKm * truckDistance);
        double manPricePerOneKg = (manPricePerOneKm * 4);
        double manPricePerOneTon = (manPricePerOneKg * 1000);
        double manTotalPricePerOneTon = (manPricePerTrip + manPricePerOneTon);

        int wdm7FuelConsumption = 700;
        double wdm7PricePerOneKm = (wdm7FuelConsumption * fuelCost / 100);
        double wdm7PricePerTrip = (wdm7PricePerOneKm * trainDistance);
        double wdm7PricePerOneKg = (wdm7PricePerOneKm * 4);
        double wdm7PricePerOneTon = (wdm7PricePerOneKg * 1000);
        double wdm7TotalPricePerOneTon = (wdm7PricePerTrip + wdm7PricePerOneTon);

        int wdg3aFuelConsumption = 900;
        double wdg3aPricePerOneKm = (wdg3aFuelConsumption * fuelCost / 100);
        double wdg3aPricePerTrip = (wdg3aPricePerOneKm * trainDistance);
        double wdg3aPricePerOneKg = (wdg3aPricePerOneKm * 4);
        double wdg3aPricePerOneTon = (wdg3aPricePerOneKg * 1000);
        double wdg3aTotalPricePerOneTon = (wdg3aPricePerTrip + wdg3aPricePerOneTon);

        System.out.println();
        System.out.println("One ton delivery cost calculations");
        System.out.println();
        System.out.println("Trucks");
        System.out.println();
        System.out.println("Volvo");
        System.out.println("One ton transportation price (€): " + volvoTotalPricePerOneTon);
        System.out.println();
        System.out.println("Scania");
        System.out.println("One ton transportation price (€): " + scaniaTotalPricePerOneTon);
        System.out.println();
        System.out.println("Man");
        System.out.println("One ton transportation price (€): " + manTotalPricePerOneTon);
        System.out.println();
        System.out.println("Trains");
        System.out.println();
        System.out.println("WDM 7");
        System.out.println("One ton transportation price (€): " + wdm7TotalPricePerOneTon);
        System.out.println();
        System.out.println("WDG-3A");
        System.out.println("One ton transportation price (€): " + wdg3aTotalPricePerOneTon);
        System.out.println();

        double truckAveragePrice = ((volvoTotalPricePerOneTon + scaniaTotalPricePerOneTon + manTotalPricePerOneTon) / 3);
        double trainAveragePrice = ((wdm7TotalPricePerOneTon + wdg3aTotalPricePerOneTon) / 2);

        if (truckAveragePrice < trainAveragePrice) {
            System.out.println("The best transportation way is Truck");
        }
        if (truckAveragePrice > trainAveragePrice) {
            System.out.println("The best transportation is Train");
        }
    }
}

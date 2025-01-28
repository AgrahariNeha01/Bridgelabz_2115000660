public class UnitConverter {
    
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double m) {
        double meters2feet = 3.28084;
        return m * meters2feet;
    }

    public static double convertFeetToMeters(double ft) {
        double feet2meters = 0.3048;
        return ft * feet2meters;
    }
}


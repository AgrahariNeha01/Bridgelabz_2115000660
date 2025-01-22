public class VOE {
    public static void main(String[] args) {
        int radius_earth_km=6378;
        double radius_to_miles=(double)radius_earth_km*1.6;
        double PI=3.14;
        double volume_km=(double)(4/3) * PI* Math.pow(radius_earth_km,3);
        double volume_miles=Math.pow(radius_to_miles,3)*(4/3)*PI;
        System.out.println("The volume of earth in cubic kilometers is "+ volume_km+ " and cubic miles is " + volume_miles);

    }
}

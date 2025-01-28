
public class P18 {

    public static double convFtoC(double f) {
        double f2c = (f - 32) * 5 / 9;
        return f2c;
    }

    public static double convCtoF(double c) {
        double c2f = (c * 9 / 5) + 32;
        return c2f;
    }

    public static double convPtoK(double p) {
        double p2k = 0.453592;
        return p * p2k;
    }

    public static double convKtoP(double k) {
        double k2p = 2.20462;
        return k * k2p;
    }

    public static double convGtoL(double g) {
        double g2l = 3.78541;
        return g * g2l;
    }

    public static double convLtoG(double l) {
        double l2g = 0.264172;
        return l * l2g;
    }
}




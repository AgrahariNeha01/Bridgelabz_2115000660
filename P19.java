import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";
}

class P19 {
    public static void main(String[] args) throws Exception {
        Field f = Configuration.class.getDeclaredField("API_KEY");
        f.setAccessible(true);

        System.out.println("Original API_KEY: " + f.get(null));
        f.set(null, "NEW_KEY");
        System.out.println("Modified API_KEY: " + f.get(null));
    }
}

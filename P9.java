import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class P9 {
    @MaxLength(10)
    String username;

    P9(String username) throws Exception {
        this.username = username;
        validate();
    }

    void validate() throws Exception {
        Field f = P9.class.getDeclaredField("username");
        if (f.isAnnotationPresent(MaxLength.class)) {
            int max = f.getAnnotation(MaxLength.class).value();
            if (username.length() > max) {
                throw new IllegalArgumentException("Username exceeds max length of " + max);
            }
        }
    }

    public static void main(String[] args) {
        try {
            new P9("Neha123");
            new P9("LongUsername123"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

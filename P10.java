import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class P10 {
    private String userRole;

    P10(String userRole) {
        this.userRole = userRole;
    }

    @RoleAllowed("ADMIN")
    void adminTask() {
        System.out.println("Admin task executed!");
    }

    void execute(String methodName) throws Exception {
        Method m = P10.class.getDeclaredMethod(methodName);
        if (m.isAnnotationPresent(RoleAllowed.class)) {
            String requiredRole = m.getAnnotation(RoleAllowed.class).value();
            if (!userRole.equals(requiredRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }
        m.invoke(this);
    }

    public static void main(String[] args) throws Exception {
        P10 adminUser = new P10("ADMIN");
        P10 normalUser = new P10("USER");

        adminUser.execute("adminTask");
        normalUser.execute("adminTask");
    }
}

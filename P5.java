import java.util.*;

class University {
    String n;
    List<Department> dpts = new ArrayList<>();

    University(String n) {
        this.n = n;
    }

    void addDept(Department d) {
        dpts.add(d);
    }

    void removeDept(Department d) {
        dpts.remove(d);
    }

    void showDepartments() {
        for (Department d : dpts) {
            System.out.println("Department: " + d.n);
        }
    }
}

class Department {
    String n;
    List<Faculty> facs = new ArrayList<>();

    Department(String n) {
        this.n = n;
    }

    void addFaculty(Faculty f) {
        facs.add(f);
    }

    void showFaculties() {
        for (Faculty f : facs) {
            System.out.println("Faculty: " + f.n);
        }
    }
}

class Faculty {
    String n;

    Faculty(String n) {
        this.n = n;
    }
}

class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String uniName = sc.nextLine();
        University uni = new University(uniName);

        System.out.print("Enter number of departments in " + uniName + ": ");
        int deptCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < deptCount; i++) {
            String deptName = sc.nextLine();
            Department dept = new Department(deptName);

            System.out.print("Enter number of faculty members in " + deptName + ": ");
            int facultyCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < facultyCount; j++) {
                String facultyName = sc.nextLine();
                Faculty fac = new Faculty(facultyName);
                dept.addFaculty(fac);
            }

            uni.addDept(dept);
        }

        System.out.println("\nUniversity Departments:");
        uni.showDepartments();

        System.out.println("\nFaculty Members in Departments:");
        for (Department dept : uni.dpts) {
            dept.showFaculties();
        }

        sc.close();
    }
}

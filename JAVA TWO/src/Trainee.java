public class Trainee {
       public static final String COHORT_CODE = "CHN19AJ020";
       public String name;
       public int empId;

       public Trainee(String name, int empId) {
              super();
              this.name = name;
              this.empId = empId;
       }

       public Trainee() {
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public int getEmpId() {
              return empId;
       }

       public void setEmpId(int empId) {
              this.empId = empId;
       }

       public static String getCohortCode() {
              return COHORT_CODE;
       }

       public void display() {
              
              System.out.println(+getEmpId() + getName() + COHORT_CODE + "\n");
       }

}


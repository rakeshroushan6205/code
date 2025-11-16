import java.util.*;
class InsertObjectInArrayList {
    
    public static class Employee {
        private int id;
        private String name;
        private String dept;
        private int salary;

        public Employee() {

        }

           public  Employee(int id, String name, String dept, int salary) {
            super();
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.salary = salary;

        }

        public void setid(int id) {
            this.id = id;
        }

        public int getid() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public String getDept() {
            return dept;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            
            return   id + " "+ name+ " "+dept+ " "+salary;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> empDetail = new ArrayList<>();
        System.out.println("Enter number to be insert : ");
        int n = scan.nextInt();

       for(int i= 0;i<n;i++){
        String s = scan.next();
        String[] arr = s.split(",");
        int id = 1001+i;
        String name = arr[0];
        String dept = arr[1];
        int salary = Integer.parseInt(arr[2]);
        
        Employee e = new Employee(id,name,dept,salary);
        empDetail.add(e);
       }

       for(Employee emp:empDetail){
        System.out.println(emp);
       }
    } 
}

public class EmployeeClass {
    String name;
    int age;
    String city;
    //boolean isPermanent;

    public static void main(String[] args) {
        EmployeeClass obj = new EmployeeClass();
        obj.name = "Tom";
        obj.age = 32;
//        obj.salary = 123000;
//        obj.isPermanent = true;

       // System.out.println(obj.name+","+obj.age+","+obj.salary+","+obj.isPermanent);
        EmployeeClass obj1 = new EmployeeClass();
        System.out.println(obj1.name);
        obj1.name = "Jeshmin";
        System.out.println(obj1.name);
        //obj1 = null;
       // System.out.println(obj1.name);
       // System.out.println(new EmployeeClass().name = "Anna");

        EmployeeClass e1 = new EmployeeClass();
        e1.name = "Arti";
        e1.age = 25;
        e1.city = "Pune";

        EmployeeClass e2 = new EmployeeClass();
        e2.name = "Kavita";
        e2.age = 35;
        e2.city = "Bangalore";

        EmployeeClass e3 = new EmployeeClass();
        e3.name = "Rimjhim";
        e3.age = 29;
        e3.city = "LA";

        System.out.println(e1.name+", "+e1.age+", "+e1.city);
        System.out.println(e2.name+", "+e2.age+", "+e2.city);
        System.out.println(e3.name+", "+e3.age+", "+e3.city);

        e1 = e2 = e3;
        System.out.println(e1.name+", "+e1.age+", "+e1.city);//Rimjhim, 29, LA
    }
}

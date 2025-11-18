package interfacetopic;

public class ChildClass extends ParentClass  {
    String name;



    public ChildClass(String name){
        super("kau", "ffhjf");
        this.name = name;
        System.out.println("Child para Construct");

    }
    public ChildClass(String name, int age){
        //super("kau");
        this.name = name;
        System.out.println("Child para2 Construct");

    }


    @Override
    public void getInfo(){
        System.out.println("Child------Info");
    }



}

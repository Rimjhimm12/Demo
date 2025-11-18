package interfacetopic;

import java.sql.SQLOutput;

public abstract class ParentClass {

    public ParentClass(){}

    public ParentClass(String name){
        System.out.println("parent para Construct");
    }
    public ParentClass(String name, String address){
        System.out.println("parent para2 Construct");
    }

    public abstract void getInfo();
}

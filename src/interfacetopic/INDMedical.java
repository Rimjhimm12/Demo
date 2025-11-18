package interfacetopic;

public interface INDMedical extends WHOItnerface {


    //Individual Abstract classes
    public void gastroenterologyService();
    public void endocrinologyService();
    public void radiologyService();
    //Common Service
    public void dentalService();

    //Staic method
    public static void ayurvedaTechlogy(){
        System.out.println("INDIA_-----ancient and holistic systems of medicine");
    }

    public static String ayurvedaTechlogy(String medicationSystem){
        System.out.println("Ancient and holistic systems of medicine by the Ministry of AYUSH");
        return medicationSystem;

    }

    //Default Method
    default void helpDesk(){
        System.out.println("INDIA: The National Ambulance Service (NAS) can be accessed by dialing 102 or 108");
    }



}

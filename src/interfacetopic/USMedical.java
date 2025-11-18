package interfacetopic;

public interface USMedical extends WHOItnerface  {

    //Individual Abstract classes
    public void cardiologyService();
    public void oncologyService();
    public void dermatologyService();

    //Common Service
    public void dentalService();
}

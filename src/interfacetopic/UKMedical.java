package interfacetopic;

public interface UKMedical {

    //Individual Abstract classes
    public void neurologyService();
    public void orthopedicsService();
    public void PsychiatryService();
    private void gynoService(){
        System.out.println("USA...Gyno service");
    }

    //Common Service
    public void dentalService();
}

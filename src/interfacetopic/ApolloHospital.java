package interfacetopic;

public class ApolloHospital extends Hospital implements INDMedical, UKMedical, USMedical{

    //INDIA MEDICAL SERVICES
    @Override
    public void gastroenterologyService() {
        System.out.println("India ........Digestive system disorders");
    }

    @Override
    public void endocrinologyService() {
        System.out.println("India ........Hormonal and metabolic disorders");

    //Individual Method
    // MethodOverloading
    }
    public void endocrinologyService(String condition) {
        System.out.println("India ........Hormonal and metabolic disorders: "+condition);
        endocrinologyService("PCOS", 30);

    }
    private void endocrinologyService(String condition, int age) {
        System.out.println("India ........Hormonal and metabolic disorders: "+condition+", "+age);

    }


    @Override
    public void radiologyService() {
        System.out.println("India ........Medical imaging like X-rays and MRIs");

    }

    @Override
    public void dentalService() {
        System.out.println("India.USA.UK ........Dental Services");

    }

    public static void ayurvedaTechlogy(){
        System.out.println("Ancient and holistic systems of medicine powered by India");
    }

    //Default method from the interface
    public void helpDesk(){
        System.out.println("INDIA: The National Ambulance Service (NAS) can be accessed by dialing 102 or 108");
        System.out.println("The emergency number for Apollo Hospitals is 1066");
    }


    //UNITED KINGDOM MEDICAL SERVICES
    @Override
    public void neurologyService() {
        System.out.println("UK ........Nervous system disorders");
    }

    @Override
    public void orthopedicsService() {
        System.out.println("UK ........Musculoskeletal system");
    }

    @Override
    public void PsychiatryService() {
        System.out.println("UK ........Mental and emotional disorders");
    }


    //UNITED STATES OF AMERICA MEDICAL SERVICES
    @Override
    public void cardiologyService() {
        System.out.println("USA ........Heart disorders");
    }

    @Override
    public void oncologyService() {
        System.out.println("USA ........Cancer treatment");
    }

    @Override
    public void dermatologyService() {
        System.out.println("USA ........Skin conditions");
    }
    //WHO
    @Override
    public void covishield() {
        System.out.println("manufactured by Serum Institute of India");
    }

    @Override
    public void BIBP() {

    }

    @Override
    public void covaxin() {

    }

    @Override
    public void jcovden() {

    }

    @Override
    public void vidPrevtynBeta() {

    }

    @Override
    public void dayCare(){
        System.out.println("Apollo Hospital Day Care");
    }
}

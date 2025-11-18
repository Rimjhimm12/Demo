package interfacetopic;

public class ApolloHospitalTest {
    public static void main(String[] args) {
        ApolloHospital AH = new ApolloHospital();
        AH.cardiologyService();
        AH.dermatologyService();
        AH.oncologyService();
        AH.orthopedicsService();
        AH.PsychiatryService();
        AH.neurologyService();
        AH.endocrinologyService();
        AH.gastroenterologyService();
        AH.radiologyService();
        AH.endocrinologyService("PCOD");
        AH.dentalService();
        ApolloHospital.ayurvedaTechlogy();
        AH.helpDesk();
        AH.covishield();
        AH.rehabilitationCenters();
        AH.emergencyDepartment();
        AH.dayCare();




        System.out.println("_______________");
       INDMedical ind = new ApolloHospital();
       ind.endocrinologyService();
       ind.radiologyService();
       ind.gastroenterologyService();
       ind.dentalService();
       INDMedical.ayurvedaTechlogy();
        System.out.println(INDMedical.ayurvedaTechlogy("Panchakarma"));
        ind.helpDesk();
        ind.covishield();



        System.out.println("_______________");
        USMedical usa = new ApolloHospital();
        usa.dentalService();


        System.out.println("____________________________");
        USMedical duly = new DulyHospital();
        duly.BIBP();
        //duly.dayCare();
        UKMedical uk = new ApolloHospital();


        Hospital hospi = new ApolloHospital();
        hospi.dayCare();
        hospi.emergencyDepartment();
        hospi.rehabilitationCenters();

        UKMedical uk1 = (UKMedical) ind;









    }
}

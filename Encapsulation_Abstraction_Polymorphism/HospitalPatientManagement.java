
interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}
abstract class Patient implements MedicalRecord{
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;

    public Patient(int patientId, String name, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = "";
        this.medicalHistory = "";
    }
    public String getDiagnosis(){
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }
    public String getMedicalHistory(){
        return medicalHistory;
    }
    public void setMedicalHistory(String history){
        this.medicalHistory = history;
    }
    public abstract double calculateBill();
    public void getPatientDetails(){
        System.out.println("Patient Id :"+patientId);
        System.out.println("Patient Name :"+name);
        System.out.println("Patient Age :"+age);
        System.out.println("Diagnosis :"+diagnosis);
    }
}
class InPatient extends Patient{
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int patientId, String name, int age, int days, double rate){
        super(patientId, name, age);
        this.daysAdmitted = days;
        this.dailyRate = rate;
    }
    @Override
    public double calculateBill(){
        return daysAdmitted * dailyRate;
    }
    @Override
    public void addRecord(String record){
        setMedicalHistory(getMedicalHistory() == null ? record : getMedicalHistory()+ "; "+record);
    }
    @Override
    public void viewRecords(){
        System.out.println("Medical Records :"+getMedicalHistory());
    }
}
class OutPatient extends Patient{
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee){
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill(){
        return consultationFee;
    }
    @Override
    public void addRecord(String record){
        setMedicalHistory(getMedicalHistory() == null ? record : getMedicalHistory()+ "; "+record);
    }
    @Override
    public void viewRecords(){
        System.out.println("Medical Records :"+getMedicalHistory());
    }
}
public class HospitalPatientManagement {
    public static void main(String[] args){
        Patient p1 = new InPatient(101, "simran", 40, 5, 2000);
        Patient p2 = new OutPatient(102, "piya", 35, 500);

        p1.setDiagnosis("Appendicitis");
        p2.setDiagnosis("Flu");
        
        p1.addRecord("Admitted for surgery");
        p2.addRecord("General Check-up");

        p1.getPatientDetails();
        System.out.println("Bill :"+p1.calculateBill());
        p1.viewRecords();

        System.out.println();

        p2.getPatientDetails();
        System.out.println("Bill :"+p2.calculateBill());
        p2.viewRecords();
    }
}
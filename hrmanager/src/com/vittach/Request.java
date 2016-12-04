package com.vittach;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import com.vittach.enums.Diagnosis;
import com.vittach.enums.Specialization;

/**
 * Created by VITTACH on 23.10.2016.
 */
public class Request {
    private Scanner sc;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    private Random r = new Random(System.currentTimeMillis());

    Request() {
        sc = new Scanner(System.in);
        doctors = new ArrayList<>();
        patients= new ArrayList<>();
    }

    private Date inputDate(String textInfo) {
        Date date;
        DateFormat formats = new SimpleDateFormat("MM/dd/yy");
        while(true) {
            try {
                System.out.print(textInfo);
                date = formats.parse(sc.nextLine());
                break;
            } catch (ParseException pe) {}
        }
        return date;
    }

    public void generatePatient() throws ParseException {
        Diagnosis mydiagnosis;
        Diagnosis diagnosis[];

        sc.nextLine();
        System.out.print("Input patient last name: ");
        String lastName = sc.nextLine();
        System.out.print("Input patient first name: ");
        String firstName = sc.nextLine();
        System.out.print("Input patient patronymic name: ");
        String patronymic = sc.nextLine();
        Date date = inputDate("Input patient birthsday date(MM/dd/yy): ");

        Patient patient = new Patient(lastName, firstName, patronymic, date);
        diagnosis = Diagnosis.values();
        int countOfDiagnos = r.nextInt(2) + 1;
        for (int j=0;j<countOfDiagnos; j++) {
            mydiagnosis = diagnosis[r.nextInt(diagnosis.length)];
            System.out.println("Add this diagnosis: " + mydiagnosis);
            patient.addDiagnos(mydiagnosis);
        }
        patients.add(patient);
    }

    public void generateDoctors() throws ParseException {
        Patient patient;
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        int countOfPatientsToDoctors;

        sc.nextLine();
        System.out.print("Input doctor last name: ");
        String lastName = sc.nextLine();
        System.out.print("Input doctor first name: ");
        String firstName = sc.nextLine();
        System.out.print("Input doctor patronymic name: ");
        String patronymic = sc.nextLine();
        Date date = inputDate("Input doctor birthsday date (MM/dd/yy): ");

        Diagnosis posts[] = Diagnosis.values();
        Specialization specializations[] = Specialization.values();

        Doctor doctor = new Doctor(lastName,
                                    firstName,
                                    patronymic,
                                    date,
                                    posts[r.nextInt(posts.length - 1)].toString(),
                                    specializations[r.nextInt(specializations.length- 1)].toString());
        countOfPatientsToDoctors=r.nextInt(patients.size())+ 1;
        for (int j = 0;j<countOfPatientsToDoctors; j++) {
            date = formatter.parse(String.valueOf(r.nextInt(31)) + "/" + String.valueOf(r.nextInt(12)) + "/" + "2016");
            patient = patients.get(r.nextInt(patients.size()));

            System.out.println("Add this patient: " + patient + "\nat this date: " + date);
            doctor.addPatient(patient, date);
        }
        doctors.add(doctor);
    }

    public void getAllDiagnosisByPatients() {
        for(int i=0;i<92;i++)System.out.print("-");

        for(Patient pt: patients) {
            System.out.println("\nПациент: " + pt);
        }
    }

    public void getAllDiagnosisByPatient() {
        for(int i=0;i<92;i++)System.out.print("-");

        sc.nextLine();
        System.out.print("\nInput patient last name: ");
        String lastName = sc.nextLine();
        System.out.print("Input patient first name: ");
        String firstName = sc.nextLine();
        System.out.print("Input patient patronymic name: ");
        String patronymic = sc.nextLine();

        Patient patient = new Patient(lastName, firstName, patronymic, new Date());
        patients.stream().filter(pt-> pt.equals(patient)).forEach(pt -> {
            System.out.println("Болезни пациента:");
            for(Diagnosis ill : pt.getDiagnos())
                System.out.println("\t" + ill);
        });
    }

    public void getAllPatientsToDoctorByDate() {
        for(int i=0;i<92;i++)System.out.print("-");

        sc.nextLine();
        System.out.print("\nInput doctor last name: ");
        String lastName = sc.nextLine();
        System.out.print("Input doctor first name: ");
        String firstName = sc.nextLine();
        System.out.print("Input doctor patronymic name: ");
        String patronymic = sc.nextLine();
        Date date = inputDate("Input date in format like MM/dd/yy: ");
        Date finalDate = date;

        System.out.println("На эту дату к вам записаны: ");
        Patient patient = new Patient(lastName, firstName, patronymic, new Date());
        doctors.stream().filter(pt -> pt.equals(patient)).forEach(pt -> {
            ArrayList<PatientsDate> doctorsPatient = pt.getPatient();
            for(PatientsDate pa: doctorsPatient) {
                if(pa.getDate().equals(finalDate))
                    System.out.println("\t"+ pa.getPatient());
            }
        });
    }

    public void getAllDoctorsByCurrentPatient() {
        for(int i=0;i<92;i++)System.out.print("-");

        sc.nextLine();
        System.out.print("\nInput patient last name: ");
        String lastName = sc.nextLine();
        System.out.print("Input patient first name: ");
        String firstName = sc.nextLine();
        System.out.print("Input patient patronymic name: ");
        String patronymic = sc.nextLine();
        System.out.println("Пациент записан к: ");

        Patient patient = new Patient(lastName, firstName, patronymic, new Date());
        for(Doctor dt: doctors) {
            ArrayList<PatientsDate> doctorsPatient = dt.getPatient();
            doctorsPatient.stream().filter(pd -> pd.getPatient().equals(patient)).forEach(pd -> {
                System.out.println("\t" + dt);
            });
        }
    }

    public void start() throws ParseException {
        while(true) {
            System.out.println("\n-----------------------------Жариков Виталий Владиславович 2307-----------------------------");
            System.out.println("1-generatePatient; 2-generateDoctors; 3-getAllDiagnosisByPatient; 4-getAllDiagnosisByPatients; 5-getAllPatientsToDoctorByDate; 6-getAllDoctorsByCurrentPatient");
            switch (sc.nextInt()) {
                case 1: generatePatient(); break;
                case 2: generateDoctors(); break;
                case 3: getAllDiagnosisByPatient(); break;
                case 4: getAllDiagnosisByPatients();break;
                case 5: getAllPatientsToDoctorByDate(); break;
                case 6: getAllDoctorsByCurrentPatient();break;
                default: return;
            }
        }
    }
}

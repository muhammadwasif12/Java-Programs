import java.util.*;
import javax.swing.*;

// Doctor Class
class Doctor {
    private String doctorID;
    private String name;
    private String specialization;
    private List<String> availabilitySlots;

    public Doctor(String doctorID, String name, String specialization) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
        this.availabilitySlots = new ArrayList<>();
    }

    public String getDoctorID() { return doctorID; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public List<String> getAvailabilitySlots() { return availabilitySlots; }

    public void addSlot(String slot) { availabilitySlots.add(slot); }
    public void removeSlot(String slot) { availabilitySlots.remove(slot); }
}

// Patient Class
class Patient {
    private String patientID;
    private String name;
    private String contactDetails;

    public Patient(String patientID, String name, String contactDetails) {
        this.patientID = patientID;
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public String getPatientID() { return patientID; }
    public String getName() { return name; }
    public String getContactDetails() { return contactDetails; }
}

// Appointment Class
class Appointment {
    private String appointmentID;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;

    public Appointment(String appointmentID, Patient patient, Doctor doctor, String date, String time) {
        this.appointmentID = appointmentID;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public String getAppointmentID() { return appointmentID; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public String getDate() { return date; }
    public String getTime() { return time; }
}

// Hospital Class
class Hospital {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        JOptionPane.showMessageDialog(null, "Doctor added successfully.");
    }

    public void removeDoctor(String doctorID) {
        doctors.removeIf(doctor -> doctor.getDoctorID().equals(doctorID));
        JOptionPane.showMessageDialog(null, "Doctor removed successfully.");
    }

    public void registerPatient(Patient patient) {
        patients.add(patient);
        JOptionPane.showMessageDialog(null, "Patient registered successfully.");
    }

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        JOptionPane.showMessageDialog(null, "Appointment scheduled successfully.");
    }

    public List<Doctor> searchDoctor(String query) { 
        List<Doctor> result = new ArrayList<>();
        for (Doctor doctor : doctors) {
            if (doctor.getName().toLowerCase().contains(query.toLowerCase()) || 
                doctor.getSpecialization().toLowerCase().contains(query.toLowerCase())) {
                result.add(doctor);
            }
        }
        return result;
    }

    public String listDoctors() {
        StringBuilder sb = new StringBuilder("Doctors:\n");
        for (Doctor doctor : doctors) {
            sb.append(doctor.getDoctorID()).append(" - ").append(doctor.getName())
              .append(" (Specialization: ").append(doctor.getSpecialization()).append(")\n");
        }
        return sb.toString();
    }

    public String listAppointments() {
        StringBuilder sb = new StringBuilder("Appointments:\n");
        for (Appointment appointment : appointments) {
            sb.append(appointment.getAppointmentID()).append(" - ")
              .append("Patient: ").append(appointment.getPatient().getName()).append(", Doctor: ")
              .append(appointment.getDoctor().getName()).append(", Date: ").append(appointment.getDate())
              .append(", Time: ").append(appointment.getTime()).append("\n");
        }
        return sb.toString();
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

// GUI Demo for Hospital Management System
public class HospitalManagementGUI {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        while (true) {
            String choice = JOptionPane.showInputDialog(
                "1. Add Doctor\n2. Remove Doctor\n3. Register Patient\n4. Schedule Appointment\n" +
                "5. Search Doctor\n6. List Doctors\n7. List Appointments\n8. Exit\nChoose an option:");
            if (choice == null || choice.equals("8")) break;

            switch (choice) {
                case "1":
                    String doctorID = JOptionPane.showInputDialog("Enter Doctor ID:");
                    String name = JOptionPane.showInputDialog("Enter Doctor Name:");
                    String specialization = JOptionPane.showInputDialog("Enter Specialization:");
                    if (doctorID == null || doctorID.trim().isEmpty() ||
                        name == null || name.trim().isEmpty() ||
                        specialization == null || specialization.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "All fields are required.");
                        continue;
                    }
                    Doctor doctor = new Doctor(doctorID, name, specialization);
                    hospital.addDoctor(doctor);
                    break;
                case "2":
                    String removeID = JOptionPane.showInputDialog("Enter Doctor ID to Remove:");
                    hospital.removeDoctor(removeID);
                    break;
                case "3":
                    String patientID = JOptionPane.showInputDialog("Enter Patient ID:");
                    String patientName = JOptionPane.showInputDialog("Enter Patient Name:");
                    String contactDetails = JOptionPane.showInputDialog("Enter Contact Details:");
                    if (patientID == null || patientID.trim().isEmpty() ||
                        patientName == null || patientName.trim().isEmpty() ||
                        contactDetails == null || contactDetails.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "All fields are required.");
                        continue;
                    }
                    Patient patient = new Patient(patientID, patientName, contactDetails);
                    hospital.registerPatient(patient);
                    break;
                case "4":
                    String appointmentID = JOptionPane.showInputDialog("Enter Appointment ID:");
                    String patientQuery = JOptionPane.showInputDialog("Enter Patient ID for Appointment:");
                    String doctorQuery = JOptionPane.showInputDialog("Enter Doctor ID for Appointment:");
                    String date = JOptionPane.showInputDialog("Enter Date (YYYY-MM-DD):");
                    String time = JOptionPane.showInputDialog("Enter Time (HH:MM):");

                    Patient aptPatient = hospital.getPatients().stream()
                        .filter(p -> p.getPatientID().equalsIgnoreCase(patientQuery))
                        .findFirst().orElse(null);
                    Doctor aptDoctor = hospital.getDoctors().stream()
                        .filter(d -> d.getDoctorID().equalsIgnoreCase(doctorQuery))
                        .findFirst().orElse(null);

                    if (aptPatient == null || aptDoctor == null) {
                        JOptionPane.showMessageDialog(null, "Invalid Patient or Doctor ID.");
                        continue;
                    }

                    Appointment appointment = new Appointment(appointmentID, aptPatient, aptDoctor, date, time);
                    hospital.scheduleAppointment(appointment);
                    break;
                case "5":
                    String searchQuery = JOptionPane.showInputDialog("Enter Doctor Name or Specialization to Search:");
                    List<Doctor> foundDoctors = hospital.searchDoctor(searchQuery);
                    if (!foundDoctors.isEmpty()) {
                        StringBuilder result = new StringBuilder("Found Doctors:\n");
                        for (Doctor d : foundDoctors) {
                            result.append(d.getDoctorID()).append(" - ").append(d.getName())
                                  .append(" (Specialization: ").append(d.getSpecialization()).append(")\n");
                        }
                        JOptionPane.showMessageDialog(null, result.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No doctors found.");
                    }
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, hospital.listDoctors());
                    break;
                case "7":
                    JTextArea textArea = new JTextArea(hospital.listAppointments());
                    textArea.setEditable(false);
                    JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Appointments", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice.");
            }
        }
    }
}

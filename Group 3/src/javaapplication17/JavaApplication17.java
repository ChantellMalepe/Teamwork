
package javaapplication17;
import java.util.Scanner; 
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.FileReader;  
import java.io.BufferedReader;  
import java.util.Arrays; 

public class JavaApplication17 {
 static final String FILENAME = "database.txt";  
    static double Number[]=new double[1]; 
 static double IDNumber[]=new double[1]; 
    static String FirstName; 
    static String lastName; 
    static String Email; 
    static String password[]=new String[1]; 
    static String Diagnose; 
    static String Procedure; 
    static String effects; 
    static String workerType; 
    static String gender; 
    static String occupation; 
    static String availabilityTime; 
    static String breakTime; 
    static String shift; 
    static String Method; 
    static String payment; 
    static String prescriptionName; 
    static String DateOfBirth; 
    static String bloodType; 
    static String Risks; 
    static String Evidence; 
    static String Pills[]=new String[0]; 
    static double Cardnumber[]=new double[1]; 
    static double phoneNumber[]=new double[1]; 
    static int DateofBirth; 
    static int Option; 
    static double appointmentId; 
    static double procedureCost; 
    static double medicationCost; 
    static double patientId[]=new double[1]; 
    static double doctorId[]=new double[1]; 
    static double treatmentId[]=new double[1]; 
    static double billingId[]=new double[1]; 
    static double review[]=new double[1]; 
    static double expense1; 
    static double expense2; 
    static double expense3; 
    static double expense4; 
    static double expense5; 
    static double totalexpense; 
    static double totalCost; 
    static double labCost; 
    static double tax; 
    static double grandTotal; 
     
    static void writeToFile() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter data to write to file: ");  
        String data = scanner.nextLine();  
  
        try (FileWriter writer = new FileWriter(FILENAME)) {  
            writer.write(data);  
            System.out.println("Data written to file successfully.");  
        } catch (IOException e) {  
            System.out.println("Error writing to file: " + e.getMessage());  
        }  
    }  
    static void PatientRecords(){ 
    Scanner s=new Scanner(System.in); 
            System.out.println("=====THANK YOU FOR MAKING YOUR DECISION!!!!!!!======"); 
                        System.out.println("**************************"); 
                        System.out.println("Enter your First Name below:"); 
                        FirstName=s.nextLine(); 
                        System.out.println("******************************"); 
                        System.out.println("Enter your last name:"); 
                        lastName=s.nextLine(); 
                        System.out.println("******************************"); 
                        System.out.println("Enter the diagnose:"); 
                        Diagnose=s.nextLine(); 
                        
System.out.println("***********************************"); 
                        System.out.println("Enter your Email:"); 
                        Email=s.nextLine(); 
                        
System.out.println("***********************************"); 
                        System.out.println("Enter your Phone Number:"); 
                        for(int i=0;i<1;i++){ 
                      phoneNumber[i]=s.nextDouble(); 
                        } 
                        
System.out.println("************************************"); 
                        System.out.println("Enter your Date Of Birth"); 
                        DateofBirth=s.nextInt(); 
                        System.out.println("**********************************"); 
                        System.out.println("Enter your password:"); 
                        for(int i=0;i<1;i++){ 
                      phoneNumber[i]=s.nextInt(); 
                  } 
                            System.out.println("Is the patients procedure can be 'pending/Done':"); 
                            Procedure=s.nextLine(); 
                            if (Procedure == "Pending"){ 
                                    System.out.println("Valid option"); 
                                    } 
                            else if(Procedure == "Done"){ 
                                System.out.println("Valid Option"); 
                            } 
                            System.out.println("DISPLAYED INFORMATION"); 
                        
System.out.println("****************************************"); 
                        System.out.println(Arrays.toString(IDNumber)); 
                        System.out.println("---------------------------"); 
                         
                        System.out.println("Your Name is:"+FirstName); 
                        System.out.println("---------------------------"); 
                         
                        System.out.println("Your Surname is:"+lastName); 
                        System.out.println("---------------------------"); 
                         
                        System.out.println("Patients Diagnose is:"+Diagnose); 
                        System.out.println("--------------------------------"); 
                         
                        System.out.println("Patients Email is:"+Email); 
                        System.out.println("----------------------------------"); 
                         
                        System.out.println(Arrays.toString(phoneNumber)); 
                        System.out.println("----------------------------------"); 
                         
                        System.out.println("Patients Date of Birth"+DateofBirth); 
                        System.out.println("-----------------------------------"); 
                         
                        System.out.println(Arrays.toString(password)); 
                        
System.out.println("***************************************"); 
                        System.out.println("===\n THANK YOU AND COME AGAIN LATER....======"); 
                         
} 
    static void DoctorInformation() { 
        Scanner s = new Scanner(System.in); 
        System.out.println("=====\n THANK YOU FOR MAKING YOUR CHOICE......===="); 
        System.out.println("====\n ANSAWR ALL THE QUESTIONS......======"); 
        System.out.println("*********************************************"); 
        System.out.print("Enter Doctor name: "); 
         FirstName = s.nextLine(); 
         System.out.println("**************************************"); 
        System.out.print("Enter Doctor gender: "); 
        gender = s.nextLine(); 
        System.out.println("********************************************"); 
        System.out.print("Enter Doctor occupation: "); 
        occupation = s.nextLine(); 
        System.out.println("********************************************"); 
        System.out.print("Enter availability time (HH:MM:SS): "); 
        availabilityTime = s.nextLine(); 
        System.out.println("*********************************************"); 
        System.out.print("Enter break time (HH:MM:SS): "); 
        breakTime = s.nextLine(); 
        System.out.println("***********************************************"); 
        System.out.print("Enter the Doctors shift : "); 
        shift = s.nextLine(); 
        
System.out.println("************************************************************* "); 
            System.out.println("WE ARE ALL AT YOUR BEST INTEREST..."); 
            
System.out.println("****************************************************"); 
            System.out.println("--- WELCOME TO OUR WAGE CALCULATOR... ---"); 
            
System.out.println("***************************************************"); 
            System.out.print("Enter worker type (Skilled, Semi-skilled, Unskilled) : "); 
            workerType = s.nextLine(); 
            
System.out.println("*********************************************************"); 
            System.out.println("Skilled R54000 per month"); 
            System.out.println("*********************************"); 
            System.out.println("Semi-skilled R20500 per month"); 
            System.out.println("***********************************"); 
            System.out.println("Unskilled as a start up R9500 per month"); 
            System.out.println("*****************************************"); 
            System.out.println("Enter your first expense"); 
            expense1=s.nextDouble(); 
            expense2=s.nextDouble(); 
            expense3=s.nextDouble(); 
            expense4=s.nextDouble(); 
            expense5=s.nextDouble(); 
            
System.out.println("*************************************************"); 
            System.out.println("Your result is:"); 
            totalexpense=expense1+expense2+expense3+expense4+expense5; 
            System.out.println("Your total expense:"+totalexpense); 
            
System.out.println("************************************************"); 
  System.out.println("====\nDISPLAY INFORMATION:"); 
        System.out.println("********************************************"); 
            System.out.println("The Doctors Name is: " + FirstName); 
            System.out.println("-----------------------------------"); 
             
            System.out.println("The Gender of the Doctor: " + gender); 
            System.out.println("-------------------------------------"); 
             
            System.out.println("The Occupation of the Doctor: " + occupation); 
            System.out.println("----------------------------------------------"); 
             
            System.out.println("The Availability Time of the Doctor: " + 
availabilityTime); 
            System.out.println("----------------------------------------------------------"); 
             
            System.out.println("The Break Time for the Doctor is: " + breakTime); 
            System.out.println("--------------------------------------------------"); 
             
            System.out.println("The Shift time of the doctor is: " + shift); 
            System.out.println("----------------------------------------------"); 
             
            System.out.println("=====\n THANK YOU...====="); 
 
        } 
    static void MedicalTreatments(){ 
            Scanner s=new Scanner(System.in); 
            System.out.println("====\n THANK YOU FOR CHOOSING YOUR OPTION...====="); 
                  System.out.println("Enter your ID number:"); 
                  for(int i=0;i<1;i++){ 
                      IDNumber[i]=s.nextDouble(); 
                  } 
                  System.out.println("****************************"); 
                  System.out.println("Enter your prescription name"); 
                  prescriptionName=s.nextLine(); 
                  System.out.println("*******************************"); 
                  System.out.println ("Enter your diagnose below: "); 
                  Diagnose=s.nextLine(); 
                  System.out.println("***********************************"); 
                  System.out.println("State if you had any encounters with a medical problem before below:"); 
                  prescriptionName=s.nextLine(); 
                  
System.out.println("****************************************************************"); 
                  System.out.println("What is your blood type:"); 
                  bloodType=s.nextLine(); 
                  
System.out.println("**************************************************"); 
                  System.out.println("Do you want to know the risks of the medical treatment:"); 
                  Risks=s.nextLine(); 
                  
System.out.println("********************************************************"); 
                  System.out.println("Do you want to know the effectiveness of the medication:"); 
                  effects=s.nextLine(); 
                  
System.out.println("***********************************************************")
 ; 
                  System.out.println("How long should the treatment take:"); 
                  for(int i=0;i<1;i++){ 
                      Number[i]=s.nextDouble(); 
                  } 
                  
System.out.println("***********************************************************")
 ; 
                  System.out.println("Is evidence required for this treatment:"); 
                  Evidence=s.nextLine(); 
                  
System.out.println("*********************************************************"); 
                  System.out.println("Are there any current pills you are taking"); 
                  for(int i=0;i<1;i++){ 
                      Pills[i]=s.nextLine(); 
                  } 
                  System.out.println("*************************************"); 
                   
                  System.out.println("Displayed information:"); 
                  System.out.println("-------------------------------------"); 
                   
                  System.out.println(Arrays.toString(IDNumber)); 
                  System.out.println("*************************************"); 
                   
                  System.out.println("This is the prescription name"+prescriptionName); 
                  System.out.println("-----------------------------------------------"); 
                   
                  System.out.println("This is your blood Type"+bloodType); 
                  System.out.println("---------------------------------------------"); 
                   
                  System.out.println("This is your risk"+Risks); 
                  System.out.println("----------------------------------==-----------------"); 
                   
                  System.out.println("These are the effects"+effects); 
                  System.out.println("-----------------------------------------------------"); 
                   
                  System.out.println("This is how long your procedure would take"+Number); 
                  System.out.println("------------------------------------------------------"); 
                   
                  System.out.println("These are you your results"+Pills); 
                  System.out.println("----------------------------------------------------"); 
                   
                  System.out.println("=====\n THANK YOU AND PLEASE COME BACK AGAIN OR CLICK EXIT......======"); 
                  
System.out.println("***********************************************************************"); 
    } 
    static void BillingData(){ 
        Scanner s=new Scanner(System.in); 
        System.out.println("===\nTHANK YOU FOR CHOOSING YOUR OPTION...======"); 
    System.out.println("Enter Patient ID:"); 
    for(int i=0;i<1;i++){ 
        IDNumber[i]=s.nextDouble(); 
    } 
        System.out.println("*********************************"); 
    System.out.println("Enter Patient Name:"); 
    FirstName = s.nextLine(); 
        System.out.println("*********************************"); 
    System.out.println("Enter Procedure Done:"); 
    Procedure = s.nextLine(); 
        System.out.println("*********************************"); 
    System.out.println("Enter Procedure Cost:"); 
    procedureCost = s.nextDouble(); 
        System.out.println("**********************************"); 
    System.out.println("Enter Medication Cost:"); 
    medicationCost = s.nextDouble(); 
        System.out.println("***********************************"); 
    System.out.println("Enter Lab Test Cost:"); 
    labCost = s.nextDouble(); 
        System.out.println("************************************"); 
    totalCost = procedureCost + medicationCost + labCost; 
    tax = totalCost * 0.05;  
    grandTotal = totalCost + tax; 
        System.out.println("*******************************************"); 
    System.out.println("===\nBILLING INFORMATION===="); 
    System.out.println(Arrays.toString(IDNumber)); 
        System.out.println("************************************"); 
         
    System.out.println("Patient Name: " + FirstName); 
        System.out.println("*************************************"); 
         
    System.out.println("Procedure: " + Procedure); 
        System.out.println("**************************************"); 
         
    System.out.printf("Procedure Cost: $%.2f%n"+ procedureCost); 
        System.out.println("***************************************"); 
         
    System.out.printf("Medication Cost: $%.2f%n"+ medicationCost); 
        System.out.println("**************************************"); 
         
    System.out.printf("Lab Test Cost: $%.2f%n"+ labCost); 
        System.out.println("**************************************"); 
         
    System.out.printf("Subtotal: $%.2f%n"+ totalCost); 
        System.out.println("**************************************"); 
         
    System.out.printf("Tax (5%%): $%.2f%n"+ tax); 
        System.out.println("**************************************"); 
         
    System.out.printf("Total Amount Due: $%.2f%n"+ grandTotal); 
        System.out.println("**************************************"); 
         
        System.out.println("===\nTHANK YOU AND COME AGAIN....====="); 
 
    } 
    static void AppointmentsSchedule(){ 
    Scanner s=new Scanner(System.in); 
    System.out.println("===\nTHANK YOU FOR SELECTING APPOINTMENT SCHEDULE ENTRY ==="); 
        
System.out.println("**********************************************************"); 
    System.out.println("Enter your effects if multiple type in :"); 
    effects=s.nextLine();             
    
System.out.println("*******************************************************************************************"); 
        System.out.println("What is your method of payment"); 
        Method=s.nextLine(); 
        System.out.println("**************************************"); 
        System.out.println("What is the date of the payment(HH:MM:SS)"); 
        payment=s.nextLine(); 
        System.out.println("What is the card number max 10 digits"); 
                for(int i=0;i<10;i++){ 
                      Cardnumber[i]=s.nextDouble(); 
                  } 
        System.out.println("****************************************"); 
    System.out.print("Enter Appointment ID: "); 
    appointmentId = s.nextDouble(); 
               System.out.println("*****************************"); 
     
    System.out.print("Enter Patient ID: "); 
     
    for(int i=0;i<6;i++){ 
                      patientId[i]=s.nextDouble(); 
                  } 
               System.out.println("*****************************"); 
     
    System.out.print("Enter Doctor ID: "); 
    for(int i=0;i<6;i++){ 
                      doctorId[i]=s.nextDouble(); 
                  } 
               System.out.println("*****************************"); 
     
    System.out.print("Enter Treatment ID: "); 
    for(int i=0;i<6;i++){ 
                      treatmentId[i]=s.nextDouble(); 
                  } 
               System.out.println("*****************************"); 
     
    System.out.print("Enter Billing ID: "); 
    for(int i=0;i<6;i++){ 
                      billingId[i]=s.nextDouble(); 
                  } 
               System.out.println("*****************************"); 
 
    System.out.println("---\nAppointment Details ---"); 
    System.out.println("Appointment ID: " + appointmentId); 
        System.out.println("---------------------------------------"); 
         
    System.out.println(Arrays.toString(doctorId)); 
        System.out.println("----------------------------------------"); 
         
    System.out.println(Arrays.toString(patientId)); 
        System.out.println("-------------------------------------------"); 
         
    System.out.println(Arrays.toString(treatmentId)); 
        System.out.println("--------------------------------------------"); 
         
    System.out.println(Arrays.toString(billingId)); 
        System.out.println("--------------------------------------------"); 
         
    System.out.println(Arrays.toString(review)); 
        System.out.println("---------------------------------------------"); 
         
        System.out.println("====\n THANK YOU....====="); 
     
} 
    static void Exit(){ 
        Scanner s=new Scanner(System.in); 
        System.out.println("====WE ARE GRAETFULL FOR YOUR VISIT====="); 
        System.out.println("*********************************************"); 
        System.out.println("====WE HOPE YOU COME BACK AGAIN====="); 
        System.out.println("***********************************************"); 
        System.out.println("====TO CONTINUE PLESAE CLICK MENU OR EXIT TO QUIT===="); 
        
System.out.println("*****************************************************"); 
        
System.out.println("*****************************************************"); 
         
        System.out.println("WELCOME TO THE MENU BAR"); 
            System.out.println("**********************************"); 
             
            System.out.println("Enter 1 for MENU"); 
            System.out.println("--------------------------------"); 
            System.out.println("Enter 2 for EXIT"); 
            
System.out.println("***********************************************"); 
            System.out.println("Enter your Option 1-2"); 
            Option=s.nextInt(); 
            
System.out.println("***********************************************"); 
            switch(Option){ 
              case 1: 
                menu(); 
                break; 
            case 2: 
                Exit(); 
                break;  
            default: 
                System.out.println("Invalid option...Please choose again..."); 
                 
            } 
    } 
    static void menu(){ 
Scanner s=new Scanner(System.in); 
System.out.println("=====WELCOME TO ULTRA CARE GENERAL HOSPITAL======"); 
System.out.println("========WHERE YOUR HEALTH IS OUR CONCERN========"); 
            
System.out.println("#################################################"); 
            System.out.println("WELCOME TO THE MENU BAR"); 
            System.out.println("**********************************"); 
            System.out.println("Enter 1 for PATIENT RECORDS"); 
            System.out.println("---------------------------------"); 
            System.out.println("Enter 2 for DOCTOR INFORMATION"); 
            System.out.println("---------------------------------"); 
            System.out.println("Enter 3 for MEDICAL TREATMENTS"); 
            System.out.println("-----------------------------------"); 
            System.out.println("Enter 4 for BILLING DATA"); 
            System.out.println("----------------------------------"); 
            System.out.println("Enter 5 for APPOINTMENTS SCHEDULE"); 
            System.out.println("------------------------------------"); 
            System.out.println("Enter 6 for MENU"); 
            System.out.println("-------------------------------------"); 
            System.out.println("Enter 7 for EXIT"); 
            
System.out.println("***********************************************"); 
            System.out.println("Enter your Option 1-7"); 
            Option=s.nextInt(); 
            
System.out.println("***********************************************"); 
            switch(Option){ 
            case 1: 
                PatientRecords(); 
                break; 
            case 2: 
                DoctorInformation(); 
                break; 
            case 3: 
                MedicalTreatments(); 
                break; 
            case 4: 
                break; 
            case 5: 
                AppointmentsSchedule(); 
                break; 
            case 6: 
                menu(); 
                break; 
            case 7: 
                Exit(); 
                break; 
            default: 
                System.out.println("Invalid option...Please select another option..."); 
                 
    } 
                 
}   
  
    static void readFromFile() {  
        try (BufferedReader reader = new BufferedReader(new 
FileReader(FILENAME))) {  
            String line;  
            System.out.println("Data from file:");  
            while ((line = reader.readLine()) != null) {  
                System.out.println(line);  
            }  
        } catch (IOException e) {  
            System.out.println("Error reading from file: " + e.getMessage());  
        }  
    }  
     
  
    static void run() {  
        Scanner scanner = new Scanner(System.in);  
        while (true) {  
            System.out.println("1. Write to file");  
            System.out.println("2. Read from file");  
            System.out.println("3. Exit");  
            System.out.print("Choose an option: ");  
            int option = scanner.nextInt();  
            scanner.nextLine();   
  
            switch (option) {  
                case 1:  
                    writeToFile();  
                    break;  
                case 2:  
                    readFromFile();  
                    break;  
                case 3:  
                    System.out.println("Exiting...");  
                    return;  
                default:  
                    System.out.println("Invalid option. Please choose again.");  
                     
            }  
        }  
    }  
    
    public static void main(String[] args) { 
    do{ 
        menu(); 
       }while(Option!=100); 
    } 
     
} 
      
    
   
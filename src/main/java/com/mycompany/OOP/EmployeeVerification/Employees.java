/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.OOP.EmployeeVerification;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import javax.swing.JOptionPane;



public class Employees {
    
    private String employeenum,firstname,lastname,birthday,address,phonenum,
            sssnum,phnum,tin,pgbnum,status,position,supervisor,
            basicsalary,riceall,phoneall,clotheall,smrate,hourlyrate; 
    
    
    
    public Employees(){};
    
    public Employees(String _employeenum,String _firstname,String _lastname,String _birthday,String _address,
                     String _phonenum,String _sssnum,String _phnum,String _tin, String _pgbnum, 
                     String _status,String _position,String _supervisor,String _basicsalary, String _riceall,
                     String _phoneall, String _clotheall, String _smrate, String _hourlyrate){
                    
        
        employeenum = _employeenum;
        firstname = _firstname;
        lastname = _lastname;
        birthday = _birthday;
        address = _address;
        phonenum = _phonenum;
        sssnum = _sssnum;
        phnum = _phnum;
        tin = _tin;
        pgbnum = _pgbnum;
        status = _status;
        position = _position;
        supervisor = _supervisor;
        basicsalary = _basicsalary;
        riceall = _riceall;
        phoneall = _phoneall;
        clotheall = _clotheall;
        smrate = _smrate;
        hourlyrate = _hourlyrate;
    }
    
    public void setemployeenum(String _employeenum){
        employeenum = _employeenum;
    }
    
    public void setfirstname(String _firstname){
        firstname = _firstname;
    }
    
    public void setlastname(String _lastname){
        lastname = _lastname;
    }
    
    public void setbirthday(String _birthday){
        birthday = _birthday;
    }
    
    public void setaddress(String _address){
        address=_address;
    }
    
    public void setphonenum(String _phonenum){
        phonenum = _phonenum;
    }
    
    public void setsssnum(String _sssnum){
        sssnum=_sssnum;
    }
    
    public void setphnum(String _phnum){
        phnum = _phnum;
    }
    public void settin(String _tin){
        tin = _tin;
    }
    
    public void setpgbnum(String _pgbnum){
        pgbnum = _pgbnum;
    }
    
    public void setstatus(String _status){
        status = _status;
    }
    
    public void setposition(String _position){
        position = _position;
    }
    
    public void setsupervisor(String _supervisor){
        supervisor = _supervisor;
    }
    
    public void setbasic(String _basicsalary){
        basicsalary=_basicsalary;
    }
    
    public void setriceall(String _riceall){
        riceall = _riceall;
    }
    public void setphoneall(String _phoneall){
        phoneall = _phoneall;
    }
    public void setclotheall(String _clotheall){
        clotheall = _clotheall;
    }
    public void setsmrate(String _smrate){
        smrate = _smrate;
    }
    public void sethourlyrate(String _hourlyrate){
        hourlyrate = _hourlyrate;
    }
    
    
    
    public String getEmployeeNum(){
        return employeenum ;
    }
    
    public String getFirstName(){
        return firstname;
    }
    
    public String getLastName(){
        return lastname ;
    }
    
    public String getBirthday(){
        return birthday;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPhoneNum(){
        return phonenum;
    }
    
    public String getSssNum(){
        return sssnum;
    }
    
    public String getPhNum(){
        return phnum;
    }
    public String getTinNum(){
        return tin;
    }
    
    public String getPagibigNum(){
        return pgbnum;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getPosition(){
        return position ;
    }
    
    public String getSupervisor(){
        return supervisor;
    }
    
    public String getBasicSalary(){
        return basicsalary;
    }
    
    public String getRiceAllowance(){
        return riceall;
    }
    public String getphoneAllowance(){
        return phoneall;
    }
    public String getClothAllowance(){
        return clotheall;
    }
    public String getSemRate(){
        return smrate;
    }
    public String getHourlyRate(){
        return hourlyrate;
    }
    
    
    
    
    public DefaultTableModel tableDetails(String filename) throws FileNotFoundException, IOException, CsvValidationException{
        DefaultTableModel details;
        
        try(CSVReader csvreader = new CSVReader(new FileReader(filename))){
            
            String[] line1 = csvreader.readNext();
            String[] header = {line1[0], line1[1],line1[2],line1[6],line1[7],line1[8],line1[9] };
            details = new DefaultTableModel(header,0);
            
            String[] line;

            while((line=csvreader.readNext()) != null){

                String[] data = {line[0], line[1],line[2],line[6],line[7],line[8],line[9] };
                
                details.addRow(data);
            }
        }
        
        return details;
        
    }
    
       public DefaultTableModel leaveDetails(String filename) throws FileNotFoundException, IOException, CsvValidationException{
        DefaultTableModel leave;
        
        try(CSVReader csvreader = new CSVReader(new FileReader(filename))){
            
            String[] line1 = csvreader.readNext();
            String[] header = {line1[0], line1[1],line1[2],line1[3],line1[4],line1[5] };
            leave = new DefaultTableModel(header,0);
            
            String[] line;

            while((line=csvreader.readNext()) != null){

                String[] data = {line[0], line[1],line[2],line[3],line[4],line[5] };
                
                leave.addRow(data);
            }
            
        }
        
        return leave;
        
    }
    
    public void UpdateEmployee(String filename) throws FileNotFoundException, IOException, CsvValidationException{
        String tempfilename = filename.replace(".csv", ".tmp");
        
        CSVReader csvreader = new CSVReader(new FileReader(filename));
        String[] line;
        
        CSVWriter csvwriter = new CSVWriter(new FileWriter(tempfilename,true));
        
        while((line=csvreader.readNext())!=null){
            if(line[0].equals(employeenum)){
                line[0] = employeenum;
                line[1] = lastname;
                line[2] = firstname;
                line[3] = birthday;
                line[4] = address;
                line[5] = phonenum;
                line[6] = sssnum;
                line[7] = phnum;
                line[8] = tin;
                line[9] = pgbnum;
                line[10] = status;
                line[11] = position;
                line[12] = supervisor;
                line[13] = String.valueOf(basicsalary);
                line[14] = String.valueOf(riceall);
                line[15] = String.valueOf(phoneall);
                line[16] = String.valueOf(clotheall);
                line[17] = String.valueOf(smrate);
                line[18] = String.valueOf(hourlyrate);  
            }
            
            csvwriter.writeNext(line);
        }
        csvreader.close();
        csvwriter.close();
        
        new File(filename).delete();
        new File(tempfilename).renameTo(new File(filename));
    }
    
    public void AddEmployee(String filename) throws IOException{
        try(CSVWriter csvwriter = new CSVWriter(new FileWriter(filename, true))){
            String[] line = new String[19];

            line[0] = employeenum;
            line[1] = lastname;
            line[2] = firstname;
            line[3] = birthday;
            line[4] = address;
            line[5] = phonenum;
            line[6] = sssnum;
            line[7] = phnum;
            line[8] = tin;
            line[9] = pgbnum;
            line[10] = status;
            line[11] = position;
            line[12] = supervisor;
            line[13] = basicsalary;
            line[14] = riceall;
            line[15] = phoneall;
            line[16] = clotheall;
            line[17] = smrate;
            line[18] = hourlyrate;

            csvwriter.writeNext(line);
        }
        
    }
    
    public void DeleteEmployee(String filename) throws FileNotFoundException, IOException, CsvValidationException{
        String tempfilename = filename.replace(".csv", ".tmp");
        
        CSVReader csvreader = new CSVReader(new FileReader(filename));
        String[] line;
        
        try(CSVWriter csvwriter = new CSVWriter(new FileWriter(tempfilename, true))){
            while((line = csvreader.readNext())!= null){
                if(!(line[0].equals(employeenum))){
                    csvwriter.writeNext(line);
                }       
            }
            csvreader.close();
        }
        finally{
            new File(filename).delete();
            new File(tempfilename).renameTo(new File(filename));    
        }    
    }
    
    public float ComputeHoursWorked(String startDate, String endDate) throws FileNotFoundException, IOException, CsvValidationException, ParseException {
      SimpleDateFormat format1 = new SimpleDateFormat("M/d/yyyy HH:mm:ss");
      SimpleDateFormat format2 = new SimpleDateFormat("M/d/yyyy");
      Date dateIn = format2.parse(startDate);
      Date dateOut = format2.parse(endDate);
      CSVReader csvreader = new CSVReader(new FileReader("Attendance Record 1.csv"));

      float var24;
      try {
         ArrayList<String> timein = new ArrayList();
         ArrayList<String> timeout = new ArrayList();

         String[] line;
         while((line = csvreader.readNext()) != null) {
            if (line[0].equals(this.employeenum)) {
               timein.add(line[1]);
               timeout.add(line[2]);
            }
         }
         
         if (timein.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No attendance records found for the employee.", "Notification", JOptionPane.INFORMATION_MESSAGE);
            throw new IllegalArgumentException("No attendance records found for the employee");
        }

         int indexStart = 0;

         int indexEnd;
         for (indexEnd = 0; indexEnd < timeout.size(); ++indexEnd) {
            Date dEnd = format1.parse(timeout.get(indexEnd)); // Use format1 for consistency
            if (dEnd.after(dateOut)) {
                indexEnd = indexEnd - 1; // Move back one index to get the last date before the endDate
                break; // Exit loop once found
            }
        }


         indexEnd = 0;

         for(int i = 0; i < timeout.size(); ++i) {
            Date dEnd = format2.parse((String)timeout.get(i));
            if (dEnd.compareTo(dateOut) == 0) {
               indexEnd = i;
            }
         }

         float sum = 0.0F;

         for(int k = indexStart; k <= indexEnd; ++k) {
            Date t1 = format1.parse((String)timein.get(k));
            Date t2 = format1.parse((String)timeout.get(k));
            float t = (float)(t2.getTime() - t1.getTime() - 3600000L);
            float test = t / 3600000.0F;
            if (test >= 7.0F) {
               test = 8.0F;
            }

            sum += test;
         }

         var24 = sum;
      } catch (Throwable var20) {
         try {
            csvreader.close();
         } catch (Throwable var19) {
            var20.addSuppressed(var19);
         }

         throw var20;
      }

      csvreader.close();
      return var24;
   }
    

    // Helper function to check if two dates are on the same day
    private boolean isSameDay(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
               cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
               cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }

    public String computeSalEarned(float hw) {
    // Remove commas from the hourly rate string before parsing
    String hourlyRateWithoutComma = this.hourlyrate.replaceAll(",", "");
    float salEarned = Float.parseFloat(hourlyRateWithoutComma) * hw;
    return String.format("%.2f", salEarned);
}

    public String computeGross(float hw) {
        // Remove commas from all input strings before parsing
        String salEarnedWithoutComma = this.computeSalEarned(hw).replaceAll(",", "");
        String riceAllWithoutComma = this.riceall.replaceAll(",", "");
        String phoneAllWithoutComma = this.phoneall.replaceAll(",", "");
        String clotheAllWithoutComma = this.clotheall.replaceAll(",", "");

        float gross = Float.parseFloat(salEarnedWithoutComma) + 
                      Float.parseFloat(riceAllWithoutComma) + 
                      Float.parseFloat(phoneAllWithoutComma) + 
                      Float.parseFloat(clotheAllWithoutComma);
        return String.format("%.2f", gross);
    }

    public String computeSSS() {
        // Remove commas from the basic salary string before parsing
        String basicSalaryWithoutComma = this.basicsalary.replaceAll(",", "");
        float sal = Float.parseFloat(basicSalaryWithoutComma);
        double sss;
        if (sal <= 3250.0F) {
            sss = 135.0;
        } else if (sal > 3250.0F & sal <= 24750.0F) {
            float mod;
            float multiplier;
            if (sal % 1000.0F == 250.0F | sal % 1000.0F == 750.0F) {
                mod = (sal - 3250.0F) % 500.0F;
                multiplier = (sal - 3250.0F - mod) / 500.0F;
                sss = 22.5 * (double)multiplier + 135.0;
            } else {
                mod = (sal - 3250.0F) % 500.0F;
                multiplier = (sal - 3250.0F - mod) / 500.0F;
                sss = 22.5 * (double)(multiplier + 1.0F) + 135.0;
            }
        } else {
            sss = 1125.0;
        }

        return String.format("%.2f", sss);
    }

    public String computePH() {
        // Remove commas from the basic salary string before parsing
        String basicSalaryWithoutComma = this.basicsalary.replaceAll(",", "");
        float sal = Float.parseFloat(basicSalaryWithoutComma);
        double ph;
        if (sal <= 10000.0F) {
            ph = 150.0;
        } else if (sal > 10000.0F & sal < 60000.0F) {
            ph = (double)sal * 0.03 / 2.0;
        } else {
            ph = 900.0;
        }

        return String.format("%.2f", ph);
    }

    public String computePGB() {
        // Remove commas from the basic salary string before parsing
        String basicSalaryWithoutComma = this.basicsalary.replaceAll(",", "");
        float sal = Float.parseFloat(basicSalaryWithoutComma);
        double pagibig;
        if (sal > 1000.0F & sal <= 1500.0F) {
            pagibig = (double)(sal * 0.01F);
        } else if ((double)sal * 0.02 < 100.0) {
            pagibig = (double)(sal * 0.02F);
        } else {
            pagibig = 100.0;
        }

        return String.format("%.2f", pagibig);
    }

    public String computeTax() {
        // Remove commas from the basic salary, SSS, PH, and PGB strings before parsing
        String basicSalaryWithoutComma = this.basicsalary.replaceAll(",", "");
        String sssWithoutComma = this.computeSSS().replaceAll(",", "");
        String phWithoutComma = this.computePH().replaceAll(",", "");
        String pgbWithoutComma = this.computePGB().replaceAll(",", "");

        float sal = Float.parseFloat(basicSalaryWithoutComma);
        float sss = Float.parseFloat(sssWithoutComma);
        float pagibig = Float.parseFloat(pgbWithoutComma);
        float ph = Float.parseFloat(phWithoutComma);
        float taxable = sal - sss - pagibig - ph;
        float tax;
        if (sal <= 20832.0F) {
            tax = 0.0F;
        } else if (sal > 20832.0F & sal < 33333.0F) {
            tax = (float)((double)(taxable - 20833.0F) * 0.2);
        } else if (sal >= 33333.0F & sal < 66667.0F) {
            tax = (float)((double)(taxable - 33333.0F) * 0.25 + 2500.0);
        } else if (sal >= 66667.0F & sal < 166667.0F) {
            tax = (float)((double)(taxable - 66667.0F) * 0.3 + 10833.0);
        } else if (sal >= 166667.0F & sal < 666667.0F) {
            tax = (float)((double)(taxable - 166667.0F) * 0.32 + 40833.33);
        } else {
            tax = (float)((double)(sal - 666667.0F) * 0.35 + 200833.33);
        }

        return String.format("%.2f", tax);
    }

    public String computeTotalDeduct() {
        // Remove commas from the SSS, PH, PGB, and Tax strings before parsing
        String sssWithoutComma = this.computeSSS().replaceAll(",", "");
        String phWithoutComma = this.computePH().replaceAll(",", "");
        String pgbWithoutComma = this.computePGB().replaceAll(",", "");
        String taxWithoutComma = this.computeTax().replaceAll(",", "");

        float tax = Float.parseFloat(taxWithoutComma);
        float sss = Float.parseFloat(sssWithoutComma);
        float pagibig = Float.parseFloat(pgbWithoutComma);
        float ph = Float.parseFloat(phWithoutComma);
        return String.format("%.2f", sss + ph + pagibig + tax);
    }

    public String computeNet(float hw) {
        float net = Float.parseFloat(this.computeGross(hw)) - Float.parseFloat(this.computeTotalDeduct());
        return String.format("%.2f", net);
    }

    
    public boolean LeaveIsAllowed(String filename,String leaveType, String days) throws FileNotFoundException, IOException, CsvValidationException{
        
        try(CSVReader csvreader = new CSVReader(new FileReader(filename))){
            
            String[] line;
            int leaveDays = Integer.parseInt(days);
            while((line=csvreader.readNext())!=null){
                if(line[0].equals(employeenum) & leaveType.equals("Sick Leave")){
                   int remainSL = Integer.parseInt(line[3]);
                   
                   if(leaveDays>remainSL){
                       return false;
                   }
                   
                   
                            
                }
                else if(line[0].equals(employeenum) & leaveType.equals("Vacation Leave")){
                   int remainVL = Integer.parseInt(line[4]);
                   
                   if(leaveDays>remainVL){
                       return false;
                   }
                   
                }
                else if(line[0].equals(employeenum) & leaveType.equals("Sick Leave")){
                   int remainEL = Integer.parseInt(line[3]);
                   
                   if(leaveDays>remainEL){
                       return false;
                   }
                   
                }
            }
            
            return true;
            
        }
    }
    
    public void ApplyLeave(String filename, String leaveType, String days) throws FileNotFoundException, IOException, CsvValidationException {
        
        String tempfilename = filename.replace(".csv", ".tmp");
        
        try(CSVWriter csvwriter = new CSVWriter(new FileWriter(tempfilename,true))){
            
            String[] line;

            
            CSVReader csvreader = new CSVReader(new FileReader(filename));        
            
            String[] header =csvreader.readNext();
            csvwriter.writeNext(header);
            
            while((line=csvreader.readNext())!=null){
                if(line[0].equals(employeenum) & leaveType.equals("Sick Leave")){
                    
                    line[3] = String.valueOf(Integer.parseInt(line[3])-Integer.parseInt(days));
                        
                }
                else if(line[0].equals(employeenum) & leaveType.equals("Vacation Leave")){
                    line[4] = String.valueOf(Integer.parseInt(line[4])-Integer.parseInt(days));
                }
                else if(line[0].equals(employeenum) & leaveType.equals("Sick Leave")){
                    line[5] = String.valueOf(Integer.parseInt(line[5])-Integer.parseInt(days));
                }
                

               csvwriter.writeNext(line); 
               
            } 
            
            csvreader.close();
               
        }
        finally{
            new File(filename).delete();
            new File(tempfilename).renameTo(new File(filename));
        }
        
    }
    
    public void createLeaveApplication(String dateFiled, String leaveType, String days,String start, String end) throws IOException, CsvValidationException{
        
        String file="Remaining_Leave.csv";
        
        CSVReader csvreader = new CSVReader(new FileReader(file));
        String [] line;
        String remainsl=null;
        String remainvl=null;
        String remainel=null;
        
        while((line=csvreader.readNext())!=null){
            if(line[0].equals(employeenum)){
                remainsl = line[3];
                remainvl = line[4];
                remainel = line[5];
                break;
            }
        }
        csvreader.close();
        
        
        
        try(CSVWriter csvwriter= new CSVWriter(new FileWriter("Leave Application.csv"))){
            
            String[] line1 = {"Date Filed:",dateFiled};
            String[] line2 = {"Employee Number:",employeenum};
            String[] line3 = {"Last Name:",lastname};
            String[] line4 = {"First Name:",firstname};
            String[] line5 = {"Type of Leave Applied:",leaveType};
            String[] line6 = {"Number of Days:",days};
            String[] line7 = {"Start Date:",start};
            String[] line8 = {"End Date:",end};  
            String[] line9 = {"Application Status:","Approved"};
            String[] line10 ={"Remarks:",""};
            String[] line11 ={"Remaining Sick Leave:",remainsl};
            String[] line12 ={"Remaining Vacation Leave",remainvl};
            String[] line13 ={"Remaining Emergency Leave:",remainel};

            csvwriter.writeNext(line1);
            csvwriter.writeNext(line2);
            csvwriter.writeNext(line3);
            csvwriter.writeNext(line4);
            csvwriter.writeNext(line5);
            csvwriter.writeNext(line6);
            csvwriter.writeNext(line7);
            csvwriter.writeNext(line8);
            csvwriter.writeNext(line9);
            csvwriter.writeNext(line10);
            csvwriter.writeNext(line11);
            csvwriter.writeNext(line12);
            csvwriter.writeNext(line13);

           
            
        }
    }
    
    
}

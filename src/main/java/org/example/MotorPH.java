package org.example;
import java.util.Scanner;
public class MotorPH { //username and password is "admin"

    public static void main(String[] args) {

        String EmpNo, Lname, Fname, BDay, Add, PNo, SSS, PHealth, TIN, Pibig, Stat, Pos, ISup;
        double BSalary, RSub, PAll, CAll, GSM, HRate;

        String EmpNo2, Lname2, Fname2, BDay2, Add2, PNo2, SSS2, PHealth2, TIN2, Pibig2, Stat2, Pos2, ISup2;
        double BSalary2, RSub2, PAll2, CAll2, GSM2, HRate2;

        //employee 1
        EmpNo = "10001";
        Lname = "Crisostomo";
        Fname = "Jose";
        BDay = "February 14, 1988";
        Add = "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands";
        PNo = "918-621-603";
        SSS = "49-1632020-8";
        PHealth = "382189453145";
        TIN = "317-674-022-000";
        Pibig = "441093369646";
        Stat = "Regular";
        Pos = "HR Manager";
        ISup = "N/A";
        BSalary = 62670;
        RSub = 1500;
        PAll = 1000;
        CAll = 1000;
        GSM = 31355;
        HRate = 373.04;


        //employee 2
        EmpNo2 = "10002";
        Lname2 = "Mata";
        Fname2 = "Christian";
        BDay2 = "October 21, 1987";
        Add2 = "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu ";
        PNo2 = "783-776-744";
        SSS2 = "49-2959312-6";
        PHealth2 = "824187961962";
        TIN2 = "103-100-522-000";
        Pibig2 = "631052853464";
        Stat2 = "Regular";
        Pos2 = "Account Team Leader";
        ISup2 = "Romualdez, Fredrick";
        BSalary2 = 42975;
        RSub2 = 1500;
        PAll2 = 800;
        CAll2 = 800;
        GSM2 = 21488;
        HRate2 = 255.80;

        {   //Username & password is "admin"

            Scanner console = new Scanner(System.in);
            String user, pass;

            System.out.println("+---------------------+");
            System.out.println("|        LOGIN         |");
            System.out.println("+---------------------+");
            System.out.println(" username:");
            user = console.nextLine();
            System.out.println(" password:");
            pass = console.nextLine();


            if (user.equals("admin") && (pass.equals("admin"))) {
                System.out.println("+---------------------+");
                System.out.println("| [1] Employee 10001  |");
                System.out.println("+---------------------+");
                System.out.println("| [2] Employee 10002  |");
                System.out.println("+---------------------+");

                {
                    Scanner scan1 = new Scanner(System.in);
                    System.out.println();
                    int n = scan1.nextInt();
                    if (n == 1) {
                        System.out.println("************************************************************************************");
                        System.out.println("*Employee #              :" + EmpNo);
                        System.out.println("*First Name              :" + Fname);
                        System.out.println("*Last Name               :" + Lname);
                        System.out.println("*Birthday                :" + BDay);
                        System.out.println("*Address                 :" + Add);
                        System.out.println("*Phone Number            :" + PNo);
                        System.out.println("*SSS #                   :" + SSS);
                        System.out.println("*Philhealth #            :" + PHealth);
                        System.out.println("*TIN #                   :" + TIN);
                        System.out.println("*Pag-ibig #              :" + Pibig);
                        System.out.println("*Status                  :" + Stat);
                        System.out.println("*Position                :" + Pos);
                        System.out.println("*Immediate Supervisor    :" + ISup);
                        System.out.println("*Basic Salary            :" + BSalary);
                        System.out.println("*Rice Subsidy            :" + RSub);
                        System.out.println("*Phone Allowance         :" + PAll);
                        System.out.println("*Clothing Allowance      :" + CAll);
                        System.out.println("*Gross Semi-monthly Rate :" + GSM);
                        System.out.println("*Hourly Rate             :" + HRate);
                        System.out.println("|----------------------------------------------------------------------------------|");
                        //number of hours worked per day
                        int day1 = 9; // 5/9/2022
                        int day2 = 9; // 6/9/2022
                        int day3 = 9; // 7/9/2022
                        int day4 = 9; // 8/9/2022
                        int day5 = 9; // 9/9/2022
                        int hoursWorked = (day1 + day2 + day3 + day4 + day5);
                        double DailyRate = 3357.36;
                        double basicSalary = 62670;

                            double SSScontribution = 1125; //SSS Contribution

                            double pagIBIGContribution = 0.02 * basicSalary; //PAGIBIG DEDUCTIONS

                            double PhilhealthContribution = 940.05; //PHILHEALTH DEDUCTIONS: 3% of basicSalary = 1880.1 then divide by 2 = 940.05

                            double TotalDeduct = SSScontribution + pagIBIGContribution+ PhilhealthContribution;
                            double TaxableIncome = basicSalary-TotalDeduct;

                            double WithTax = (TaxableIncome-33333)*.25+2500;

                            System.out.println("                ");
                            System.out.println("  Hours worked in a day           : " + day1 + " hours");
                            System.out.println("  Sum of hours worked in a week   : " + hoursWorked + " hours   from 5/9/2022 to 9/9/2022 ");
                            System.out.println("  Weekly Gross Salary             :" + DailyRate * 5);
                            System.out.println("|------+----------+----------------------------------------------------------------|");
                            System.out.println("       |Deductions|");
                            System.out.println("       +----------+");
                            System.out.println("SSS              : " + SSScontribution);
                            System.out.println("Pagibig          : " + pagIBIGContribution);
                            System.out.println("Philhealth       : " + PhilhealthContribution);
                            System.out.println("Total Deduction  : " + TotalDeduct);
                            System.out.println("Taxable Income   : " + TaxableIncome);
                            System.out.println("Withholding Tax   : " + WithTax);

                            System.out.println("************************************************************************************");

                        } else if (n == 2) {
                            System.out.println("************************************************************************************");
                            System.out.println("*Employee #              :" + EmpNo2);
                            System.out.println("*First Name              :" + Fname2);
                            System.out.println("*Last Name               :" + Lname2);
                            System.out.println("*Birthday                :" + BDay2);
                            System.out.println("*Address                 :" + Add2);
                            System.out.println("*Phone Number            :" + PNo2);
                            System.out.println("*SSS #                   :" + SSS2);
                            System.out.println("*Philhealth #            :" + PHealth2);
                            System.out.println("*TIN #                   :" + TIN2);
                            System.out.println("*Pag-ibig #              :" + Pibig2);
                            System.out.println("*Status                  :" + Stat2);
                            System.out.println("*Position                :" + Pos2);
                            System.out.println("*Immediate Supervisor    :" + ISup2);
                            System.out.println("*Basic Salary            :" + BSalary2);
                            System.out.println("*Rice Subsidy            :" + RSub2);
                            System.out.println("*Phone Allowance         :" + PAll2);
                            System.out.println("*Clothing Allowance      :" + CAll2);
                            System.out.println("*Gross Semi-monthly Rate :" + GSM2);
                            System.out.println("*Hourly Rate             :" + HRate2);
                            System.out.println("|----------------------------------------------------------------------------------|");

                            //number of hours worked per day with same attendance and hours worked as the 1st employee
                            int day1b = 9; // 5/9/2022
                            int day2b = 9; // 6/9/2022
                            int day3b = 9; // 7/9/2022
                            int day4b = 9; // 8/9/2022
                            int day5b = 9; // 9/9/2022
                            int NumHoursinWeek2 = (day1b + day2b + day3b + day4b + day5b);
                            double DailyRate2 = 2302.2;
                            System.out.println("                ");
                            System.out.println("Hours worked in a day           : " + day1b + " hours");
                            System.out.println("                         ");
                            System.out.println("Sum of hours worked in a week   : " + NumHoursinWeek2 + " hours  from 5/9/2022 to 9/9/2022 ");
                            System.out.println("                                    ");
                            System.out.println("Weekly Gross Salary             :" + DailyRate2 * 5);
                            System.out.println("|-------------------------------+--------------------+------------------------------|");
                            System.out.println("|                               | Under Construction |                              |");
                            System.out.println("|-------------------------------+--------------------+------------------------------|");
                            System.out.println("************************************************************************************");
                        } else {
                            System.out.println("Employee not found!");
                        }


                    }
                } else{
                    System.out.println("Oops! wrong username or password! ¯\\_(ツ)_/¯");
                }
            }
        }

    }


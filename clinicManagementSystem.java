/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clinic;

import java.util.Calendar;
import java.util.Scanner;
public class clinicManagementSystem {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 
	        String[] months = {
	            "Jan",
	            "Feb",
	            "Mar",
	            "Apr",
	            "May",
	            "Jun",
	            "Jul",
	            "Aug",
	            "Sep",
	            "Oct",
	            "Nov",
	            "Dec"
	        };
	   	
	        Calendar calendar = Calendar.getInstance();
	        //System.out.println("--------------------------------------------------------------------------------");
	        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4;
		System.out.println("\n--------------------------------------------------------------------------------");
	        System.out.println("                  ***   Clinic Management System   ***");
	        System.out.println("--------------------------------------------------------------------------------");
	        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
	        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
	        doctor[] d = new doctor[25];
	        patient[] p = new patient[100];
	        lab[] l = new lab[20];
	        facility[] f = new facility[20];
	        medical[] m = new medical[100];

	        int i;
	        for (i = 0; i < 25; i++)
	            d[i] = new doctor();
	        for (i = 0; i < 100; i++)
	            p[i] = new patient();
	        for (i = 0; i < 20; i++)
	            l[i] = new lab();
	        for (i = 0; i < 20; i++)
	            f[i] = new facility();
	        for (i = 0; i < 100; i++)
	            m[i] = new medical();

	        

	        d[0].did = "21";
	        d[0].dname = "Dr.Ahmed";
	        d[0].specilist = "ENT";
	        d[0].appoint = "5-11AM";
	        d[0].doc_qual = "MBBS,MD";
	        d[0].droom = 17;
	        d[1].did = "32";
	        d[1].dname = "Dr.Vikram";
	        d[1].specilist = "Physician";
	        d[1].appoint = "10-3AM";
	        d[1].doc_qual = "MBBS,MD";
	        d[1].droom = 45;
	        d[2].did = "17";
	        d[2].dname = "Dr.Ali";
	        d[2].specilist = "Surgeon";
	        d[2].appoint = "8-2AM";
	        d[2].doc_qual = "BDM";
	        d[2].droom = 8;
	        d[3].did = "33";
	        d[3].dname = "Dr.Rameez";
	        d[3].specilist = "Artho";
	        d[3].appoint = "10-4PM";
	        d[3].doc_qual = "MBBS,MS";
	        d[3].droom = 40;

	       
	        p[1].pid = "13";
	        p[1].pname = "Sumit";
	        p[1].disease = "Cold";
	        p[1].sex = "Male";
	        p[1].admit_status = "y";
	        p[1].age = 23;
	        p[2].pid = "14";
	        p[2].pname = "Alok";
	        p[2].disease = "Maleriya";
	        p[2].sex = "Male";
	        p[2].admit_status = "y";
	        p[2].age = 45;
	        p[3].pid = "15";
	        p[3].pname = "Furqan";
	        p[3].disease = "Diaetes";
	        p[3].sex = "Male";
	        p[3].admit_status = "y";
	        p[3].age = 25;

	        m[0].med_name = "Corex";
	        m[0].med_comp = "Cino pvt";
	        m[0].exp_date = "9-5-23";
	        m[0].med_cost = 55;
	        m[0].count = 8;
	        m[1].med_name = "Nytra";
	        m[1].med_comp = "Ace pvt";
	        m[1].exp_date = "4-4-24";
	        m[1].med_cost = 500;
	        m[1].count = 5;
	        m[2].med_name = "Brufa";
	        m[2].med_comp = "Reckitt";
	        m[2].exp_date = "12-7-22";
	        m[2].med_cost = 50;
	        m[2].count = 56;
	        m[3].med_name = "Pride";
	        m[3].med_comp = "DDF pvt";
	        m[3].exp_date = "12-4-23";
	        m[3].med_cost = 1100;
	        m[3].count = 100;

	        l[0].fecility = "X-ray     ";
	        l[0].lab_cost = 800;
	        l[1].fecility = "CT Scan   ";
	        l[1].lab_cost = 1200;
	        l[2].fecility = "OR Scan   ";
	        l[2].lab_cost = 500;
	        l[3].fecility = "Blood Bank";
	        l[3].lab_cost = 50;

	        f[0].fec_name = "Ambulance";
	        f[1].fec_name = "Admit Facility ";
	        f[2].fec_name = "Canteen";
	        f[3].fec_name = "Emergency";


	        Scanner input = new Scanner(System.in);
	        
	        int choice, j, c1, status = 1, s1, s2, s3, s4, s5;

		while (status == 1)
	        {
	            System.out.println("\n                                    MAIN MENU");
	            System.out.println("-----------------------------------------------------------------------------------");
	            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities   ");
	            System.out.println("-----------------------------------------------------------------------------------");
	            choice = input.nextInt();
				switch (choice) {
					case 1 -> {
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("                      **DOCTOR SECTION**");
						System.out.println("--------------------------------------------------------------------------------");
						s1 = 1;
						while (s1 == 1) {
							System.out.println("1.Add New Entry\n2.Existing Doctors List");
							c1 = input.nextInt();
							switch (c1) {
								case 1 -> {
									d[count1].new_doctor();
									count1++;
								}
								case 2 -> {
									System.out.println("--------------------------------------------------------------------------------");
									System.out.println("id \t Name\t Specialist \t Timing \t Qualification \t Room No.");
									System.out.println("--------------------------------------------------------------------------------");
									for (j = 0; j < count1; j++) {
										d[j].doctor_info();
									}
								}
							}
							System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
							s1 = input.nextInt();
						}
					}
					case 2 -> {
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("                     **PATIENT SECTION**");
						System.out.println("--------------------------------------------------------------------------------");
						s2 = 1;
						while (s2 == 1) {
							System.out.println("1.Add New Entry\n2.Existing Patients List");
							c1 = input.nextInt();
							switch (c1) {
								case 1 -> {
									p[count2].new_patient();
									count2++;
								}
								case 2 -> {
									System.out.println("--------------------------------------------------------------------------------");
									System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
									System.out.println("--------------------------------------------------------------------------------");
									for (j = 0; j < count2; j++) {
										p[j].patient_info();
									}
								}
							}
							System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
							s2 = input.nextInt();
						}
					}
					case 3 -> {
						s3 = 1;
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("                     **MEDICINE SECTION**");
						System.out.println("--------------------------------------------------------------------------------");
						while (s3 == 1) {
							System.out.println("1.Add New Entry\n2. Existing Medicines List");
							c1 = input.nextInt();
							switch (c1) {
								case 1 -> {
									m[count3].new_medi();
									count3++;
								}
								case 2 -> {
									System.out.println("--------------------------------------------------------------------------------");
									System.out.println("Name \t Company \t Expiry Date \t Cost");
									System.out.println("--------------------------------------------------------------------------------");
									for (j = 0; j < count3; j++) {
										m[j].find_medi();
									}
								}
							}
							System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
							s3 = input.nextInt();
						}
					}
					case 4 -> {
						s4 = 1;
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("                    **LABORATORY SECTION**");
						System.out.println("--------------------------------------------------------------------------------");
						while (s4 == 1) {
							System.out.println("1.Add New Entry \n2.Existing Laboratories List");
							c1 = input.nextInt();
							switch (c1) {
								case 1 -> {
									l[count4].new_feci();
									count4++;
								}
								case 2 -> {
									System.out.println("--------------------------------------------------------------------------------");
									System.out.println("Facilities\t\t Cost");
									System.out.println("--------------------------------------------------------------------------------");
									for (j = 0; j < count4; j++) {
										l[j].feci_list();
									}
								}
							}
							System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
							s4 = input.nextInt();
						}
					}
					case 5 -> {
						s5 = 1;
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("          **HOSPITAL FACILITY SECTION**");
						System.out.println("--------------------------------------------------------------------------------");
						while (s5 == 1) {
							System.out.println("1.Add New Facility\n2.Existing Facilities List");
							c1 = input.nextInt();
							switch (c1) {
								case 1 -> {
									f[count5].add_feci();
									count5++;
								}
								case 2 -> {
									System.out.println("--------------------------------------------------------------------------------");
									System.out.println("Hospital  Facility are:");
									System.out.println("--------------------------------------------------------------------------------");
									for (j = 0; j < count5; j++) {
										f[j].show_feci();
									}
								}
							}
							System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
							s5 = input.nextInt();
						}
					}

					default -> System.out.println(" You Have Enter Wrong Choice!!!");
				}
	            System.out.println("\nReturn to MAIN MENU Press 1");
	            status = input.nextInt();
	            
	           
	    }


		
	}
}

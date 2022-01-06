package com.mycompany.clinic;
import java.util.*;
public class lab {
	  String fecility;
	    int lab_cost;
	    void new_feci()
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("facility:-");
	        fecility = input.nextLine();
	        System.out.print("cost:-");
	        lab_cost = input.nextInt();
	    }
	    void feci_list()
	    {
	        System.out.println(fecility + "\t\t" + lab_cost);
	    }
	}


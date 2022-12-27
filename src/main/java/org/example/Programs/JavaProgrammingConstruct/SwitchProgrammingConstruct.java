package org.example.Programs.JavaProgrammingConstruct;

import java.util.Scanner;

public class SwitchProgrammingConstruct {
    // String class == operator and eqauls method internal working

    public static void normalSwitchCase(){
        try(Scanner scanner=new Scanner(System.in)){
            String fruits = scanner.next();
            switch (fruits){
                case "mango":
                    System.out.println("I am eating mango");
                    break;
                case "orange":
                    System.out.println("I am eating orange");
                   break;
                case "apple":
                    System.out.println("King of all fruits");
                   break;
                default:
                    System.out.println("Invalid String");
            }
        }
    }
        public static void nestedSwitchCase(){
          try(Scanner scanner=new Scanner(System.in)){
             int empId= scanner.nextInt();
             String deptName=scanner.next();
             switch (empId){
                 case 1:
                     System.out.println("Raj");
                     break;
                 case 2:
                     System.out.println("Nilendra");
                     break;
                 case 3:
                     System.out.println("Ashutosh");
                     switch (deptName){
                         case "IT":
                             System.out.println("Hey! I am in IT Department");
                             break;
                         default:
                             System.out.println("Invalid Input");
                     }
                     break;
                 default:
                     System.out.println("Invalid Input");
             }
          }
        }
    }


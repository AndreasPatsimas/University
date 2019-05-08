/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Εκκίνηση Προγράμματος");
        System.out.println("................");
        boolean runProgram = true;
        boolean addLesson = true;
        Float degree = null;
        while(runProgram == true){
            System.out.println("Δώσε τον αριθμό μητρώου του φοιτητη...");
            System.out.println("Αν θες να σταματήσει το πρόγραμμα "
                    + "πληκτρολόγησε το μητρώο '000000'.");
            Scanner sc = new Scanner(System.in);
            String registerNumber = sc.next();
            Float averageDegree = 0f;
            Float sumDegree = 0f;
            int countCourse = 0;
            if(registerNumber.equals("000000")){
                break;
            }
            while(addLesson == true){
                System.out.println("Δώσε το όνομα του μαθήματος...");
                System.out.println("Αν είναι το τελευταίο μάθημα που έδωσε"
                        + " ο φοιτητής πληκτρολόγησε τη λέξη 'end'.");
                String course = sc.next();
                if(course.equals("end")){
                    averageDegree = sumDegree/countCourse;
                    System.out.println("Ο φοιτητής με αριθμό μητρώου "
                            +registerNumber+" έχει μέσο όρο βαθμολογίας "
                            +averageDegree+" .");
                    break;
                }
                System.out.println("Δώσε το βαθμό του μαθήματος...");
                try{
                    degree = sc.nextFloat();
                    while(degree <0 || degree>10){
                        System.out.println("Δώσε έναν πραγματικό αριθμό από το 0 εώς το 10...");
                        degree = sc.nextFloat();
                    }
                    
                }
                catch(Exception ex){
                    System.out.println("Δώσε έναν πραγματικό αριθμό από το 0 εώς το 10...");
                    sc.next();
                    degree = sc.nextFloat();
                    while(degree <0 || degree>10){
                        System.out.println("Δώσε έναν πραγματικό αριθμό από το 0 εώς το 10...");
                        degree = sc.nextFloat();
                    }
                }
                sumDegree = sumDegree + degree;
                countCourse = countCourse + 1;
            }
        }
    }
    
}

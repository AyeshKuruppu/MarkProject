import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int maximum = 0;
        int minimum = 0;

        String name= JOptionPane.showInputDialog(null,"Enter Your Name");
        String enterIndex = JOptionPane.showInputDialog(null,"Enter Index");

        String input1 = JOptionPane.showInputDialog(null,"Enter Your Buddhism marks");
        int mark1 = Integer.parseInt(input1);
        if(mark1 >=0 && mark1 <=100){
            if(mark1 >=0 && mark1 <=34){
                JOptionPane.showMessageDialog(null,"F Pass");
            }else if(mark1 >=35 && mark1<=54){
                JOptionPane.showMessageDialog(null,"S Pass");
            }else if(mark1 >=55 && mark1<=64) {
                JOptionPane.showMessageDialog(null," C Pass");
            }else if(mark1 >=65 && mark1<=74) {
                JOptionPane.showMessageDialog(null," B Pass");

            }else if(mark1 >=75 && mark1<=100) {
                JOptionPane.showMessageDialog(null,"A Pass");
            }else{

            }
        }else{
            System.out.println("Invalid Marks Check Again");
        }


        String input2 = JOptionPane.showInputDialog(null,"Enter Your Sinhala marks");
        int mark2 = Integer.parseInt(input2);
        if(mark2 >=0 && mark2 <=100){
            if(mark2 >=0 && mark2 <=34){
                JOptionPane.showMessageDialog(null,"F Pass");
            }else if(mark2 >=35 && mark2<=54){
                JOptionPane.showMessageDialog(null,"S Pass");
            }else if(mark2 >=55 && mark2<=64) {
                JOptionPane.showMessageDialog(null," C Pass");
            }else if(mark2 >=65 && mark2<=74) {
                JOptionPane.showMessageDialog(null," B Pass");

            }else if(mark2 >=75 && mark2<=100) {
                JOptionPane.showMessageDialog(null,"A Pass");
            }else{

            }
        }else{
            System.out.println("Invalid Marks Check Again");
        }

        String input3 = JOptionPane.showInputDialog(null,"Enter Your History marks");
        int mark3 = Integer.parseInt(input3);
        if(mark3 >=0 && mark3 <=100){
            if(mark3 >=0 && mark3 <=34){
                JOptionPane.showMessageDialog(null,"F Pass");
            }else if(mark3 >=35 && mark3<=54){
                JOptionPane.showMessageDialog(null,"S Pass");
            }else if(mark3 >=55 && mark3<=64) {
                JOptionPane.showMessageDialog(null," C Pass");
            }else if(mark3 >=65 && mark3<=74) {
                JOptionPane.showMessageDialog(null," B Pass");

            }else if(mark3 >=75 && mark3<=100) {
                JOptionPane.showMessageDialog(null,"A Pass");
            }else{

            }
        }else{
            System.out.println("Invalid Marks Check Again");
        }


        String input4 = JOptionPane.showInputDialog(null,"Enter Your English marks");
        int mark4 = Integer.parseInt(input4);
        if(mark4 >=0 && mark4 <=100){
            if(mark4 >=0 && mark4 <=34){
                JOptionPane.showMessageDialog(null,"F Pass");
            }else if(mark4 >=35 && mark4<=54){
                JOptionPane.showMessageDialog(null,"S Pass");
            }else if(mark4 >=55 && mark4<=64) {
                JOptionPane.showMessageDialog(null," C Pass");
            }else if(mark4 >=65 && mark4<=74) {
                JOptionPane.showMessageDialog(null," B Pass");

            }else if(mark4 >=75 && mark4<=100) {
                JOptionPane.showMessageDialog(null,"A Pass");
            }else{

            }
        }else{
            System.out.println("Invalid Marks Check Again");
        }


        String input5 = JOptionPane.showInputDialog(null,"Enter Your Mathematics marks");
        int mark5 = Integer.parseInt(input5);
        if(mark5 >=0 && mark5 <=100){
            if(mark4 >=0 && mark4 <=34){
                JOptionPane.showMessageDialog(null,"F Pass");
            }else if(mark5 >=35 && mark5<=54){
                JOptionPane.showMessageDialog(null,"S Pass");
            }else if(mark5 >=55 && mark5<=64) {
                JOptionPane.showMessageDialog(null," C Pass");
            }else if(mark5 >=65 && mark5<=74) {
                JOptionPane.showMessageDialog(null," B Pass");

            }else if(mark5 >=75 && mark5<=100) {
                JOptionPane.showMessageDialog(null,"A Pass");
            }else{

            }
        }else{
            System.out.println("Invalid Marks Check Again");
        }


        String input6 = JOptionPane.showInputDialog(null,"Enter Your Science marks");
        int mark6 = Integer.parseInt(input6);
        if(mark6 >=0 && mark6 <=100){
            if(mark6 >=0 && mark6 <=34){
                JOptionPane.showMessageDialog(null,"F Pass");
            }else if(mark6 >=35 && mark6<=54){
                JOptionPane.showMessageDialog(null,"S Pass");
            }else if(mark6 >=55 && mark6<=64) {
                JOptionPane.showMessageDialog(null," C Pass");
            }else if(mark6 >=65 && mark6<=74) {
                JOptionPane.showMessageDialog(null," B Pass");

            }else if(mark6 >=75 && mark6<=100) {
                JOptionPane.showMessageDialog(null,"A Pass");
            }else{

            }
        }else{
            System.out.println("Invalid Marks Check Again");
        }


        if(mark1 >= mark2 && mark1 >= mark3 && mark1 >= mark4 && mark1 >=mark5 && mark1 >= mark6 ){
            maximum = mark1;
        }else if(mark2 >= mark1 && mark2 >= mark3 && mark2 >= mark4 && mark2 >=mark5 && mark2 >= mark6){
            maximum = mark2;
        }else if(mark3 >= mark1 && mark3 >= mark2 && mark3 >= mark4 && mark3 >=mark5 && mark3 >= mark6){
            maximum = mark3;
        } else if (mark4 >= mark1 && mark4 >= mark2 && mark4 >= mark3 && mark4 >=mark5 && mark4 >= mark6) {
            maximum = mark4;
        }else if (mark5 >= mark1 && mark5 >= mark2 && mark5 >= mark3 && mark5 >=mark4 && mark5 >= mark6) {
            maximum = mark5;
        }else if (mark6 >= mark1 && mark6 >= mark2 && mark6 >= mark3 && mark6 >=mark4 && mark6 >= mark5){
            maximum = mark6;
        }
        JOptionPane.showMessageDialog(null,"The Maximum Mark is "  + maximum);

        if(mark1 <= mark2 && mark1 <= mark3 && mark1 <= mark4 && mark1 <=mark5 && mark1 <= mark6 ){
            minimum = mark1;
        }else if (mark2 <= mark1 && mark2 <= mark3 && mark2 <= mark4 && mark2 <=mark5 && mark2 <= mark6 ){
            minimum = mark2;
        }else if(mark3 <= mark1 && mark3 <= mark2 && mark3 <= mark4 && mark3 <=mark5 && mark3 <= mark6) {
            minimum = mark3;
        }else if  (mark4 <= mark1 && mark4 <= mark2 && mark4 <= mark3 && mark4 <=mark5 && mark4 <= mark6) {
            minimum = mark4;
        }else if (mark5 <= mark1 && mark5 <= mark2 && mark5 <= mark3 && mark5 <=mark4 && mark5 <= mark6) {
            minimum = mark5;
        }else if (mark6 <= mark1 && mark6 <= mark2 && mark6 <= mark3 && mark6 <=mark4 && mark6 <= mark5) {
            minimum = mark6;
        }
        JOptionPane.showMessageDialog(null,"The Maximum Mark is "  + minimum);


        int sum = mark1 + mark2 + mark3 + mark4 + mark5 + mark6;
        double average = sum/6;
        int rank = 0;
        int gap = maximum - minimum;

        JOptionPane.showMessageDialog(null,"Your total marks for subject is  "  +  sum);
        JOptionPane.showMessageDialog(null,"Your total average for subject is  "  +  average);
        JOptionPane.showMessageDialog(null,"Your Gap Highest Mark and Lowest Mark  "  +  gap);

        if(average<50){
            JOptionPane.showMessageDialog(null,"You Fail and Repeat to next batch");
        }else{
            JOptionPane.showMessageDialog(null,"Congratulations : You Pass to next Batch");
        }
        JOptionPane.showMessageDialog(null,"THANK YOU ");



    }
}
/**
 *
 * @author bjuan
 */

import java.util.Scanner;

public class Reversoinador {

    public static void main(String[] args) {

        //String trys = "abcdefghijklmnopqrstuvwxyz";
        //System.out.println(trys.length());
        //System.out.println(trys.charAt(trys.length()-1));
        //for (int i=trys.length()-1;i>=0;i--){
        //    System.out.println(i);
        //    System.out.println(trys.charAt(i));
        //}
        Reversoinador.menu();
    }
    
    public static void menu() {
        
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        
        while (flag==true){
            
            System.out.print("BIENVENIDO AL REVERSOINADOR"
                    +"\n"
                    + "\nCOMO DESEA OPERAR?"
                    + "\n(1) Ingresar numero"
                    + "\n(2) Finalizar"
                    + "\n");
            
            int option = input.nextInt();
            
            switch (option){
                
                case 1:
                    Reversoinador.input();
                case 2:
                    flag=false;
                    
            }
        }
    }
    public static void input() {
        
        Scanner input = new Scanner(System.in);
        int num = 0;
        try {
            System.out.println("\nIngrese el numero ENTERO a invertir:");
            num = input.nextInt();
        }
        catch (Exception e) {
            System.out.println("\nNO INGRESO UN NUMERO/NUMERO ENTERO\n");
            System.out.print("       ~~~~~~~~~"
                    +"\n     /           \\"
                    +"\n    /             \\"
                    +"\n   | )           ( |"
                    +"\n    \\  /C\\   /C\\  /"
                    +"\n    /  ~~~   ~~~  \\"
                    +"\n    \\___  .^,  ___/"
                    +"\n     `| _______ |'"
                    +"\n  _   | HHHHHHH |   _"
                    +"\n ( )  \\         /  ( )"
                    +"\n(_) \\  ~~~~^~~~~ ,/ (_)"
                    +"\n  ~\\ \"\\         /  /~"
                    +"\n     \\  \\     /  /"
                    +"\n       \\  \\v/  /"
                    +"\n        >     <"
                    +"\n       /  /^\\  \\"
                    +"\n     /  /     \\  \\"
                    +"\n _~/ \"/         \\  \\~_"
                    +"\n( ) /             \\ ( )"
                    +"\n (_)               (_)\n");
            Reversoinador.input();
        }
        Reversoinador.create(num);
        //String strNum = Integer.toString(num);
        //String reverseNum = "";
        //Reversoinador.reverse(strNum,reverseNum);
    }
    public static void create(int num) {
        
        String strNum = Integer.toString(num);
        String reverseNum = "";
        Reversoinador.reverse(strNum,reverseNum);
    }
    //public static void reverse(int num) {
    //    
    //    String strNum = Integer.toString(num);
    //    String reverseNum = new String();
    //    for (int i=strNum.length()-1;i>=0;i--){
    //        reverseNum = reverseNum+strNum.charAt(i);
    //    }
    //    System.out.println("\nEl numero invertido es: "+reverseNum+"\n");
    //    Reversoinador.menu();
    //}
    public static void reverse(String strNum, String reverseNum){
        
        if (strNum.length()>0){
            
            reverseNum = reverseNum+strNum.charAt(strNum.length()-1);
            //System.out.println(reverseNum);
            strNum = strNum.substring(0,strNum.length()-1);
            reverse(strNum,reverseNum);
        }
        else {
            System.out.println("\nEl numero invertido es: "+reverseNum+"\n");
            Reversoinador.menu();
        }
    }
}
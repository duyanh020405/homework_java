package util;

public class Validator{
    // Validate kiểu số nguyen
     static void ValidatorInt(String input) throws Exception {
        try{
            Integer.parseInt(input);
            System.out.println("Day vua nhap : "+input);
            System.out.println("Thuoc kieu int !!");

        }
        catch(NumberFormatException e){
            throw new Exception("Day khong thuoc kieu Int");

        }
    }

    //Validate kiểu số thực float

    static void ValidatorFloat(String input) throws Exception {
         try{
             Float.parseFloat(input);
             System.out.println("Day vua nhap : "+input);
             System.out.println("Thuoc kieu float !!");
         }
         catch(Exception e){
             throw new Exception("Day khong phai so thuc !");
         }
    }
//Validate kiểu số thực double
    static void ValidatorDouble(String input) throws Exception {
         try {
             Double.parseDouble(input);
             System.out.println("Day vua nhap : "+input);
             System.out.println("Thuoc kieu double !!");
         }
         catch(Exception e){
             throw new Exception("Day khong thuoc kieu double !!");
         }
    }


    static void ValidatorBoolean(String input) throws Exception {
        try {
            if (input == "true" || input == "false") {
                System.out.println("Day vua nhap : "+input);
                System.out.println("Thuoc kieu double !!");
            }
            else {
                throw new Exception("Day khong phai thuoc kieu boolean !");
            }

        }
        catch(Exception e){
            throw new Exception("Day khong thuoc kieu boolean !!");
        }
    }


    static void ValidatorString(String input) throws Exception {
             if(input.isEmpty()){
                 throw new Exception("Day khong duoc bo trong !!");
             }
             else {
                 System.out.println("Day vua nhap : "+input);
                 System.out.println("Thuoc kieu string !!");
             }
    }


    static void Validatorphone(String input) throws Exception {
         try {
             if(input.length()<=11 && input.matches("[0-9]{10}") && input.length()>=10) {
                 System.out.println("Day vua nhap : "+input);
                 System.out.println("Thuoc kieu phone !!");
             }
             else {
                 throw new Exception("Khong thuoc kieu phone !!");
             }

         }
         catch (Exception e){
             throw new Exception("Day khong dung kieu phone !! !");
         }
    }

    static void ValidatorEmail(String input) throws Exception {
         if(input.isEmpty()){
             throw new Exception("Day khong duoc bo trong !!");
         }
         else {
             String email = "^(.+)@(.+)$";
             if(input.matches(email)){
                 System.out.println("Day vua nhap : "+input);
                 System.out.println("Thuoc kieu email !!");
             }
             else {
                 throw new Exception("Khong thuoc kieu email !! !");
             }
         }
    }
}

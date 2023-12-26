import java.util.Scanner;

public class Kasir {

        String Username = "Dzikri";
        String Password = "TalakAda";
        String Captcha  = "2Q4LV";
        Boolean cekLogin = false;
        Boolean cekCaptcha = false;
        String cekUserName;
        String cekPassword;
        String captchaFinal;

        public String getcekUserName() {
            return cekUserName;
        }

    public void Login() {
        System.out.println("Welcome to Walawe mart a");
 
        Scanner masuk = new Scanner(System.in); {

            while (!cekLogin) {
                System.out.print("Username  : ");
                cekUserName = masuk.nextLine();
                System.out.print("Password  : ");
                cekPassword = masuk.nextLine();

                if (cekUserName.equals(Username) && cekPassword.equals(Password)) {
                    break;
                } else {
                    System.out.println("Input Salah");
                }
            }    

            while (!cekCaptcha){
                System.out.println("Kode Captcha : " + Captcha);
                System.out.print("Masukkan Captcha Diatas : ");
                captchaFinal = masuk.nextLine();

                if (captchaFinal.equals(Captcha)) {
                    System.out.println("Success!");
                    break;
                } else {
                    System.out.println("Error");
                }
            }  
        }  
        System.out.println("---------------------------");  
        
    masuk.close();
    }  
}  

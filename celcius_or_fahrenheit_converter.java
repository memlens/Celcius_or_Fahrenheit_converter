import java.util.Scanner;

public class TP{
  public static void main(String[] args) {
    //Début du programme
    Scanner sc = new Scanner(System.in);
    //variable pour recuperer le choix
    char choix = ' ';
    while (true) {
      //on demande à l'utilisateur ce qu'il veut faire
      System.out.println("1. Conversion Celcius - Fahrenheit");
      System.out.println("2. Conversion Fahrenheit - Celcius");
      System.out.println("3. Exit");
      System.out.println("Entrez votre choix : ");


      choix = sc.nextLine().charAt(0);
      if (choix == '3') {
        System.out.println("Merci d'avoir utilisé notre programme de Conversion !");
        break;
      }else if (choix == '1') {
        System.out.println("Vous avez choisi la Conversion de Celcius vers Fahrenheit");
        System.out.println("Température à convertir : ");
        float temp = 0.0f;
        float tempConver = 0.0f;
        temp = sc.nextFloat();
        sc.nextLine();
        tempConver = 32.0f + ((9.0f/5.0f) * temp);
        System.out.println(temp+" correspond à : "+tempConver);
      }else if (choix == '2') {
        float temp = 0.0f;
        float tempConver = 0.0f;
        System.out.println("Vous avez choisi la Conversion de Fahrenheit vers Celcius");
        temp = sc.nextFloat();
        sc.nextLine();
        tempConver = 32.0f + ((9.0f/5.0f) * temp);
        tempConver = ((temp - 32.0f) * 5.0f) / 9.0f;
        System.out.println(temp+" correspond à : "+tempConver);
      }else{
        System.out.println("Choix invalide !!");
        break;
      }
    }
  }
}

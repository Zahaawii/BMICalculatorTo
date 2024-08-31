import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class BMIinformationerto {

// Example 2

    static Scanner scanner = new Scanner(System.in);
    static String navn;
    static String efterNavn;
    static int alder;
    static double højde;
    static double vægt;


    public static void BrugerInformationer() {
        System.out.println("Indtast dit navn");
        navn = scanner.nextLine();
        System.out.println("Hej " + navn + " Indtast dit efternavn");
        efterNavn = scanner.nextLine();
        System.out.println("Hej " + navn + " " + efterNavn + " Vi mangler din alder, vægt og højde nu");
        System.out.println("Indtast dit alder");
        alder = scanner.nextInt();
        System.out.println("Indtast nu din vægt");
        vægt = scanner.nextDouble();
        System.out.println("Sidst men ikke mindst, din højde. Skal skrives fx som (1,85)");
        højde = scanner.nextDouble();

        System.out.println("Hej " + navn + " Du vejer: " + vægt + " Din højde er: " + højde);

    }

    public static void BMIformel(){
        BrugerInformationer();
        double bmiFormel = vægt / (højde * højde);
        if (bmiFormel <= 16) {
            System.out.println("Severe thinenss: " + bmiFormel);
        } else if (bmiFormel <= 17) {
            System.out.println("Moderate thinness: " + bmiFormel);
        } else if (bmiFormel <= 18.5) {
            System.out.println("Mild thinenss: " + bmiFormel);
        } else if (bmiFormel <= 25.5) {
            System.out.println("Normal weight: " + bmiFormel);
        } else if (bmiFormel <= 30) {
            System.out.println("Overweight:  " + bmiFormel);
        } else if (bmiFormel <= 35) {
            System.out.println("Change your lifestyle: " + bmiFormel);
        }
    }

}

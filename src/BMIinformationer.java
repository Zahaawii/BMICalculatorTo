import java.util.Scanner;

public class BMIinformationer {

    //example 1:
    static Scanner scanner = new Scanner(System.in);

    String navn;
    String efterNavn;
    int alder;
    double vægt;
    double højde;


    public BMIinformationer(String navn, String efterNavn, int alder, double vægt, double højde) {
        this.navn = navn;
        this.efterNavn = efterNavn;
        this.alder = alder;
        this.vægt = vægt;
        this.højde = højde;
    }


    public void BMIFormel () {
        double bmiFormel = vægt / (højde * højde);
        System.out.println(bmiFormel);
    }




}


public class BMIinformationer {

    double vægt;
    double højde;


    public BMIinformationer(double vægt, double højde) {

        this.vægt = vægt;
        this.højde = højde;
    }


    public void BMIFormel () {
        double bmiFormel = vægt / (højde * højde);
        System.out.println(bmiFormel);
    }




}

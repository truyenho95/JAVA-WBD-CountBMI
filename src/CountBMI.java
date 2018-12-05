import java.util.Scanner;

public class CountBMI {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double weight, height, bmi;

    System.out.print("Your weight (in kilogram):");
    weight = input.nextDouble();

    System.out.print("Your height (in meter):");
    height = input.nextDouble();

    bmi = getBMI(weight, height);
    String result = getResultBMI(bmi);
    System.out.printf("%-10.2f%s", bmi, result);
  }

  public static double getBMI(double weight, double height) {
    return weight/(height*height);
  }
  public static String getResultBMI (double bmi) {
    System.out.printf("%-10s%s", "bmi", "Interpretation\n");

    if (bmi < 18)
      return "Underweight";
    else if (bmi < 25.0)
      return "Normal";
    else if (bmi < 30.0)
      return "Overweight";
    else
      return "Obese";
  }
}

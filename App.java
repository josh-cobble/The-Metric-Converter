import java.util.Scanner;

public class App {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("\nWelcome to the metric converter!\n");

boolean run = true;

while (run) {
  System.out.println("Enter the number in front of the conversion you want to use. Ex: enter '1' (without the quotation marks) if you would like to convert cm to in.\n");
  System.out.println(" 1 (cm to in), 2 (cm to mm), 3 (ft to yd), 4 (m to ft)\n");
  System.out.println("Enter -1 to exit\n");

int unitOptions = scanner.nextInt();

if((unitOptions > 4) || ((unitOptions < 1) && (unitOptions != -1))) {
  System.out.println("\nThat is not a valid input.\n");
}
else if (unitOptions == -1) {
  System.out.println("\nExit successful.\n");
  run = false;
}
else if (unitOptions != -1) {
System.out.println("\nPlease enter the number of units to be converted. Ex: enter '2' (without the quotation marks) if you want to convert 2 cm to in.\n");

double numStartUnits = scanner.nextDouble();

if (((numStartUnits < 0) && (numStartUnits!= -1))) {
  System.out.println("Please enter a positive number.\n");
}
else if (numStartUnits == -1){
  System.out.println("\nExit successful.\n");
  run = false;
}
else if ((numStartUnits >= 0) && (numStartUnits != -1)) {
if (unitOptions == 1) {
  System.out.println(numStartUnits + " cm" + " is equal to " + (numStartUnits / 2.54) + " in.\n");
}
else if (unitOptions == 2) {
  System.out.println(numStartUnits + " cm" + " is equal to " + (numStartUnits * 10) + " mm.\n");
}
else if (unitOptions == 3) {
  System.out.println(numStartUnits + " ft" + " is equal to " + (numStartUnits / 3) + " yd.\n");
}
else if (unitOptions == 4) {
  System.out.println(numStartUnits + " m" + " is equal to " + (numStartUnits * 3.28084) + " ft.\n");
}

}

}

}

scanner.close();

}

}
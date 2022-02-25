import java.util.Scanner;

public class teste {
    
public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);


int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();

int x1;
int x2;
int Delta;

//formula de Delta
Delta = (b*b) - 4 * a * c;
System.out.println(Delta);

x1 = -b + Delta/2;
x2 = -b - Delta/2;

//Formula de Bhaskara
double bhaskara = (-b + Math.sqrt(Delta))/ (2*a);
double bhaskara1 = (-b - Math.sqrt(Delta))/ (2*a);



}

}

package Pesoideal;
import java.util.Scanner;
//Tendo como dados de entrada a altura (h) e o sexo de uma pessoa (um caracter m ou f), construir um programa que calcula seu peso ideal, utilizando as seguintes fórmulas:​ 
public class Pesoideal {
public static void main(String[] args) {
double h,pm,pf;
String sexo;
Scanner ler = new Scanner(System.in);
System.out.println("Digite a sua altura em metros: ");
h = ler.nextDouble();
ler.nextLine();
System.out.println("Digite o seu genero: ");
sexo = ler.nextLine();
if (sexo.equals("m")|| sexo.equals("M")) {
pm = (72.7*h)-58;
System.out.printf("O seu peso ideal é  %.2f %n" , pm);
}
else if(sexo.equals("f") || sexo.equals("F")){
pf = (62.1*h) - 44.7;
System.out.printf("O seu peso ideal é: %.2f %n " , pf);
}

}
}

import java.util.Scanner;
public class daire {
    
public static void main(String[] args) {
    int r, merkezAci;
    double alan;
    double pi=3.14;
    Scanner input=new Scanner(System.in);

    System.out.print("yarıçapı giriniz");
    if (input.hasNextInt()){
        r=input.nextInt();
    }
    else{
        System.out.print("Hatalı giriş yapıldı.");
        return;
    }

    System.out.print("merkez açısını giriniz");
    merkezAci=input.nextInt();
    if (merkezAci>=0 && merkezAci<=360){
        alan=(pi*r*r*merkezAci)/360;
        System.out.println("Dairenin alanı  :"+alan);
    }
    else{
        System.out.print("Hatalı giriş yapıldı.");
        return;
    }
}
}
import java.util.Scanner;

public class CinBurcu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Dogum yılınız:");
        a = sc.nextInt();
        b = a%12;
   switch (b)
   {
       case 0:System.out.println("Maymun burcu");break;
       case 1:System.out.println("Horoz burcu");break;
       case 2:System.out.println("Kopek burcu");break;
       case 3:System.out.println("Domuz burcu");break;
       case 4:System.out.println("Fare burcu");break;
       case 5:System.out.println("Okuz burcu");break;
       case 6:System.out.println("Kaplan burcu");break;
       case 7:System.out.println("Tavsan burcu");break;
       case 8:System.out.println("Ejderha burcu");break;
       case 9:System.out.println("Yılan burcu");break;
       case 10:System.out.println("At burcu");break;
       case 11:System.out.println("Koyun burcu");break;

   }
    }
}
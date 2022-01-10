import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava Sıcaklığına Göre Etkinlik Tavsiyesinde Bulunan Programa Hoşgeldiniz.");
        System.out.print("Lütfen Sıcaklığı Girin : ");
        int heat = scanner.nextInt();

        if(heat < 5){
            System.out.println("Kayak Yapabilirsiniz.");
        }else if(heat >= 5 && heat < 15){
            System.out.println("Sinema İzleyebilirsiniz.");
        }else if(heat >= 15 && heat < 25){
            System.out.println("Piknik Yapabilirsiniz.");
        }else if(heat > 25){
            System.out.println("Yüzebilirsiniz.");
        }
    }
}

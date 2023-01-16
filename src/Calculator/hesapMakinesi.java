package Calculator;

public class hesapMakinesi {

    int sayi =0;

    //simdi burada aynı bir metot gibi sınıf tanımlayacagım:
    public class Topla{ //sınıfımı tanımladım.
        public int topla(int i, int j){
            return i+j;
        }
    }

    //bu sefer de default bir class oluşturayım:
    class Cikar{
        public int cikar(int i, int b){
            return i-b;
        }
    }

    private class Carpma{
        public int carp(int a, int b){
            return a*b;
        }
    }

    public int carp(int i, int j){  //Carpma sınıfım private oldugu için boyle dışarıya bir metot tanımladım
        Carpma carpma = new Carpma();
        int carpim = carpma.carp(i,j);
        return carpim;

    }

    class Bolme{
        public String bol(int a, int b){
            if(b==0){
                System.out.println("bolen degeri 0 olamaz");
                return ""; //bundan dolayı metodu int degil string yaptık
            }else{
                int sonuc = a/b;
                return String.valueOf(sonuc);   //string.valueof()  int degeri stringe cevirir.
            }
        }
    }
}

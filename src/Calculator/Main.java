package Calculator;

public class Main {
    //javada uygulamalarımız main metodu ile başlar.
    //ve main metodu kesinlikle ublic ve satic olmalıdır. (psvmden aklına gelsin)
    public static void main(String[] args) {

        //bir sınıfa erişmek istersek de nesne uretip onun uzerinden erişecegiz.
        hesapMakinesi hm = new hesapMakinesi();
        hesapMakinesi.Topla toplayici = hm.new Topla();
        int toplam = toplayici.topla(5,6);
        System.out.println("toplam: " +toplam);

        hesapMakinesi.Cikar cikarici = hm.new Cikar();
        int fark = cikarici.cikar(9, 4);
        System.out.println(fark);

        hesapMakinesi.Bolme  bolucu = hm.new Bolme();
        String bolmeSonucu = bolucu.bol(45,5);
        System.out.println(bolmeSonucu);

        int carpim = hm.carp(6,4);
        System.out.println(carpim);
    }
}

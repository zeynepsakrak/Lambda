package practise;

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz

import java.util.Arrays;
import java.util.List;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,2,0,5,6,7,15,6,8);
        System.out.println("intL = " + intL);

        tekSayiAralarındaBosluk(intL);
        ciftlerinCarpimi(intL);
        negatifKareToplami(intL);
        poziflerinKuplerindenMax(intL);
    }



    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
public static void tekSayiAralarındaBosluk(List<Integer> sayi){
 sayi.stream().filter(Methods::tekMi).forEach(Methods::yazInteger);
}

    // S2: ciftlein carpimini bulalim

    private static void ciftlerinCarpimi(List<Integer> sayi) {
        System.out.println(" çiftlerin çarpımı= "+sayi.stream().filter(Methods::ciftMi).reduce(Math::multiplyExact));
    }

    // S3: negatiflerin kare toplamlarini  bulalim

    private static void negatifKareToplami(List<Integer> sayi) {
        System.out.println(" negatiflerin kare toplamı= "+sayi.stream().filter(Methods::negatifMi).map(Methods::kareBul).reduce(Integer::sum));
    }

    // S4: poziflerin kuplerinden max yazdiralim

    private static void poziflerinKuplerindenMax(List<Integer> sayi) {
        System.out.println(" poziflerin kuplerinden max = "+sayi.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Integer::max));
    }


}

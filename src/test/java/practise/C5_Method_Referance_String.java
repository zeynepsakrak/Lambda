package practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");
        TumHarfleriBuyukHarfAralarindaBoslukBirakarakYazdiralim(l);

        StringleriUzunluklarinaGoreSirala(l);
        EILEBaslayanlari(l);



    }
    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
    private static void TumHarfleriBuyukHarfAralarindaBoslukBirakarakYazdiralim(List<String> l) {
l.stream().map(t->t.split("")).
        flatMap(Arrays::stream).map(String::toUpperCase).forEach(Methods::yazString);
        System.out.println(" ");
    }

    //S2: Stringleri uzunluklarina gore siralayip yaziniz
    private static void StringleriUzunluklarinaGoreSirala(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.println(t+" "));
        System.out.println(" ");
    }
    //S3: E ILE Baslayanlari yazdiralim
    private static void EILEBaslayanlari(List<String> l) {
        l.stream().filter(t->t.startsWith("E")).forEach(t-> System.out.println(t+" "));

    }
}









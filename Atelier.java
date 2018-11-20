import java.util.*;

public class Atelier {
    public static void main(String[] args) {
        List<String> promoJava = new ArrayList<String>();
        promoJava.add("Erwan");
        promoJava.add("Mathe");
        promoJava.add("Moka");
        promoJava.add("Tantely");

        Iterator<String> iterator = promoJava.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> promoJS = new ArrayList<String>();
        promoJS.add("Mathieu");
        promoJS.add("Michel");
        promoJS.add("Florentin");
        promoJS.add("Thoma");

        Map<String, ArrayList> wcs = new HashMap<String, ArrayList>();

        wcs.put("Java", (ArrayList)promoJava);
        wcs.put("JS", (ArrayList)promoJS);

        for(Map.Entry<String, ArrayList> entry : wcs.entrySet()){
            String promo = entry.getKey();
            ArrayList prenom = entry.getValue();
            System.out.println(promo + " " + prenom);
        }
    }
}
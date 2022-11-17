import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar =new ArrayList();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add("Enes");

        sayilar.set(1,23);
        sayilar.remove(0);
        System.out.println(sayilar.get(0));
        for (Object i:sayilar){
            System.out.println(i);
        }
        sayilar.clear();
        for (Object i:sayilar){
            System.out.println(i);
        }
    }
}
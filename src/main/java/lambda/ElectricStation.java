package lambda;

import java.util.ArrayList;
import java.util.List;

public class ElectricStation {

    //потребители электричества
    private List<ElecticStuff> stuffs = new ArrayList<>();

    //метод для добавления электрического прибора
    public void addElectricStuff(ElecticStuff stuff) {
        stuffs.add(stuff);
    }

    public void electroStart() {
        System.out.println("Электричество подано");
        //Каждый потребитель электричества вхожий в лист мы включаем
        for (ElecticStuff e : stuffs) {
            e.elecricityOn();
        }
    }


}

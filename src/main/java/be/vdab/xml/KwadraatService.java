package be.vdab.xml;

import org.springframework.context.annotation.ImportResource;

@ImportResource("beans.xml")
public class KwadraatService {
    int kwadraat(int getal){
        return getal * getal;
    }
}

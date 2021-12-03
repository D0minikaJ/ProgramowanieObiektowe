package pl.imiajd.jablonska;

import java.util.ArrayList;

public class TestInstrumenty {

    public static void main(String[] args)
    {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        Instrument flet1 = new Flet();
        Instrument fortepian = new Fortepian();
        Instrument skrzypce1 = new Skrzypce();
        Instrument flet2 = new Flet();
        Instrument skrzypce2 = new Skrzypce();
        orkiestra.add(fortepian);
        orkiestra.add(skrzypce1);
        orkiestra.add(flet1);
        orkiestra.add(skrzypce2);
        orkiestra.add(flet2);

        for(Instrument i: orkiestra){
            i.dzwiek();
        }
    }
}

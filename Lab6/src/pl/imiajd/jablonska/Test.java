package pl.imiajd.jablonska;

public class Test {
    public static void main(String[] args)
    {
        //Osoba
        Osoba osoba = new Osoba("Jablonska", 2000);
        System.out.println(osoba);
        Osoba osoba2 = new Osoba("Kowalski", 1985);
        Nauczyciel nauczyciel = new Nauczyciel(osoba2, 2500);
        System.out.println(nauczyciel);
        Student student = new Student(osoba, "informatyka");
        System.out.println(student);

        //Rectangle
        BetterRectangle rectangle = new BetterRectangle(1, 2, 2, 6);
        System.out.println(rectangle.getPerimeter(2, 6));
        System.out.println(rectangle.GetArea(2, 6));

    }
}

package modul_7.unit_7_1_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.change(new Dog(), 2);
        System.out.println(zoo);
    }
}
/*
ѕереопределите метод toString() у класса Zoo так, чтобы зоопарк можно было вывести при помощи
системного println(), то есть чтобы программа:

Zoo zoo = new Zoo();
zoo.change(2, new Dog);
System.out.println(zoo);

¬ывела:
Zoo: [I am a Dog, I am a Cat, I am a Dog]
* */
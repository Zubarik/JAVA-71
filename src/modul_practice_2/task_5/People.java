package modul_practice_2.task_5;

 abstract class People {
    private String name;
    private int age;
    private String profession;

    People(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getProfession() {
        return profession;
    }
}

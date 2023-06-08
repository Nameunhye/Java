package mine;

abstract class person {
    abstract int age();

    abstract String name();

    abstract int toSchool();

    abstract void gab(int age);

    abstract void forScholl(int toSchool);

}

class person1 extends person {
    int age;
    String name;
    int toSchool;

    person1(int age, String name, int toSchool) {
        this.age = age;
        this.name = name;
        this.toSchool = toSchool;
    }

    @Override
    int age() {
        return age;
    }

    @Override
    void forScholl(int toSchool) {
        this.toSchool = toSchool;
    }

    @Override
    void gab(int age) {
        this.age = age;
    }

    @Override
    String name() {
        return name;
    }

    @Override
    int toSchool() {
        return toSchool;
    }

}

class person2 extends person {
    int age;
    String name;
    int toSchool;

    person2(int age, String name, int toSchool) {
        this.age = age;
        this.name = name;
        this.toSchool = toSchool;
    }

    @Override
    int age() {
        return age;
    }

    @Override
    void forScholl(int toSchool) {
        this.toSchool = toSchool;
    }

    @Override
    void gab(int age) {
        this.age = age;
    }

    @Override
    String name() {
        return name;
    }

    @Override
    int toSchool() {
        return toSchool;
    }

}

class person3 extends person {
    int age;
    String name;
    int toSchool;

    person3(int age, String name, int toSchool) {
        this.age = age;
        this.name = name;
        this.toSchool = toSchool;
    }

    @Override
    int age() {
        return age;
    }

    @Override
    void forScholl(int toSchool) {
        this.toSchool = toSchool;
    }

    @Override
    void gab(int age) {
        this.age = age;
        // 꼭 this.로 값이 return되도록
    }

    @Override
    String name() {
        return name;
    }

    @Override
    int toSchool() {
        return toSchool;
        // 리턴값에 () 재귀호출을 하지 않도록 주의;
    }
}

public class Study01 {

    static void old(person a, person b) {
        a.gab(a.age() - b.age());
        a.forScholl(a.toSchool() - b.toSchool());
        System.out.println(a.name() + "은 " + b.name() + "보다 " + a.age() + "살 많다.");
        System.out.println(a.name() + "은 " + b.name() + "보다 " + a.toSchool() + "살 학교를 더 다녔다.");

    }

    public static void main(String[] args) {
        person a1 = new person1(19, "나므네", 9);
        person b1 = new person2(15, "소녀희", 7);
        person c1 = new person3(27, "나양우", 15);

        old(a1, b1);
        old(c1, b1);
    }
}

//***************************
// 파일명: hw10_3 .java
// 내용: 람다식을 사용하여 사람의 신장과 체중의 평균을 구하는 프로그램
//***************************

package hw10_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class hw10_3 {
    public static void main(String[] args) {
        System.out.println("평균 신장 : " + average(Person.persons, person -> person.getHeight()));
        System.out.println("평균 체중 : " + average(Person.persons, person -> person.getWeight()));
    }

    
    // 람다식과 스트림 방식을 사용하여 코드를 완성시킴.
    public static double average(List<Person> persons, Function<Person, Integer> function) {
        return persons.stream()
                      .mapToInt(person -> function.apply(person))
                      .average()
                      .orElse(0);
    }
}

class Person {
    private String name;
    private int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + "(" + height + ", " + weight + ")";
    }

    static List<Person> persons = Arrays.asList(
            new Person("황진이", 160, 45), new Person("이순신", 180, 80),
            new Person("김삿갓", 175, 65), new Person("홍길동", 170, 68),
            new Person("배장화", 155, 48)
    );
}
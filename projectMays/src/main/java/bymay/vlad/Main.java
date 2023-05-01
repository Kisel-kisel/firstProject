package bymay.vlad;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Organization person = new Organization();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате: 1900-12-12");
        String date = scanner.next();
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.parse(date);
        Period period = Period.between(localDate1,localDate);
        int years = period.getYears();
        System.out.println(years);

        List<Boolean> allOrgans = new ArrayList<>();

        Boolean zero = person.youngs(years);
        Boolean first = person.notYoungers(years);
        Boolean second = person.workAge(years);
        Boolean third = person.onlyOld(years);
        allOrgans.add(zero);
        allOrgans.add(first);
        allOrgans.add(second);
        allOrgans.add(third);;

        FileWriter writer = new FileWriter("twoHomes.txt");

        person.Organs(allOrgans, writer);

        writer.close();



    }

}
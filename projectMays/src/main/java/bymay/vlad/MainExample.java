package bymay.vlad;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MainExample {
//    List<Boolean> allOrganization = List.of(youngs(getYears()),notYoungers(getYears()),workAge(getYears()),onlyOld(getYears()));
//public void Organs2(Organization person, FileWriter writer) throws IOException {
//    for (int i = 0; i <allOrganization.size() ; i++) {
//        person.allOrganization.get(i);
//        if (person.allOrganization.get(i)){
//            System.out.println(allOrgans2.get(i));
//            writer.write(allOrgans2.get(i) + '\n');
//        }
//    }
//}
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите дату своего рождения в формате: 1900-12-12");
//        String date = scanner.next();
        public int dates(String date){
            LocalDate localDate = LocalDate.now();
            LocalDate localDate1 = LocalDate.parse(date);
            int year = localDate1.getYear() - localDate.getYear();
            System.out.println(year);
            return year;
        }






//    }
}

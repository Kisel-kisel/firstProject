package bymay.vlad;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Organization {
    private List<String> allOrgans2;
    private String youngs = "Организация для людей младше 18 лет.";
    private String notYoungers = "Организация для людей старще 18 лет.";
    private String workAgeTrue = "Организация для людей возраста от 18 до 65 лет.";
    private String onlyOld = "Организация для людей старше 65 лет.";

    public Organization() {

        allOrgans2 = List.of(youngs, notYoungers,workAgeTrue,onlyOld);
    }

    //    1
    public static boolean youngs(int years) {
        if (years<18){
            return true;
        }
        return false;
    }
//    2
    public static boolean notYoungers(int years){
        if (years >= 18) {
            return true;
        }
        return false;
    }
    //    3
    public static boolean workAge(int years){
        if (years >= 18 && years <65){
            return true;
        }
        return false;
    }
//    4
    public static boolean onlyOld(int years){
    if (years > 65){
        return true;
    }
    return false;
}
    public void Organs(List<Boolean>allOrgans, FileWriter writer) throws IOException {
        int count = 0;
        writer.write("Список организаций Вам подходящих:"+ '\n');
        for (int i = 0; i < allOrgans.size(); i++) {
           if (allOrgans.get(i)){
               count++;
               System.out.println(allOrgans2.get(i));
               writer.write(count + " " + allOrgans2.get(i) + '\n');
           }
        }
    }





}

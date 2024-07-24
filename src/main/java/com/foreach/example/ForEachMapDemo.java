package com.foreach.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class ForEachMapDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat dateFormatWithoutTime = new SimpleDateFormat("dd MMM yyyy");

        Date shubhamDateOfBirth = date.parse("18-03-1998");
        Date sejalDateOfBirth = date.parse("01-12-2003");
        Date shrikantDateOfBirth = date.parse("22-11-2002");
        Date omkarDateOfBirth = date.parse("14-11-1999");

        Map<String, Date> map = new HashMap<>();
        map.put("Shubham Puri", shubhamDateOfBirth);
        map.put("Shrikant Surve", shrikantDateOfBirth);
        map.put("Sejal Patankar", sejalDateOfBirth);
        map.put("Omkar Patil", omkarDateOfBirth);

        // Printing entries using forEach
        map.entrySet().stream().forEach(entry -> {
            System.out.println("Name: " + entry.getKey() + " DOB: " + dateFormatWithoutTime.format(entry.getValue()));
        });

        System.out.println("*************************************************");

        // Sorting and printing entries by date of birth
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> {
                    System.out.println("Name: " + entry.getKey() + " DOB: " + dateFormatWithoutTime.format(entry.getValue()));
                });

        System.out.println("*************************************************");

        // Sorting and printing entries by name
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    System.out.println("Name: " + entry.getKey() + " DOB: " + dateFormatWithoutTime.format(entry.getValue()));
                });

        System.out.println("****************************************");
        Set set=map.entrySet();
        Predicate<Map.Entry>p=k->k.getKey().toString().startsWith("S");
        map.entrySet().stream().filter(p).forEach(System.out::println);
    System.out.println("***********************************************");
    }
}

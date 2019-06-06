package com.company.advanced1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Color.YELLOW);
        //Code - Y
        //Full name - Yellow

        //Y -> Color.YELLOW

        //Enum cannot
        //1. Have instances via 'new' keyword
        //2. Extend from classes or enums

        System.out.println(Color.GREEN.getId());
        System.out.println(Color.GREEN.getCode());
        System.out.println(Color.GREEN.getFullName());
        System.out.printf("Ordinal -> %s\n", Color.GREEN.ordinal());

        System.out.println("enter your color code: ");
        String colorCode = new Scanner(System.in).nextLine();
        Color consoleColor = Color.getByColorCode(colorCode);

        if (consoleColor == null) {
            System.out.println("No color found");
        } else {
            System.out.println("Color found");
            System.out.printf("%s - %s\n",
                    consoleColor.getId(),
                    consoleColor.getFullName());
        }


    }
}

enum Color /*extends Enum*/ {
    //Color RED = new Color(); -> RED()

    RED("R", "Red", 1),
    GREEN("GR", "Green", 2),
    YELLOW("Y", "Yellow", 3),
    BLUE("B", "Blue", 4),
    BLACK("BL", "Black", 5)
    ;

    private String code;
    private String fullName;
    private Integer id;

    Color(String code, String fullName, Integer id) {
        this.code = code;
        this.fullName = fullName;
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getId() {
        return id;
    }

    public static Color getByColorCode(String colorCode) { //R
        if (colorCode == null) {
            return null;
        }
        Color [] colors = Color.values(); //RED, GREEN, YELLOW
        for (Color color : colors) {
            if (color.getCode().equalsIgnoreCase(colorCode)) {
                return color;
            }
        }
        return null;
    }
}

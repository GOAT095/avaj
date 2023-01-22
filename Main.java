package com.goat.avaj;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (String s: args)
            sb.append(String.format("%s ZAbi\n", s));

        sb.append(123);
        sb.append(
                12.123
        );
        sb.append("asdf", 0, 3);


        System.out.println(sb);

    }

}
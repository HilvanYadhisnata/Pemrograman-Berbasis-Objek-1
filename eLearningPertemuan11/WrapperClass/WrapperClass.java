package eLearningPertemuan11.WrapperClass;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<String> DaftarNomorString = new ArrayList<>();

        DaftarNomorString.add("1231231132");
        DaftarNomorString.add("1324125123");
        DaftarNomorString.add("1241241241");

        ArrayList<Integer> DaftarNomorInteger = new ArrayList<>();

        for (String nomor : DaftarNomorString) {
            DaftarNomorInteger.add(Integer.parseInt(nomor));

            System.out.println(DaftarNomorInteger);
        }
    }

}

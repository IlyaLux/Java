package org.sem1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class sem4_HW4 {
    static ArrayList<String> listf = new ArrayList<>();
    static ArrayList<String> listn = new ArrayList<>();
    static ArrayList<String> listsn = new ArrayList<>();
    static ArrayList<Integer> listage = new ArrayList<>();
    static ArrayList<Boolean> listgend = new ArrayList<>();
    static ArrayList<Integer> listid = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        File file = new File("HW4.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("""
                Петров Иван Васильевич 56 М
                Веселая Екатерина Витальевна 12 Ж
                Козловский Илья Петрович 45 М
                Любимова Светлана Петровна 18 Ж
                Мясников Виктор Сергеевич 37 М
                Иванова Марина Викторовна 19 Ж
                Соловьев Алексей Иванович 35 М
                Сорокина Елена Петровна 47 Ж
                """);
        writer.flush();
        writer.close();

        String str = "";
        try {
            FileReader reader = new FileReader(file);
            while (reader.ready()) str += (char) reader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] strings = str.split("\n");
        for (int i = 0; i < strings.length - 1; i++) {
            String[] tmp = strings[i].split(" ");
            listf.add(tmp[0]);
            listn.add(tmp[1]);
            listsn.add(tmp[2]);
            listage.add(Integer.parseInt(tmp[3]));
            listgend.add(tmp[4].contains("М"));
            listid.add(i);
        }

        int cnt = listid.size() - 1;
        while (cnt > -1) {
            int max_age = listage.get(listid.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++) {
                if (max_age < listage.get(listid.get(i))) {
                    max_age = listage.get(listid.get(i));
                    index = i;
                }
            }

            int tmp = listid.get(cnt);
            listid.set(cnt, listid.get(index));
            listid.set(index, tmp);
            cnt--;
        }

        for (int i: listid) {
            System.out.println(getFIO(i));
        }

    }
    private static String getFIO ( int index){
        return listf.get(index).toUpperCase().charAt(0)
                + listf.get(index).toLowerCase().substring(1) + " "
                + listn.get(index).toUpperCase().charAt(0) + "."
                + listsn.get(index).toUpperCase().charAt(0) + ". "
                + listage.get(index) + " "
                + (listgend.get(index) ? "М" : "Ж");
    }
}



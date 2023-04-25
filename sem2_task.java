package org.sem1;

public class sem2_task {
//    Самолет построим сами,
//    Понесемся над лесами,
//    Понесемся над лесами,
//    А потом вернемся к маме.
public static void main(String[] args) {
        String my_string = """
            Самолет построим сами,
            Понесемся над лесами,
            Понесемся над лесами,
            А потом вернемся к маме.""";
    String query = "лесами";
    long begin = System.currentTimeMillis();
    System.out.println(my_string);
    System.out.println();
//        my_string.replace("лесами", "полями");
    System.out.println(my_string.replace(query, "полями"));
    long end = System.currentTimeMillis();
    System.out.println(end - begin);

    long start = System.currentTimeMillis();
    StringBuilder builder = new StringBuilder(my_string);
    while (builder.indexOf(query) > 0) {
        builder.replace(builder.indexOf(query), builder.indexOf(query)+query.length(), "полями");
    }
    System.out.println(builder);
    long finish = System.currentTimeMillis();
    System.out.println(finish - start);
    }
}


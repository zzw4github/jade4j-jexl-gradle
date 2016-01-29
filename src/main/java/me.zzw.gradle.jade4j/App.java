package me.zzw.gradle.jade4j;

import de.neuland.jade4j.Jade4J;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Hitchhiker's Guide to the Galaxy", 5.70, true));
        books.add(new Book("Life, the Universe and Everything", 5.60, false));
        books.add(new Book("The Restaurant at the End of the Universe", 5.40, true));

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("books", books);
        model.put("pageName", "My Bookshelf");

        String html = Jade4J.render("./templates/index.jade", model);
        System.out.println(html);

    }
}
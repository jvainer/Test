package com.example.jvainer.test1.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        List <String> genres=new ArrayList<String>();
        for (int x=0; x>5; x++){
            genres.add("Fuck"+x);
        }
        // Add 3 sample items.
        addItem(new DummyItem("1", "Item 1",genres));
        addItem(new DummyItem("2", "Item 2",genres));
        addItem(new DummyItem("3", "Item 3",genres));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public List<String> genres;

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }
        public DummyItem(String id, String content, List<String> genres) {
            this.id =id;
            this.content = content;
            this.genres = genres;

        }

        @Override
        public String toString() {
            String response="";
            for(String genre:genres){
                response+=genre;
            }
            return response;
        }
    }
}

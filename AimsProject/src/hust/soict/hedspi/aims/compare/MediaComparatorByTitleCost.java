package hust.soict.hedspi.aims.compare;

import java.util.Comparator;
import hust.soict.hedspi.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    public int compare(Media o1, Media o2) {
        if (o1.getTitle().compareTo(o2.getTitle()) > 0)
            return 1;
        else if (o1.getTitle().compareTo(o2.getTitle()) < 0)
            return -1;
        else if (o1.getCost() > o2.getCost())
            return 1;
        else if (o1.getCost() < o2.getCost())
            return -1;
        else
            return 0;
    }
}
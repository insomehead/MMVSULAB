package five.kyu;

import java.util.Collections;
import java.util.List;


public class PaginationHelper<I> {

    private final List<I> collection;
    private final int itemsPerPage;


    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection == null ? Collections.<I>emptyList() : collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**empty
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        int result = collection.size();
        int i = 1;
        while (result > itemsPerPage){
            result -= itemsPerPage;
            i++;
        }
        return i;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex > pageCount() -1){
            return -1;
        }
        return Math.min(itemCount() - itemsPerPage * pageIndex, itemsPerPage);
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex > itemCount() -1) {
            return -1;
        }
        return itemsPerPage == 0 ? -1 :itemIndex / itemsPerPage;
    }
}

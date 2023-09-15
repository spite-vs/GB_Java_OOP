package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * 
 * @param groups
 */
public class GroupIterator implements Iterator<StudentGroup> {
    private int count;
    private List<StudentGroup> groups;

    public GroupIterator(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public StudentGroup next() {
        count++;
        return groups.get(count - 1);
    }
}

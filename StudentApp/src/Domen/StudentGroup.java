package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    private List<Student> group;
    private int groupId;

    public StudentGroup(List<Student> group, int groupId) {
        this.group = group;
        this.groupId = groupId;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student Group: " + groupId;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (group.size() > o.group.size())
            return 1;
        else if (group.size() < o.group.size())
            return -1;
        if (this.groupId > o.getGroupId())
            return 1;
        else if (groupId < o.getGroupId())
            return -1;
        return 0;
    }
}

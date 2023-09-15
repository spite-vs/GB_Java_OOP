package Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {

    private int steamId;
    private List<StudentGroup> groups;

    public StudentSteam(int steamId) {
        groups = new ArrayList<StudentGroup>();
        this.steamId = steamId;
    }

    public void add(StudentGroup group) {
        groups.add(group);
    }

    public int getSteamId() {
        return steamId;
    }

    public void setSteamId(int steamId) {
        this.steamId = steamId;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ПОТОК № " + this.steamId + "\n");
        for (StudentGroup item : groups) {
            sb.append("\nГруппа: " + item.getGroupId() + "\n");
            for (Student i : item) {
                sb.append(i.getName() + "\n");
            }
        }
        return sb.toString();
    }
}

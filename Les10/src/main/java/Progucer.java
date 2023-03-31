import java.util.Objects;

public class Progucer {
    private int id;
    private int uid;

    public Progucer() {
    }

    public Progucer(int id, int uid) {
        this.id = id;
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Progucer progucer = (Progucer) o;
        return id == progucer.id && uid == progucer.uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid);
    }

    @Override
    public String toString() {
        return "Progucer{" +
                "id=" + id +
                ", uid=" + uid +
                '}';
    }
}

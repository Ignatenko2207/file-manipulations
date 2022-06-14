package info.sjd.model;

public class SessionItem {

    private long time;
    private int id;
    private String ip;

    public SessionItem() {
    }

    public SessionItem(long time, int id, String ip) {
        this.time = time;
        this.id = id;
        this.ip = ip;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return time + " " + id + " " + ip;
    }
}

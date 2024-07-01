package in.dhaivathlal.testapplicationjava.services;

public class Machine {

    private String name, username, ip, password;

    public Machine(String name, String username, String ip, String password) {
        this.name = name;
        this.username = username;
        this.ip = ip;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

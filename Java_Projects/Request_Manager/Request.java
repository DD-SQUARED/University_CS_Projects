package Java_Projects.Request_Manager;

public class Request {
    private String user;
    private String message;

    public Request(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "User: " + user + " | Request: " + message;
    }
}
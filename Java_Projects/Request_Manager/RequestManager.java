package Java_Projects.Request_Manager;

import java.io.*;
import java.util.ArrayList;

public class RequestManager 
{
    private ArrayList<Request> requests = new ArrayList<>();

    public void addRequest(String user, String message) {
        requests.add(new Request(user, message));
    }

    public void listRequests() {
        if (requests.isEmpty()) {
            System.out.println("No requests found.");
            return;
        }
        for (int i = 0; i < requests.size(); i++) {
            System.out.println((i + 1) + ". " + requests.get(i));
        }
    }

    public void saveToFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Request r : requests) {
            writer.write(r.getUser() + ";" + r.getMessage());
            writer.newLine();
        }
        writer.close();
    }

    public void loadFromFile(String filename) throws IOException {
        requests.clear();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(";");
            if (parts.length == 2) {
                addRequest(parts[0], parts[1]);
            }
        }
        reader.close();
    }
}


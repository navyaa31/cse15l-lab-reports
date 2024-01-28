# Lab 2 Report
## Part 1
The following is my code for the Chat Server:
```
import java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler {
    HashMap<String, String> hm = new HashMap<String, String>();

    public String handleRequest(URI url) {

        if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("&");
            String user = parameters[0].substring(2);
            String s = parameters[1].substring(5);
            hm.put(user, s);


            String returnString = "";
            for (String key : hm.keySet()) {
                returnString += hm.get(key) + ": " + key + "\n";
            }

            return returnString;
        } else {
            return "404 Not Found!";
        }

    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
```

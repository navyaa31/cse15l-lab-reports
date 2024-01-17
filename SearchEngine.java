import java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler {
    ArrayList<String> list = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().contains("/add")) {
            String[] parameters = url.getQuery().split("=");
            list.add(parameters[parameters.length-1]);

            return parameters[parameters.length-1] + " added.";
        } else if (url.getPath().contains("/search")) {
            ArrayList<String> printList = new ArrayList<String>();

            String[] parameters = url.getQuery().split("=");
            String substring = parameters[parameters.length-1];
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).indexOf(substring) != -1) {
                    printList.add(list.get(i));
                }
            }

            return Arrays.toString(printList.toArray());
        } else {
            return "404 Not Found! (Search Engine)";
        }

    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

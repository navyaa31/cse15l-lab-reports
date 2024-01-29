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
***
**Screenshot 1:**

![lab2part1_1](lab2part1_1.png)
First, the ```main``` method is called in ```ChatServer``` with the argument of the port number, 5555 in this case. Then, ```Server```'s start method is called with the arguments of the port number and a new ```Handler``` object. The ```handleRequest``` method is called in the ```Handler``` object with the ```URI``` that can be seen in the screenshot. The ```Handler``` class has a ```HashMap``` object as a field that initially has not keys and values. After the ```handleRequest``` method is called, the ```URI``` is processed so that the user and the message are added to the ```HashMap``` as key and value. The ```String``` called ```returnString``` does not have any characters in it because it is created in the ```handleRequest``` method this way. After the for each loop that goes through the ```HashMap hm```, the ```String```'s value is 
```
jpolitz: Hello
```
followed by a return to the next line. The ```HashMap hm``` is now changed.

***
**Screenshot 2:**

![lab2part1_2](lab2part1_2.png)
This use of ```/add-message``` is after the one in the first screenshot. First, the ```main``` method is called in ```ChatServer``` with the argument of the port number, 5555 in this case again. Then, ```Server```'s start method is called with the arguments of the port number and a new ```Handler``` object. The ```handleRequest``` method is called in the ```Handler``` object with the ```URI``` that can be seen in the screenshot. The ```Handler``` class has a ```HashMap``` object as a field. Since this is the second time ```/add-message``` is being used, the ```HashMap``` already has the key and value from the first time it was used in the screenshot above. After the ```handleRequest``` method is called, the ```URI``` is processed so that the user and the message are added to the ```HashMap``` as the second key and value. The ```String``` called ```returnString``` does not have any characters in it initially because it is created in the ```handleRequest``` method this way. After the for each loop that goes through the ```HashMap hm```, the ```String```'s value is 
```
jpolitz: Hello
yash: How are you
```
followed by a return to the next line. The ```HashMap hm``` is now changed.

## Part 2
_Absolute path to the private key_
![lab2part2_1](lab2part2_1.png)
***

_Absolute path to the public key_
![lab2part2_2](lab2part2_2.png)
***

_Terminal interaction without password_
![lab2part2_3](lab2part2_3.png)

## Part 3
I learned what the different parts of a url meant, such as the domain, path and query. It was interesting to learn that each part of a url has significance and also learn how to use the urls to create different servers like the Search Engine and the Chat Server.

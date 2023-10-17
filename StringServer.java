import java.io.IOException;
import java.net.URI;
import java.util.ArrayList; // import the ArrayList class

class Handler implements URLHandler {
    ArrayList<String> list = new ArrayList<String>(); // Create an ArrayList object
    
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format(toString(list));
        } else {
            if(url.getPath().contains("/add-message")){
                String[] parameters = url.getQuery().split("=");
                if(parameters[0].equals("s")){
                    list.add(parameters[1]);
                    return String.format("String has been added.\n" + toString(list));
                }
            }
            return "404 Not Found!";
        } 
    }
    public String toString(ArrayList<String> list){
        String str = "";
        for(int i = 0; i< list.size(); i++){
            str += (i + 1) + "." + list.get(i) + "\n";
        }
        return str;
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

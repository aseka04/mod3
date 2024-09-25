public class Main {
    public void message(String message, String er){
        if(er.equals("error")){
            System.out.println("ERROR: " + message);
        }
        if(er.equals("warning")){
            System.out.println("WARNING: " + message);
        }
        if(er.equals("info")){
            System.out.println("INFO: " + message);
        }
    }

}

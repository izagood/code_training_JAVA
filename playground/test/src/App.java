public class App {
    public static void main(String[] args) throws Exception {
        boolean SSL = System.getProperty("ssl") != null;
        System.out.println(SSL);
        int PORT = Integer.parseInt(System.getProperty("port", SSL? "8443": "8080")); 
        System.out.println(PORT);
    }
}

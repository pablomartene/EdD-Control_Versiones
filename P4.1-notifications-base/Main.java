// Main.java - Programa principal
public class Main {
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();
        
        // Ejemplos de uso
        manager.send("EMAIL", "hola", "usuario@email.com");
        manager.send("SMS", "Tu código es 1234", "+34123456789");
        manager.send("PUSH", "Tienes un nuevo mensaje", "user_device_001");
    }
}

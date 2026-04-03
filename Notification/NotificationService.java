package Notification;

interface NotificationService {
    void sendMessage(String message);
    void SendAlert(String message);
    public static void main(String[] args) {
        SMS S = new SMS();
        S.sendMessage("SMS Message");
        S.SendAlert("SMS Alert");
        Email E = new Email();
        E.sendMessage("Email Message");
        E.SendAlert("Email Alert");
    }
    
}

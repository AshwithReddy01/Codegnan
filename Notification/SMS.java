package Notification;

class SMS implements NotificationService {
    public void sendMessage(String message){
        System.out.println("SMS sent: "+message);
    }
    public void SendAlert(String message){
        System.out.println("SMS Alert: "+message);
    }
    
}

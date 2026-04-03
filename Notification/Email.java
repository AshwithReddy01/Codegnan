package Notification;

class Email implements NotificationService{
    public void sendMessage(String message){
        System.out.println("Email sent: "+message);
    }
    public void SendAlert(String message){
        System.out.println("Email Alert: "+message);
    }
    
}

package java.rocks.zipcode;

public class EmailService {
    private final rocks.zipcode.EmailSender emailSender;
    
    public EmailService(rocks.zipcode.EmailSender emailSender) {
        this.emailSender = emailSender;
    }
    
    public boolean sendWelcomeEmail(String email) {
        if (email == null || email.isEmpty() || !isValidEmail(email)) {
            return false;
        }
        
        String subject = "Welcome to Our Service";
        String body = "Thank you for signing up with our service. We're glad to have you!";
        
        return emailSender.sendEmail(email, subject, body);
    }
    
    public boolean sendPasswordReset(String email) {
        if (email == null || email.isEmpty() || !isValidEmail(email)) {
            return false;
        }
        
        String subject = "Password Reset Request";
        String body = "Click the link below to reset your password:\n" +
                     "https://example.com/reset-password?token=12345";
        
        return emailSender.sendEmail(email, subject, body);
    }
    
    private boolean isValidEmail(String email) {
        // Simple email validation
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}

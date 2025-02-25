package rocks.zipcode;

/**
 * EXERCISE 6: EmailService
 * 
 * The EmailService class is implemented with a dependency on EmailSender.
 * Students need to write tests using a mock for the EmailSender.
 */

// The implementations (already written)
public interface EmailSender {
    boolean sendEmail(String to, String subject, String body);
}

public class EmailService {
    private EmailSender emailSender;
    
    public EmailService(EmailSender emailSender) {
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


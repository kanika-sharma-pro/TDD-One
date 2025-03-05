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


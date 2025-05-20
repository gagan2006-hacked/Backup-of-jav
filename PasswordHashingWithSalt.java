import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
public class PasswordHashingWithSalt {
    private static byte[] getSalt() throws NoSuchAlgorithmException {
        // Create a SecureRandom instance
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16]; // 16-byte salt
        sr.nextBytes(salt);
        return salt;
    }
    public static String hashPasswordWithSalt(String password, byte[] salt) {
        try {
            // Combine password and salt
            String saltedPassword = password + Base64.getEncoder().encodeToString(salt);

            // Create MessageDigest instance for SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Hash the salted password
            byte[] hashedBytes = digest.digest(saltedPassword.getBytes());

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();  // Return hashed password with salt
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error: SHA-256 algorithm not found", e);
        }
    }

    public static void main(String[] args) {
        try {
            String password = "gagan2006vishwanath";

            // Generate a random salt
            byte[] salt = getSalt();

            // Hash the password with the salt
            String hashedPassword = hashPasswordWithSalt(password, salt);

            // Print the hashed password and salt (Base64 encoded for readability)
            System.out.println("Salt: " + Base64.getEncoder().encodeToString(salt));
            System.out.println("Hashed Password with Salt: " + hashedPassword);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

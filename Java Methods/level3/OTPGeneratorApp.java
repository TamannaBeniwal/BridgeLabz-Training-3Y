public class OTPGeneratorApp {
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs and store in array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = OTPUtil.generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean isUnique = OTPUtil.areOTPsUnique(otpArray);
        System.out.println("\nAll OTPs Unique? " + isUnique);
    }
}

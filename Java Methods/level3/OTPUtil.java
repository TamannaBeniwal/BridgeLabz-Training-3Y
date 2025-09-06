class OTPUtil {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Range: 100000 to 999999
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }
}
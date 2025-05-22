public class OTP_Generator {
    public static int otp_generator(){
        return (int) (100000 + Math.random() * 900000);
    }
    public static void main(String[] args){
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++){
            otpArray[i] = otp_generator();
            System.out.println("Generated otp "+(i+1)+" : "+otpArray[i]);
        }
        int c = 1;
        for (int i = 1; i < otpArray.length; i++){
            if (otpArray[i] != otpArray[0]){
                c = 0;
                break;
            }
        }
        if (c == 0){
            System.out.println("OTPs are unique");
        }
        else{
            System.out.println("OTPs are not unique");
        }
    }
}

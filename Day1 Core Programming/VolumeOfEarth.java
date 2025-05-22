public class VolumeOfEarth {
    public static void main(String[] args){
        double r_in_km = 6378;
        double r_in_miles = 6378f*1.6f;
        double vol_in_km = (4/3)*Math.PI*Math.pow(r_in_km, 3);
        double vol_in_miles = (4/3)*Math.PI*Math.pow(r_in_miles, 3);
        System.out.println("The volume of earth in cubic kilometers is "+vol_in_km+" and cubic miles is "+vol_in_miles);
    }
}

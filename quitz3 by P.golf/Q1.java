import java.util.Scanner;
class BoxDriver {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int box = sc.nextInt();
        if(box!=0){
            for(int i=0;i<box;i++){
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                double depth = sc.nextDouble();
                Box b = new Box(width, height, depth);
                System.out.println("Capacity: "+b.getCapacity());
                System.out.println("Surface area: "+b.getArea());
            }
        }
        else{
            Box b = new Box();
            System.out.println("Default Box is Created");
            System.out.println("Capacity: "+b.getCapacity());
            System.out.println("Surface area: "+b.getArea());
        }
    } 
}
class Box {
    static final double ONE_UNIT = 1.0;
    private double width;
    private double height;
    private double depth;
    public Box() {
        width = height = depth = ONE_UNIT;
    }
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    public double getCapacity() {
        return width * height * depth;
    }
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }
}
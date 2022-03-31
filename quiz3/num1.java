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
class Box{
    double capacity;
    double surface;
    double width;
    double height;
    double depth;

    public Box(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
        capacity =width*height*depth;
        surface = (((width+depth)*2)*height)+2*(width*depth);
    }

    public Box(){
        capacity=1.0;
        surface=6.0;
    }

    public double getCapacity(){
        return capacity;
    }
    public double getArea(){
        return surface;
    }
}
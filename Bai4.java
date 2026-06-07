class Retangle{
    private double width;
    private double height;
    private int id;
    private static int stt;
    public Retangle(double width, double height){
        stt++;
        this.width = width;
        this.height = height;
        this.id = stt;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public int getId(){ return this.id;}

    @Override
    public String toString(){
        return String.format("Retangle %d: width = %.1f, height = %.1f,  area = %.1f, perimeter = %.1f", stt, this.width, this.height, getArea(), getPerimeter());
    }
}


public class Bai4{
    public static void main(String[] args){
        double maxn = Double.MIN_VALUE;
        Retangle r1 = new Retangle(3, 4);
        maxn = Math.max(maxn, r1.getArea());
        Retangle r2 = new Retangle(5, 2);
        maxn = Math.max(maxn, r2.getArea());
        Retangle r3 = new Retangle(4.5, 3.5);
        maxn = Math.max(maxn, r3.getArea());
        Retangle[] list = new Retangle[3];
        list[0] = r1;
        list[1] = r2;
        list[2] = r3;
        System.out.printf("Largest Area = %.2f", maxn);
        for(var x : list){
            if(maxn == x.getArea()){
                System.out.printf("(Retangle %d: width: %.1f, height: %.1f)", x.getId(), x.getWidth(), x.getHeight());
            }
        }
    }
}

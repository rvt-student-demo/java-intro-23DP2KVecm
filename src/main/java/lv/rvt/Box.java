package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box ( double width, double height, double length ){
        this.width = width;
        this.height = height;
        this.length = length;
    }



    public double volume() {
        return width * height * length;
    }

    public double area(){
    return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
    }

    public double faceArea(){
        return height * width;
    }

    public double topArea(){
        return width * length;
    }

    public double sideArea(){
        return height * length;
    }

    public Box biggerBox( Box oldBox ){
        return new Box( 1.25*oldBox.width, 1.25*oldBox.height, 1.25*oldBox.length);
    }

    public Box smallerBox( Box oldBox ){
        return new Box( 0.75*oldBox.width, 0.75*oldBox.height, 0.75*oldBox.length);
    }
    @Override
    public String toString() {
        return "width: " + width + ", height: " + height + ", length: " + length + ", volume: " + volume() + ", area: " + area();
    }

    
}

class Square{
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    public int CalculateArea(int sideLength){
        return sideLength * sideLength;
    }
}
interface Shape{
    public abstract int getArea(Square Person);
}
public class Method_references {
    public static void main(String[] args) {
        Square s = new Square(4);



        Shape sh = (Square square) -> {
          return square.CalculateArea(4);
        };
//        System.out.println("area " + Shape.getArea(s));
    }
}

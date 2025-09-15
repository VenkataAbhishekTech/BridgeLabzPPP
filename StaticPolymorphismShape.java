class Shape{
    void base(){
        System.out.println("This is a shape");
    }
}
class circle extends Shape{
    @Override
    void base(){
        System.out.println("This is a circle");
    }
}
class square extends Shape{
    @Override
    void base(){
        System.out.println("This is a square");
    }
}
public class StaticPolymorphismShape {
    public static void main(String[] args) {
        Shape myShape1 = new circle();
        Shape myShape2 = new square();

        myShape1.base();
        myShape2.base();
    }
}

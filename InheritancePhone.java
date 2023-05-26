class Phone{
    String brandName;
    String screen;
    String processor;
    public Phone(String brandName,String screen, String processor){
        this.brandName = brandName;
        this.screen = screen;
        this.processor = processor;
    }
    void display(){
        System.out.println(" Brand name - " + brandName + " Screen - " + screen + " Processor - " + processor);
    }
}

class Samsung extends Phone{
        String camera;
    public Samsung(String brandName, String screen, String processor,String camera) {
        super(brandName, screen, processor);
        this.camera = camera;
    }

    @Override
    void display() {
        super.display();
        System.out.println(" Camera - " + camera);
    }
}
class Apple extends Samsung{
    String os;

    public Apple(String brandName, String screen, String processor, String camera, String os) {
        super(brandName, screen, processor, camera);
        this.os = os;
    }

    @Override
    void display() {
        super.display();
        System.out.println( " Os - " + os);
    }
}
public class InheritancePhone {
    public static void main(String[] args) {
        Apple p = new Apple("Samsung","amolade","Snapdragon","107 MP","IOS");
        p.display();
    }
}

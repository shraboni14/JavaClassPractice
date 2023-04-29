class student12{
    int marks;
    String name;

    student12(String n, int m){

        name = n;
        marks = m;
    }
    void display(){
        System.out.println("Student Marks is : " + marks);
        System.out.println("The name of the student is " + name);

    }
}
public class Practice_class {
    public static void main(String[] args) {
//        student12 s1 = new student12("Shraboni",78);
//        s1.display();
        student12 s2[] = new student12[4];
        s2[0]= new student12("deesha",78);
        s2[1]= new student12("Adrija",87);
        s2[2]= new student12("Tania",75);
        s2[3]= new student12("Bipasha",76);
        for( int i=0; i<s2.length; i++){
            s2[i].display();
        }
        int max = s2[0].marks;
        for( int i = 0; i<s2.length;i++){
            if(max<s2[i].marks){
                max = s2[i].marks;

            }

        }
        System.out.println("Maximum marks is : "+ max);
        System.out.println("The name of the student is : "+ max);

        int min = s2[0].marks;
        String ename = null;
        for( int i = 0; i<s2.length; i++){
            if(min>s2[i].marks){
                min=s2[i].marks;
                ename = s2[i].name;
            }
        }
        System.out.println("Minimum marks is : "+min);
        System.out.println("Name of the student is : "+ ename);


    }
}

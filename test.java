class Constructor{
    double height,depth,breath;
    Constructor(double height,double breath,double depth){
        this.height=height;
        this.breath=breath;
        this.depth=depth;
    }
    void volume(){
        System.out.println("Volume is : "+ height*breath*depth);
    }

}
public class test {
    public static void main(String[] aegs){
        Constructor c=new Constructor(12, 2, 2);
        c.volume();


    }
}

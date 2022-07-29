public class Para {
    String name;

    public Para(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Para ob=new Para("sneha");
        System.out.println(ob.name);
        Para ob1=new Para("Sonu");
        System.out.println(ob1.name);
    }
}

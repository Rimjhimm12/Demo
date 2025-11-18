public class BMW extends Car{

    public BMW(){

        super(12);
        System.out.println("BMW----Parent constructor");
        this.display();
    }
    public  BMW(int b){
        System.out.println("BMW----Parent constructor");

    }
    @Override
    public void display() {
        super.display(2);
        super.display();
        System.out.println("BMW----display");
    }

    @Override
    public void display(int a) {
        System.out.println("BMW----display: "+a);
        this.display();
    }
}

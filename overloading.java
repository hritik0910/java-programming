 class   overloading {
    void display(int a){
        System.out.println("Got int data");
    }
    void display(String a){
        System.out.println("Got string data");
    }
    public static void main(String args[]) {
        overloading obj = new overloading();
        obj.display(1);
        obj.display("HEllO");

    }
}


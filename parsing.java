class parsing {
    public static void main(String args[]) {
     String tenString = "10";

    //This won't work since you can't add an integer and a string
    //Integer result = 20 + tenString;
        
    //This will set result to 30
    Integer result = 20 + Integer.parseInt(tenString);   
    System.out.println("result: "+result);     

    }
}

class primitiveType{
    public static void main(String args[]){                                                                                           //0211ite061
        int a = 10;
        System.out.println("integer value : "+a);//int is used to enter a integer value..
        float b = 10.34f;
        System.out.println("float value : "+b);//float is used for deciamal value..
        byte c = 100;
        System.out.println("byte  value : "+c);//byte is a primitive data type similar to int,
                                               // except it only takes up 8 bits of memory.
        short s = 34;
        System.out.println("short value : "+s);// if we want to save memory and byte is too small we use short..
        long l = 23;
        System.out.println("long value : "+l);//long is the big brother of int. It's stored in 64 bits of memory,
                                              // so it can hold a significantly larger set of possible values.
        double d = 3.123445836384D;
        System.out.println("double value : "+d);//It's stored in 64 bits of memory.
                                                // This means it represents a much larger range of possible numbers than float
        boolean e = true;
        System.out.println("boolean  value : "+e);//The simplest primitive data type is boolean. It can contain only two values: 
                                                  //true or false. It stores its value in a single bit.
        char f = 'a';
        System.out.println("char value : "+f);//char is a 16-bit integer representing a Unicode-encoded character.

    }
}
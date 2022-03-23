class WrapperTest {
    public static void main(String args[]){
	int a = 5;
	Integer i = Integer.valueOf(a);
	Integer j = new Integer(10);
	int b = j.intValue();
	System.out.println("Primitive types:");
	System.out.println(a + " " + b);
	System.out.println("Wrapper object types:");
	System.out.println(i + " " + j);
    }
}

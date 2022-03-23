class ArrayOfObjects {
    int a;
    void get() {
	a = 7;
    }

    public static void main(String[] args) {

	ArrayOfObjects[] s = new ArrayOfObjects[5];
	for(int i = 0; i < 5; i++) {
	    s[i] = new ArrayOfObjects();
	    s[i].get();
	}
	for(int i: s) {
	    System.out.println(i);
        }
    }
}

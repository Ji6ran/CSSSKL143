public class ObjectLists {
    private Object[] myShapes = new Object[100];
    private int numElements = 0;

    public void add(Object nx) {
        for(int i = 0; i < myShapes.length; i++) {
            if(myShapes[i] == null) {
                myShapes[i] = nx;
                break;
            }
        }
        numElements += 1;
    }

    @Override
    public String toString() {
        String retVal = "";
        for(int i = 0; i < myShapes.length; i++) {
            retVal += myShapes[i] + ", ";
        }
        return retVal;
    }

    public static void main(String[] args) {
        IntList a = new IntList();
        a.add(95);
        a.add(100);
        a.add(58);

        System.out.println(a.toString());
        System.out.println(a.sum());
        System.out.println(a.indexOf(100));
        System.out.println(a.indexOf(20));
    }
}

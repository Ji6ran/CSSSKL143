public class IntList {
    private int[] data = new int[100];
    private int numElements = 0;

    public void add(int nx) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == 0) {
                data[i] = nx;
                break;
            }
        }
        numElements += 1;
    }

    @Override
    public String toString() {
        String retVal = "";

        for(int i = 0; i < data.length; i++) {
            retVal += data[i] + ", ";
        }

        return retVal;
    }

    public int sum() {
        int sum = 0;
        for(int element : data) {
            sum += element;
        }

        return sum;
    }

    public int indexOf(int target) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == target) {
                return data[i];
            }
        }
        return -1;
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

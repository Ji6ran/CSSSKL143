/**
 * Created by Jibran on 4/19/19.
 */
public class CharList {
    private char[] storage;
    private int counter = 0;

    public CharList() {
        this.storage = new char[100];
    }

    public CharList(String startStr) {
        this.storage = new char[startStr.length()];

        for(int i = 0; i < this.storage.length; i++) {
            if (startStr.charAt(i) != 0) {
                this.storage[i] = startStr.charAt(i);
                counter++;
            }

        }
    }

    public CharList(CharList other) {
        if (other == null) {
            return;
        }
        this.storage = other.storage;
        this.counter = other.counter;
    }

    public void add(char next) { // we could possibly make it so it dynamically grows but it isn't necessary
        for(int i = 0; i < storage.length; i++) {
            if(storage[i] == 0) {
                storage[i] = next;
                counter++;
                return;
            }
        }
    }

    public char get(int index) {
        return this.storage[index];
    }

    public boolean equals(Object other) {
        if( other== null || !(other instanceof CharList )) {
            return false;
        }

        CharList that = (CharList)other;
        for(int i = 0; i < this.storage.length; i++) {
            if((this.storage[i] == that.storage[i]) && (this.storage.length == that.storage.length)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String holder = "";
        for(int i = 0; i < this.storage.length; i++) {
            if (this.storage[i] == 0) {
                continue;
            }
            holder += this.storage[i];

        }
        int count = 0;
        for(int i = 0; i < this.storage.length; i++) {
            if (this.storage[i] == 0) {
                break;
            }
            count++;
        }

        return holder + " and has a count of: " + count;
    }
}

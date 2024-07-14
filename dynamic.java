import java.util.Arrays;

 class ArrayList {
 Object[] data;
 int size;
public ArrayList() {
    data = new Object[10];
    size = 0;
}

public void add(Object element) {
    if (size == data.length) {
        data = Arrays.copyOf(data, data.length * 2);
    }
    data[size++] = element;
}

public Object get(int index) {
    if (index < 0 || index >= size) {
        throw new ArrayIndexOutOfBoundsException();
    }
    return data[index];
}

public Object remove(int index) {
    if (index < 0 || index >= size) {
        throw new ArrayIndexOutOfBoundsException();
    }
    Object element = data[index];
    for (int i = index; i < size - 1; i++) {
        data[i] = data[i + 1];
    }
    size--;
    return element;
}

public int size() {
    return size;
}
}
class Main
{
public static void main(String args[])
{
ArrayList list = new ArrayList();
list.add("hello");
list.add("world");
System.out.println(list.size()); 
System.out.println(list.get(0)); 
list.remove(0);
System.out.println(list.size());
System.out.println(list.get(0));
}
}
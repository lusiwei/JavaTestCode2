package am.am.arraylist;

public class ArrayList<E> {
    private Object objects[] = new Object[10];
    private int index = 0;

    //add method
    public Boolean add(E e) {
        if (index == objects.length) {
            Object newObjects[] = new Object[(int) (objects.length * 1.5)];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = e;
        index++;
        return true;
    }

    public void add(int index, Object obj) {
        if (index >= objects.length || index < 0) {
//            System.out.println("下标错误");
            throw new IndexOutOfBoundsException("下标不合法");
        } else {
            Object[] newObjects = new Object[(int) (objects.length * 1.5)];
            System.arraycopy(objects, 0, newObjects, 0, index);
            System.arraycopy(objects, index, newObjects, index + 1, objects.length - index);
            newObjects[index] = obj;
            objects = newObjects;
            this.index++;
        }

    }

    public int size() {
        return index;
    }

    public E get(int index) {
        if (index >= objects.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return (E) objects[index];
        }
    }
}

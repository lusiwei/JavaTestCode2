package am.am.arraylist;
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<StringBuilder> arrayList=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder("abcd");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
            arrayList.add(stringBuilder);
        }
        for (int i = 0; i < stringBuilder.length(); i++) {
            System.out.print(stringBuilder.charAt(i));
        }

        ArrayList<Integer> integerArrayList=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerArrayList.add(i);
        }
        integerArrayList.add(1,9);
        System.out.println();
        System.out.println(integerArrayList.size());
        System.out.print("Arr{");
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.print(integerArrayList.get(i)+",");
        }
        System.out.print("}");




    }
}

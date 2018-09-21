package pm;

public class Cola {
    public static void main(String[] args) {
        System.out.println(drinkCola(30,0,0));
    }
    public static int drinkCola(int m,int bottle,int cover){

        if(m<1&&m+bottle<2&&m+cover<3){
            return 0;
        }

        m=m+bottle/2+cover/3;
        bottle=bottle%2;
        cover=cover%3;

        return m+drinkCola(0,m+bottle,m+cover);

    }
}

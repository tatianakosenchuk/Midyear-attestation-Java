import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Lottery result = new Lottery();

        ArrayList<Catalog> toylist = new ArrayList<>();
        toylist.add(new Catalog(1, "Микроскоп", 30));
        toylist.add(new Catalog(2, "Конструктор", 20));
        toylist.add(new Catalog(3, "Мяч", 15));
        toylist.add(new Catalog(4, "Книга", 50));
        toylist.add(new Catalog(5, "Телескоп", 65));

        int wins = 10;

        result.fileWriter(toylist, "lottery_result.txt", wins);
        System.out.println("\nРезультат розыгрыша игрушек можно посмотреть в файле 'lottery_result.txt'\n");

    }

}
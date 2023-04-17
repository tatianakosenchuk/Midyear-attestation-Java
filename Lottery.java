import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class Lottery {

    public PriorityQueue<Catalog> Queue(ArrayList<Catalog> Toys, int number) {

        Comparator<Catalog> comparator = (o1, o2) -> o1.getFrequency() - o2.getFrequency();
        PriorityQueue<Catalog> wins = new PriorityQueue<>(comparator);
        for (int i = 0; i < Toys.size(); i++) {
            for (int j = 0; j < (Toys.get(i).getFrequency() * number / 100); j++) {
                wins.add(Toys.get(i));
            }
        }
        return wins;
    }

    public Catalog lottery(PriorityQueue<Catalog> pq) {
        Catalog result = null;
        Random random = new Random();
        int item = random.nextInt(0, pq.size());
        for (int i = 0; i <= item; i++) {
            result = pq.poll();
        }
        return result;
    }

    public void fileWriter(ArrayList<Catalog> Toys, String text, Integer number) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(text));

        for (int i = 0; i < number; i++) {
            Catalog Toy = lottery(Queue(Toys, number));
            writer.write(Toy.output() + "\n");
        }
        writer.close();
    }
}

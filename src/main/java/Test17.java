import java.util.*;

public class Test17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int j = 0; j < n; j++) {
            int num = sc.nextInt();
            nums[j] = num;
        }
        adjustArray(nums);

    }

    public static List<Integer> adjustArray(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int m : nums) {
            list.add(m);
        }
        Iterator<Integer> iterator = list.iterator();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        while (iterator.hasNext()) {
            queue.offer(iterator.next());
        }

        for (int n = 0; n < queue.size(); n++) {
            int min = queue.poll();
            int count = 0;
            int fristIndex = 0;
            int secondIndex = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == min) {
                    count++;
                    if (count == 1){
                        fristIndex = i;
                    }
                    if (count == 2) {

                        secondIndex = i;
                        break;
                    }
                }
            }
            if (count == 2) {
                list.set(secondIndex, list.get(secondIndex) * 2);
                list.remove(fristIndex);
                PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>();
                for (int j = 0; j < list.size(); j++) {
                    queue2.offer(list.get(j));
                    queue = queue2;
                }
            }


            count = 0;
            n = 0;
        }
        System.out.println(list);
        return list;
    }
}
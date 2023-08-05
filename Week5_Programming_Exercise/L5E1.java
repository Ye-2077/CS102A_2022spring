import java.util.Scanner;

public class L5E1 {
    public static void main(String[] args) {
        float[] grades = new float[10];
        float a;
        int n = 0, m;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 10 scores of these students:");
        while (n < 10) {
            grades[n] = input.nextFloat();
            n++;
        }input.close();
        start:
        for (int i = 8; i >= 0; i--) {
            n = i + 1;
            m = i;
            for (; n <= 9; n++, m++) {
                if (grades[m] > grades[n]) {
                    a = grades[m];
                    grades[m] = grades[n];
                    grades[n] = a;
                } else {
                    continue start;
                }
            }//内循环一次将起点处数字与右边数字比较，若比右边大则与之将换位置，将较大的一方移动到右侧
        }//外循环从右往左选择起点
        a = 0;
        for (float g : grades) {
            a = g + a;
        }
        float average = (a - grades[0] - grades[9]) / 8;
        System.out.printf("Average score is %.2f", average);
    }
}


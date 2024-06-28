package Assignment;

public class CountNoOfDuplicateWords {
    public static void main(String[] args) {
        String s = "java is object oriented language java is programming language java is coding language";
        String[] split = s.split(" ");
        int count = 1;
        for (int i = 0; i < split.length; i++)
        {
            for (int j = i + 1; j < split.length; j++)
            {
                if (split[i].equals(split[j]))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

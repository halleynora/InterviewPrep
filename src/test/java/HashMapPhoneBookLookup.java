import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933

The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
 */
public class HashMapPhoneBookLookup {
    public static void main(String []argh)
    {
        Scanner scan = new Scanner(System.in);
        int contacts = scan.nextInt();
        scan.nextLine();
        Map<String, Integer> map = new HashMap<>(contacts);
        for(int i=0; i < contacts; i++)
        {
            String name = scan.nextLine().trim();
            int phone = scan.nextInt();
            scan.nextLine();
            map.put(name, phone);
        }

        while(scan.hasNext())
        {
            String query = scan.nextLine().trim();
            if(map.containsKey(query))
            {
                System.out.println(query + "=" + map.get(query));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}

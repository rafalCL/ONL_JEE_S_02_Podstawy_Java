package pl.coderslab.strings;

public class Main02 {

    public static void main(String[] args) {
        int position = "abcd".indexOf('c');

        StringBuilder sb = new StringBuilder();

        sb  // []
            .append("t1") // ['t','1']
            .append("t2 ") // ['t','1', 't', '2', ' ']
            .append(10) // ['t','1', 't', '2', ' ', '1', '0']
            .append(' '); // ['t','1', 't', '2', ' ', '1', '0', ' ']

        sb.reverse();
        String built = sb.toString();
        System.out.println(built);
    }

}

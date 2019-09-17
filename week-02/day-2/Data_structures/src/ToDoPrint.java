public class ToDoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        StringBuilder sb = new StringBuilder(todoText);
        todoText = sb.insert(0, "My todo:\n").toString();
        todoText = sb.insert(todoText.length()-1, "\n - Download games").toString();
        todoText = sb.insert(todoText.length()-1, "\n     - Diablo" ).toString();
        todoText = sb.append("     - nem kell inserttel baszakodni").toString();

        System.out.println(todoText);
    }
}


        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo



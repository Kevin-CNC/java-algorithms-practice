import java.util.ArrayList;

public class linearSrc {
    public static void SearchFor(ArrayList<Integer> givenList, int target){
        int positionFound = 0;

        for( int item : givenList ){
            if( item == target ){
                System.out.println("Target (" + target + ") found at position " + positionFound + "!");
            }

            positionFound ++;
        }
    }

    public static void SearchFor(ArrayList<String> givenList, String target){
        int positionFound = 0;

        for( String item : givenList ){
            if( item == target ){
                System.out.println("Target (" + target + ") found at position " + positionFound + "!");
            }

            positionFound ++;
        }
    }
}

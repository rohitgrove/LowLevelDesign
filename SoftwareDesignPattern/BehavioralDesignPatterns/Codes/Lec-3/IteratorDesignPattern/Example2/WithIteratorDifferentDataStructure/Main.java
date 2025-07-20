// Step 9: Client Code (Main Method)
public class Main {
    public static void main(String[] args) {
        System.out.println("Using ArrayList:");
        PlaylistCollection arrayListPlaylist = new ArrayListPlaylist();
        arrayListPlaylist.addVideo("Video A");
        arrayListPlaylist.addVideo("Video B");
        arrayListPlaylist.addVideo("Video C");
        printPlaylist(arrayListPlaylist.createIterator());

        System.out.println("\nUsing LinkedList:");
        PlaylistCollection linkedListPlaylist = new LinkedListPlaylist();
        linkedListPlaylist.addVideo("Video X");
        linkedListPlaylist.addVideo("Video Y");
        linkedListPlaylist.addVideo("Video Z");
        printPlaylist(linkedListPlaylist.createIterator());

        System.out.println("\nUsing HashSet:");
        PlaylistCollection hashSetPlaylist = new HashSetPlaylist();
        hashSetPlaylist.addVideo("Video 1");
        hashSetPlaylist.addVideo("Video 2");
        hashSetPlaylist.addVideo("Video 3");
        printPlaylist(hashSetPlaylist.createIterator());
    }

    private static void printPlaylist(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next());
        }
    }
}

/*
Using ArrayList:
Playing: Video A
Playing: Video B
Playing: Video C

Using LinkedList:
Playing: Video X
Playing: Video Y
Playing: Video Z

Using HashSet:
Playing: Video 2
Playing: Video 1
Playing: Video 3
*/
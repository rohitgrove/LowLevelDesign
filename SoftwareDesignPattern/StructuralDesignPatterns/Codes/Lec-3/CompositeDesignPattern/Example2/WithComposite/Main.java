// Step 4: Use the Composite Pattern
// Client
public class Main {
    public static void main(String[] args) {
        // Create files
        FileSystem file1 = new File("File1.txt");
        FileSystem file2 = new File("File2.txt");
        FileSystem file3 = new File("File3.txt");

        // Create folders
        Folder documents = new Folder("Documents");
        Folder images = new Folder("Images");

        // Build the hierarchy
        documents.add(file1);
        documents.add(file2);
        images.add(file3);

        Folder root = new Folder("Root");
        root.add(documents);
        root.add(images);

        // Display structure
        root.display();
    }
}


/*
OUTPUT:
Folder: Root
    Folder: Documents
        File: File1.txt
        File: File2.txt
    Folder: Images
        File: File3.txt
*/
import java.util.ArrayList;
import java.util.List;

// Step 3: Define Composite (Folder)
// Composite
public class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystem component : children) {
            component.display();
        }
    }
}
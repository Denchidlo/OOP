import java.util.ArrayList;
import java.lang.Class;

public class Directory extends FileSystemItem {
    ArrayList<FileSystemItem> fileSystemItemList;

    public Directory(String name) {
        super(name);
        parent = null;
    }

    public ArrayList<FileSystemItem> getFileSystemItemList() {
        return fileSystemItemList;
    }

    public void Add(FileSystemItem item) {
        fileSystemItemList.add(item);
        if (Directory.class.isInstance(item)) {
            ((Directory)item).parent = this;
        }
    }

    public void Remove(FileSystemItem item) {
        fileSystemItemList.remove(item);
    }

    public void DisplayInformation() {
        System.out.print("Directory name: " + this.name);
        for (FileSystemItem el : fileSystemItemList){
            el.DisplayInformation();
        }
    }
}

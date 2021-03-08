public class FileSystemClient {
    FileSystemItem root;
    FileSystemItem currentItem;

    public FileSystemClient(FileSystemItem item)
    {
        this.root = this.currentItem = item;
    }

    public FileSystemItem getCurrentItem() {
        return currentItem;
    }

    public void moveForwardTo(FileSystemItem item) throws Exception {
        if (Directory.class.isInstance(currentItem)) {
            if (((Directory)currentItem).getFileSystemItemList().contains(item)) {
                currentItem = item;
            }
            else {
                throw new Exception("Directory or file does not exist!");
            }
        }
        else {
            throw new Exception("File has no child's!");
        }
    }

    public void getBack() {
        if (this.currentItem.parent == null)
            return;
        else
            this.currentItem = currentItem.parent;
    }
}

import jdk.jshell.spi.ExecutionControl;

public abstract class FileSystemItem {
    protected String name;
    public FileSystemItem parent;

    public FileSystemItem(String name) {
        this.name = name;
    }

    public abstract void Add(FileSystemItem item) throws ExecutionControl.NotImplementedException;

    public abstract void Remove(FileSystemItem item) throws ExecutionControl.NotImplementedException;

    public abstract void DisplayInformation();
}

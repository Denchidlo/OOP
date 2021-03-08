import jdk.jshell.spi.ExecutionControl;

public class File extends FileSystemItem {
    String innerData;

    public File(String name) {
        super(name);
    }

    public void Add(FileSystemItem item) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("this method shouldn't be called");
    }

    public void Remove(FileSystemItem item) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("this method shouldn't be called");
    }

    public void DisplayInformation() {
        System.out.println("File name: " + this.name);
        System.out.print(this.innerData);
    }
}

public class Program {

    public static void main(String[] args) {

        Task task = new Task();
        for (int i = 0; i < 10; i++) {
            task.showCurrentState();
            task.getNewState();
        }
    }
}

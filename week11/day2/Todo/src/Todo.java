import java.io.IOException;
import java.util.InputMismatchException;

public class Todo {

    public static void main(String[] args) throws IOException {
        Tasks t = new Tasks();

        if (args.length >= 1) {
            if (args[0].equals("-l")) {
                System.out.println(t.listOfTask());
            }

            if (args[0].equals("-a")) {
                if (args.length < 2) {
                    System.out.println("Unable to add: no task provided");
                } else {
                    var task = args[1];
                    t.addTask(task);
                }
            }

            if (args[0].equals("-r")) {
                if (args.length < 2) {
                    System.out.println("Unable to remove: no index provided");
                } else {
                    try {
                        int index = Integer.parseInt(args[1]);
                        t.removeTask(index);
                    } catch (NumberFormatException | InputMismatchException e) {
                        System.err.println("Unable to remove: index is not a number");
                    }
                }
            }

            if (args[0].equals("-c")){
                if (args.length < 2) {
                    System.out.println("Unable to check: no index provided");
                } else {
                    try {
                        int index = Integer.parseInt(args[1]);
                        t.checkTask(index);
                    } catch (NumberFormatException | InputMismatchException e) {
                        System.err.println("Unable to check: index is not a number");
                    }
                }
            }


        } else {
            System.out.println("Command Line Todo application\n" +
                    "=============================");
            System.out.println();
            System.out.println("Command line arguments:");
            System.out.println(
                    """
                                -l   Lists all the tasks
                                -a   Adds a new task
                                -r   Removes an task
                                -c   Completes an task
                            """);
        }

    }
}

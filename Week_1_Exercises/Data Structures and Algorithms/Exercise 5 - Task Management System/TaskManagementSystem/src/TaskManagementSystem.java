class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManagementSystem {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        while (current != null && current.task.getTaskId() != taskId) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        Task t1 = new Task(1, "Design Database", "Pending");
        Task t2 = new Task(2, "Develop API", "In Progress");
        Task t3 = new Task(3, "Test Application", "Completed");

        tms.addTask(t1);
        tms.addTask(t2);
        tms.addTask(t3);

        System.out.println("Tasks after addition:");
        tms.traverseTasks();

        System.out.println("\nSearch for task with ID 2:");
        System.out.println(tms.searchTask(2));

        System.out.println("\nTasks after deletion of task with ID 2:");
        tms.deleteTask(2);
        tms.traverseTasks();
    }
}

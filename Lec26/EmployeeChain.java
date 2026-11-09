package Lec26;

public class EmployeeChain implements TaskHandler{

//    private final Employee employee;
//    private EmployeeChain nextEmployeeChain;
    private final TaskHandler first;
    private final TaskHandler second;

    public EmployeeChain(TaskHandler first, TaskHandler second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean doTask(Task task) {
        boolean result;
        result = first.doTask(task);
        if (!result) {
            result = second.doTask(task);
        }
        return result;
    }
//    public boolean doTask(Task task) {
//        boolean result = false;
//        if (employee.canHandleTask(task)) {
//            employee.doTask(task);
//            result = true;
//        } else if (nextEmployeeChain != null) {
//            result = nextEmployeeChain.doTask(task);
//        }
//        return result;
//        if (task.getStatus() == employee.getTaskStatus()) {
//            employee.doTask(task);
//            return true;
//        } else if (nextEmployeeChain != null) {
//            return nextEmployeeChain.doTask(task);
//        } else {
//            return false;
            //throw new IllegalArgumentException("task can't be handled");
//        }
//    }
//
//    public void setNextEmployee(EmployeeChain nextEmployeeChain) {
//        this.nextEmployeeChain = nextEmployeeChain;
//    }

}

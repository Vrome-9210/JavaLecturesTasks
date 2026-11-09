package Lec26;

import javax.security.auth.callback.Callback;

public class Main {

    static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(factory);

        EmployeeChain chain = new EmployeeChain(
                (TaskHandler) new Designer(callback, "Alycia"),
                new EmployeeChain(
                        (TaskHandler) new Programmer(callback, "John"),
                        (TaskHandler) new Tester(callback, "Steve")
                )
        );
//        EmployeeChain chain = new EmployeeChain(new Designer(callback, "Alicia"));
//        EmployeeChain next = new EmployeeChain(new Programmer(callback, "John"));
//        EmployeeChain last = new EmployeeChain(new Tester(callback, "Steve"));
//        next.setNextEmployee(last);
//        chain.setNextEmployee(next);

        while (true)
            if (!chain.doTask(factory.getTasks()))
//            chain.doTask(factory.getTasks());
            break;
    }
}

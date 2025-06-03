//Single responsibility  Principle emphasizes each class to have one responsibility

//invalid code snippet-invalid because the TaskManager class handles 3 responsibilities.
public class TaskManager
{
    public void addTask( String task){}
    public void saveTask(){}
    public void login(){}
}

//valid code snippet-each class has its own responsibility
public class TaskManager{
    public void addTask(String task){}
}
 public class DatabaseManager{
    public void saveTask(String task ){}
}
public class AuthManager{
    public void login(){}

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Conditional operator tasks:");
        ConditionsTasks conditionstasks = new ConditionsTasks();
        conditionstasks.main();

        System.out.println("2. Loop operators with precondition and postcondition tasks.");
        WhileDoWhileTasks whileDoWhileTasks = new WhileDoWhileTasks();
        whileDoWhileTasks.main();

        System.out.println("3. Loop operator with parameter");
        LoopTasks loopTasks = new LoopTasks();
        loopTasks.main();

        System.out.println("4. Arrays");
        ArraysTasks arraystasks = new ArraysTasks();
        arraystasks.main();
    }
}

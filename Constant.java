public class Constant {
    public static void main(String[] args) {
        // Create a variable
        int variable = 10;
        System.out.println("Variable value: " + variable);

        // Convert the variable into a constant
        final int CONSTANT = variable;
        System.out.println("Constant value: " + CONSTANT);

        // Try to change the constant (this will cause a compiler error)
        // CONSTANT = 20; // Uncommenting this line will cause a compiler error

        System.out.println("Constant value after attempting to change: " + CONSTANT);
    }
}
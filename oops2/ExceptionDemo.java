class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
    }
}


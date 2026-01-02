class CmdArgs {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int len = args.length > 1 ? Integer.parseInt(args[1]) : num;

        for (int i = 1; i <= len; i++)
            System.out.println(num * i);
    }
}


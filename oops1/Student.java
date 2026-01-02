class Student {
    int admin_no;
    String stu_name;
    String course_joined;
    double fees_paid;

    Student(int admin_no, String name) {
        this(admin_no, name, "JAVA");
    }

    Student(int admin_no, String name, String course) {
        this.admin_no = admin_no;
        this.stu_name = name;
        this.course_joined = course;
    }

    double getTotalFee() {
        return course_joined.equals("PYTHON") ? 7500 : 10000;
    }

    double getFeePaid() {
        return fees_paid;
    }

    double getDue() {
        return getTotalFee() - fees_paid;
    }

    void payment(double amt) {
        fees_paid += amt;
    }
}


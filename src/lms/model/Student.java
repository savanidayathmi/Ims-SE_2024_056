package lms.model;

public class Student extends Member {

    private static final int STUDENT_BORROW_LIMIT = 3;

    public Student(String memberId, String name) {
        super(memberId, name, STUDENT_BORROW_LIMIT);
    }
}
package bai_15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException() {
        super("not a triangle");
    }
}

package lox;

class Interpreter implements Expr.Visitor<Object> {
    @Override
    public Object visitBinaryExpr(Expr.Binary expr) {
        return new Object();
    }

    @Override
    public Object visitGroupingExpr(Expr.Grouping expr) {
        return evaluate(expr.expression);
    }

    public Object visitLiteralExpr(Expr.Literal expr) {
        return expr.value;
    }

    public Object visitUnaryExpr(Expr.Unary expr) {
        return new Object();
    }

    private Object evaluate(Expr expr) {
        return expr.accept(this);
    }
}
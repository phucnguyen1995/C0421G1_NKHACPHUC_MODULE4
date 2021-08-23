package vn.codegym.model.repo;



import org.springframework.stereotype.Repository;



@Repository
public class RepositoryImpl implements IRepository {

    @Override
    public double result(double a, char operator, double b) {
        double result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;

        }
        return result;
    }
}

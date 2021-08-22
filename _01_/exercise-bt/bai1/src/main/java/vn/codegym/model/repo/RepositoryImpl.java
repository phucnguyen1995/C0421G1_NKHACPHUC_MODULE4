package vn.codegym.model.repo;


import org.springframework.stereotype.Repository;

@Repository
public class RepositoryImpl implements IRepository {
    @Override
    public double convert(double usa, double rate) {
        return usa*rate;
    }
}

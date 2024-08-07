public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulate finding a customer from a database
        return "Customer with ID " + id;
    }
}

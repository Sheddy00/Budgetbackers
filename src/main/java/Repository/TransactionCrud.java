package Repository;

import Model.Currency;
import Model.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransactionCrud implements CrudOperation<Transaction>{
    private Connection connection;
    public TransactionCrud (Connection connection) {
        this.connection = connection;
    }
    @Override
    public List<Transaction> findAll() throws SQLException {
        List<Transaction> transactions = new ArrayList<>();
        String query = "SELECT * FROM transactions";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                long senderAccountId = resultSet.getLong("sender_account_id");
                long receiverAccountId = resultSet.getLong("receiver_account_id");
                double amount = resultSet.getDouble("amount");
                String currency = resultSet.getString("currency");
                String description = resultSet.getString("description");

                Transaction transaction = new Transaction(id, senderAccountId, receiverAccountId, amount, currency, description);
                transactions.add(transaction);
            }
        }
        return transactions;
    }

    @Override
    public List<Transaction> saveAll(List<Transaction> toSave) {
        List<Transaction> savedTransactions = new ArrayList<>();
        String query = "INSERT INTO transactions (id, sender_account_id, receiver_account_id, amount, currency, description) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            for (Transaction transaction : toSave) {
                statement.setInt(1, transaction.getId());
                statement.setLong(2, transaction.getSenderAccountId());
                statement.setLong(3, transaction.getReceiverAccountId());
                statement.setDouble(4, transaction.getAmount());
                statement.setString(5, transaction.getCurrency());
                statement.setString(6, transaction.getDescription());

                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    savedTransactions.add(transaction);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return savedTransactions;
    }

    @Override
    public Transaction save(Transaction toSave) {
        String query = "INSERT INTO transactions (id, sender_account_id, receiver_account_id, amount, currency, description) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, toSave.getId());
            statement.setLong(2, toSave.getSenderAccountId());
            statement.setLong(3, toSave.getReceiverAccountId());
            statement.setDouble(4, toSave.getAmount());
            statement.setString(5, toSave.getCurrency());
            statement.setString(6, toSave.getDescription());

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                return toSave;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Transaction delete(Transaction toDelete) {
        String query = "DELETE FROM transactions WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, toDelete.getId());
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                return toDelete;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

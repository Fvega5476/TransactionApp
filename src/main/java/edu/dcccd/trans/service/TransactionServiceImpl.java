package edu.dcccd.trans.service;

import edu.dcccd.trans.entity.SingletonTransaction;
import edu.dcccd.trans.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService
{
    @Override
    public void createTransaction(Transaction transaction)
    {
        SingletonTransaction.getInstance().transactions.add(transaction);
    }
    @Override
    public List<Transaction> getAllTransaction()
    {
        return SingletonTransaction.getInstance().transactions;
    }
}
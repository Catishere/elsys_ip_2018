package org.elsys.common.dao;

import org.elsys.common.entity.Stock;
import org.elsys.common.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StockDao implements StockDaoInterface {

    private Session currentSession;
    private Transaction currentTransaction;

    public Session openCurrentSessionWithTransaction(){
        currentSession= HibernateUtil.getSessionFactory().openSession();
        currentTransaction=currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSessionWithTransaction(){
        currentTransaction.commit();
        currentSession.close();
    }

    public Session openCurrentSession(){
        currentSession= HibernateUtil.getSessionFactory().openSession();
        return currentSession;
    }

    public void closeCurrentSession(){
        currentSession.close();
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    @Override
    public void insert(Stock stock) {
        getCurrentSession().save(stock);
    }

    @Override
    public void update(Stock stock) {
        getCurrentSession().update(stock);
    }

    @Override
    public void delete(long id) {
        getCurrentSession().delete(id);
    }

    @Override
    public Stock findById(long id) {
        //TODO
        return null;
    }

    @Override
    public Stock findByStockName(String name) {
        //TODO
        return null;
    }
}

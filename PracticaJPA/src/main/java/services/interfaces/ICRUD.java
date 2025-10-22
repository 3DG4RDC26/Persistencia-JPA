package services.interfaces;

public interface ICRUD {
    <T> List<T> getAll(String nameQuery, Class<T> clazz );

    <T>void insert(T entity);
    <T>void update(T entity);
    <T>void delete(T entity);
    <T>T findById(Interger Id, Class<T> clazz);
}
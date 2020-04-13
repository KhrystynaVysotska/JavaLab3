package ua.lviv.iot.business;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<T> {
     protected abstract JpaRepository<T, Integer> getJpaRepository();
     
     public List<T> findAll() {
         return getJpaRepository().findAll();
     }

     public T getById(Integer id) {
             return getJpaRepository().findById(id).get();
     }

     public T saveToDatabase(T newObject) {
         return getJpaRepository().save(newObject);
     }

     public boolean deleteById(Integer id) {
         if (getJpaRepository().existsById(id)) {
             getJpaRepository().deleteById(id);
             return true;
         } else {
             return false;
         }
     }

     public T update(Integer id, T object) {
         if (getJpaRepository().existsById(id)) {
             return getJpaRepository().save(object);
         } else {
             return null;
         }
     }
}

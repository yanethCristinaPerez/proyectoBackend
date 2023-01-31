package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.CatalogEntity;
import com.proyecto.proyecto.model.UserEntity;
import com.proyecto.proyecto.repository.CatalogRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CatalogService implements CatalogRepository{

    @Autowired
    private CatalogRepository catalogRepository;


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void flush() {

    }

    @Override
    public <S extends CatalogEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CatalogEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CatalogEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CatalogEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public CatalogEntity getById(Long aLong) {
        return null;
    }

    @Override
    public CatalogEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends CatalogEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CatalogEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CatalogEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CatalogEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CatalogEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CatalogEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CatalogEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends CatalogEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CatalogEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CatalogEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<CatalogEntity> findAll() {
        return catalogRepository.findAll();
    }

    @Override
    public List<CatalogEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(CatalogEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CatalogEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<CatalogEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CatalogEntity> findAll(Pageable pageable) {
        return null;
    }



    @Override
    public List<CatalogEntity> getByGender(String gender) {
         return catalogRepository.getByGender(gender);

    }

}

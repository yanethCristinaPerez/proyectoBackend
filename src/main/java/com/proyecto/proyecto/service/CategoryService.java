package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.CategoryEntity;
import com.proyecto.proyecto.repository.CategoryRepository;
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
public class CategoryService  implements  CategoryRepository{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends CategoryEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CategoryEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CategoryEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CategoryEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public CategoryEntity getById(Long aLong) {
        return null;
    }

    @Override
    public CategoryEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends CategoryEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CategoryEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CategoryEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CategoryEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CategoryEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CategoryEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CategoryEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends CategoryEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CategoryEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CategoryEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<CategoryEntity> findAll() {
        return null;
    }

    @Override
    public List<CategoryEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(CategoryEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CategoryEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<CategoryEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CategoryEntity> findAll(Pageable pageable) {
        return null;
    }
}

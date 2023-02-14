package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.ShoppingCartDetailEntity;
import com.proyecto.proyecto.repository.ShoppingCartDetailRepository;
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
public class ShoppingCartDetailService implements ShoppingCartDetailRepository{

    @Autowired
    private ShoppingCartDetailRepository shoppingCartDetailRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends ShoppingCartDetailEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ShoppingCartDetailEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ShoppingCartDetailEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ShoppingCartDetailEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public ShoppingCartDetailEntity getById(Long aLong) {
        return null;
    }

    @Override
    public ShoppingCartDetailEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends ShoppingCartDetailEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ShoppingCartDetailEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ShoppingCartDetailEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ShoppingCartDetailEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ShoppingCartDetailEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ShoppingCartDetailEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ShoppingCartDetailEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ShoppingCartDetailEntity> S save(S entity) {
        return shoppingCartDetailRepository.save(entity);
    }

    @Override
    public <S extends ShoppingCartDetailEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ShoppingCartDetailEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<ShoppingCartDetailEntity> findAll() {
        return null;
    }

    @Override
    public List<ShoppingCartDetailEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(ShoppingCartDetailEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ShoppingCartDetailEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ShoppingCartDetailEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ShoppingCartDetailEntity> findAll(Pageable pageable) {
        return null;
    }
}

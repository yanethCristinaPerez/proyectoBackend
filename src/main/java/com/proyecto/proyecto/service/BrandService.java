package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.BrandEntity;
import com.proyecto.proyecto.repository.BrandRepository;
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
public class BrandService implements BrandRepository {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends BrandEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends BrandEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<BrandEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BrandEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public BrandEntity getById(Long aLong) {
        return null;
    }

    @Override
    public BrandEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends BrandEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BrandEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BrandEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends BrandEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return brandRepository.findAll(example,pageable);
    }

    @Override
    public <S extends BrandEntity> long count(Example<S> example) {
        return brandRepository.count(example);
    }

    @Override
    public <S extends BrandEntity> boolean exists(Example<S> example) {
        return brandRepository.exists(example);
    }

    @Override
    public <S extends BrandEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends BrandEntity> S save(S entity) {
        return brandRepository.save(entity);
    }

    @Override
    public <S extends BrandEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BrandEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<BrandEntity> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public List<BrandEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        brandRepository.deleteById(aLong);
    }

    @Override
    public void delete(BrandEntity entity) {
        brandRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends BrandEntity> entities) {
        brandRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        brandRepository.deleteAll();
    }

    @Override
    public List<BrandEntity> findAll(Sort sort) {
        return brandRepository.findAll(sort);
    }

    @Override
    public Page<BrandEntity> findAll(Pageable pageable) {
        return null;
    }
}

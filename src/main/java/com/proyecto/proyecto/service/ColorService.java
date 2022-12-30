package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.ColorEntity;
import com.proyecto.proyecto.repository.ColorRepository;
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
public class ColorService implements ColorRepository{

    @Autowired
    private ColorRepository colorRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends ColorEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ColorEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ColorEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ColorEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public ColorEntity getById(Long aLong) {
        return null;
    }

    @Override
    public ColorEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends ColorEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ColorEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ColorEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ColorEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ColorEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ColorEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ColorEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ColorEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ColorEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ColorEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<ColorEntity> findAll() {
        return null;
    }

    @Override
    public List<ColorEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(ColorEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ColorEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ColorEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ColorEntity> findAll(Pageable pageable) {
        return null;
    }
}
